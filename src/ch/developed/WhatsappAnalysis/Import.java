package ch.developed.WhatsappAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Stalder
 * @version 12.11.2019
 */
public class Import {

	// 22.09.19, is the format - first two char must be 2 long, followed by a ","
	// etc.
	private final String regexDateV2 = "\\d{1,2}\\.{1}\\d{1,2}\\.{1}\\d{1,2}\\,.*";
	private final String regexMedia = "\\d{1,2}\\.{1}\\d{1,2}\\.{1}\\d{1,2}\\,.*<Medien ausgeschlossen>";

	private static List<Message> messageList = new ArrayList<>();

	public List<Message> precessFileData(String filePath) throws IOException {
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8));
		String singleLine;
		while ((singleLine = br.readLine()) != null) {
			if (singleLine.matches(regexMedia)) {
				// saves message with media
				String dateAsString = singleLine.substring(0, 15);
				String[] stringSplitForUser = singleLine.split(":");
				int year = Integer.parseInt(dateAsString.substring(6, 8));
				int month = Integer.parseInt(dateAsString.substring(3, 5));
				int day = Integer.parseInt(dateAsString.substring(0, 2));
				int hour = Integer.parseInt(dateAsString.substring(10, 12));
				int minute = Integer.parseInt(dateAsString.substring(13, 15));
				String user = stringSplitForUser[1].substring(5);
				String text = "";
				Message Message = new Message(year, month, day, hour, minute, user, text, true);
				messageList.add(Message);
			} else if (singleLine.matches(regexDateV2)) {
				// saves message with text
				String dateAsString = singleLine.substring(0, 15);
				String[] stringSplitForUser = singleLine.split(":");
				int year = Integer.parseInt(dateAsString.substring(6, 8));
				int month = Integer.parseInt(dateAsString.substring(3, 5));
				int day = Integer.parseInt(dateAsString.substring(0, 2));
				int hour = Integer.parseInt(dateAsString.substring(10, 12));
				int minute = Integer.parseInt(dateAsString.substring(13, 15));
				String user = stringSplitForUser[1].substring(5);
				String text = "";
				if (stringSplitForUser.length >= 3) {
					text = stringSplitForUser[2];
				}
				Message Message = new Message(year, month, day, hour, minute, user, text, false);
				messageList.add(Message);
				// System.out.println(stringSplitForUser[1].substring(5));

			} else {
				// its still text
				// add the hole line as text to the last added object in arraylist
				Message lastAddedElement = messageList.get(messageList.size() - 1);
				lastAddedElement.setText(lastAddedElement.getText() + singleLine);
				messageList.set(messageList.size() - 1, lastAddedElement);
			}

		}
		return messageList;
	}

}

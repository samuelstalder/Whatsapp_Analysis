import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Analysis {

	// 22.09.19, is the format - first two char must be 2 long, followed by a ","
	// etc.
	private final String regexDateV2 = "\\d{1,2}\\.{1}\\d{1,2}\\.{1}\\d{1,2}\\,.*";

	private static List<Message> messageList = new ArrayList<>();
	private static List<Word> wordList = new ArrayList<>();
	private String notAllLowerCaseLetterRegex = "[^a-zäöü ]*";

	private void precessFileData(String filePath) throws IOException {
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8));

		String singleLine;
		while ((singleLine = br.readLine()) != null) {
			if (singleLine.matches(regexDateV2)) {
				// new line (may still have errors)
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
				Message Message = new Message(year, month, day, hour, minute, user, text);
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
	}

	private void processMessages() {
		String largeString = "";
		for (int i = 0; i < messageList.size(); i++) {
			largeString += messageList.get(i).getText();
		}
		largeString = largeString.toLowerCase();
		// remove all special character
		largeString = largeString.replaceAll(notAllLowerCaseLetterRegex, "");

		String[] wordArray = largeString.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			if (foundSameWord(wordArray[i])) {
				updateAmountOfWord(wordArray[i]);
			} else {
				wordList.add(new Word(wordArray[i], 1));
			}
		}
	}

	private boolean foundSameWord(String word) {
		for (Word w : wordList) {
			if (w.getName().equals(word)) {
				return true;
			}
		}
		return false;
	}

	private void updateAmountOfWord(String word) {
		for (Word w : wordList) {
			if (w.getName().equals(word)) {
				w.counterUpAmount();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Analysis analysis = new Analysis();
		String filePath = "test.txt";
		analysis.precessFileData(filePath);
		analysis.processMessages();
		Request req = new Request(messageList, wordList);
		List<Word> top50Words = req.mostWrittenWords(50);
		Output out = new Output();
		out.printWordList(top50Words, wordList.size());
		out.printActiveHour(req.activeHour());
	}

}

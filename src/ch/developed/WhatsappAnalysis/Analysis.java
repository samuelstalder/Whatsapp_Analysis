package ch.developed.WhatsappAnalysis;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Samuel Stalder
 * @version 12.11.2019
 */
public class Analysis {

	private static List<Message> messageList = new ArrayList<>();


	public static void main(String[] args) throws IOException {
		Analysis analysis = new Analysis();
		Parser parser = new Parser();
		Output output = new Output();
		//List<Word> top50Words = req.mostWrittenWords(50);
		//output.printWordList(top50Words, wordList.size());
		//output.printActiveHour(req.activeHour());
		output.welcome();
		while(true) {
			Command command = parser.readInput();
			analysis.triggerCommand(command);
		}		
	}
	
	public void triggerCommand(Command command) {
		Import imp = new Import();
		Output output = new Output();
		Request request = new Request(messageList);
		switch (command.getWord()) {
		case Command.IMPORT_FILE:
			try {
				messageList = imp.precessFileData(command.getParam1());
				output.importFile();
			} catch (IOException e) {
				output.wrongFile();
			}
			break;
		case Command.HELP:
			output.help();
			break;
		case Command.NAMES:
			HashMap<String, Integer> names = request.usernames();
			output.usernames(names);
			break;
		case Command.ANALYSIS:
			List<Word> wordList = request.analysis();
			output.analysis(wordList, request.totalWords());
			break;
		case Command.START_GAME:
			Game wGuessingGame = new Game();
			wGuessingGame.start();
			break;
		case Command.CREDITS:
			output.credits();
			break;
		case Command.SEARCH_WORD:
			request.searchWord(command.getParam1(), command.getParam3());
			break;
		case Command.TIMESPAN:
			output.timeSpan(request.timeSpan());
			break;
		case Command.TIMETABLE:
			output.timeTable(request.timeTable(command.getParam1()));
			break;
		case Command.TOTAL_LETTERS:
			output.totalLetters(request.totalLetters(command.getParam1()));
			break;
		case Command.TOTAL_WORDS:
			output.totalWords(request.totalWords(command.getParam1()));
			break;
		case Command.TOTAL_MESSAGES:
			output.totalMessages(request.totalMessages(command.getParam1()));
			break;
		case Command.TOTAL_MEDIA:
			output.totalMedia(request.totalMedia(command.getParam1()));
		case Command.FAVORITE_EMOJI:
			output.favoriteEmoji(request.favoriteEmoji());
			break;
		case Command.FAVORITE_WORDS:
			output.favoriteWords(request.favoriteWords());
			break;
		case Command.INVALID_COMMAND:
			output.wrongCommand();
			break;
		case Command.INVALID_PARAM:
			output.wrongParam();
			break;
		default:
			output.wrongCommand();
			break;
		}
	}

}

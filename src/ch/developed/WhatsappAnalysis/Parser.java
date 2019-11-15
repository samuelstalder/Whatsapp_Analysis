package ch.developed.WhatsappAnalysis;
import java.util.Scanner;

/**
 * @author Samuel Stalder
 * @version 12.11.2019
 */
public class Parser {

	
	private Scanner scanner;
	Command command;

	public Parser() {
		command = new Command();
		scanner = new Scanner(System.in);
	}
	
	public Command readInput() {
		String input = scanner.nextLine();
		return getCommand(input);
	}
	
	public Command getCommand(String input) {
		String[] word = input.split(" ");
		Command command = new Command();

		if (word.length >= 1) {
			switch (word[0]) {
			case Command.IMPORT_FILE:
				command.setWord(Command.IMPORT_FILE);
				command.setParam1(word[1]);
				break;
			case Command.HELP:
				command.setWord(Command.HELP);
				break;
			case Command.NAMES:
				command.setWord(Command.NAMES);
				break;
			case Command.ANALYSIS:
				command.setWord(Command.ANALYSIS);
				break;
			case Command.START_GAME:
				command.setWord(Command.START_GAME);
				break;	
			case Command.CREDITS:
				command.setWord(Command.CREDITS);
				break;
			case Command.SEARCH_WORD:
				command.setWord(Command.SEARCH_WORD);
				command.setParam1(word[1]);
				if (word.length >= 3) {
					command.setParam3(word[2]);
				}
				break;
			case Command.TIMESPAN:
				command.setWord(Command.TIMESPAN);
				break;
			case Command.TIMETABLE:
				command.setWord(Command.TIMETABLE);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
				break;
			case Command.TOTAL_LETTERS:
				command.setWord(Command.TOTAL_LETTERS);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
				break;
			case Command.TOTAL_WORDS:
				command.setWord(Command.TOTAL_WORDS);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
				break;
			case Command.TOTAL_MESSAGES:
				command.setWord(Command.TOTAL_MESSAGES);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
				break;
			case Command.TOTAL_MEDIA: 
				command.setWord(Command.TOTAL_MEDIA);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
				break;
			case Command.FAVORITE_EMOJI:
				command.setWord(Command.FAVORITE_EMOJI);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
				break;
			case Command.FAVORITE_WORDS:
				command.setWord(Command.FAVORITE_WORDS);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
			case Command.AVERAGE_MESSAGE_LENGTH:
				command.setWord(Command.AVERAGE_MESSAGE_LENGTH);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
				break;
			case Command.AVERAGE_MESSAGE_PER_DAY:
				command.setWord(Command.AVERAGE_MESSAGE_PER_DAY);
				break;
			case Command.MEDIA_PER_MESSAGE:
				command.setWord(Command.MEDIA_PER_MESSAGE);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
				break;
			case Command.MESSAGE_PER_PERSON:
				command.setWord(Command.MESSAGE_PER_PERSON);
				if (word.length >= 2) {
					command.setParam1(word[1]);
				}
				break;
			case Command.MESSAGE_PER_DAY:
				command.setWord(Command.MESSAGE_PER_DAY);
				if (word.length >= 2) {
					command.setParam1(getFirstTextInBrackets(input));
				}
			default:
				command.setWord(Command.INVALID_COMMAND);
				break;
			}
		}
		return command;
	}
	
	private boolean isNumeric(String stringNumber) {
		return stringNumber.matches("-?\\d+(\\.\\d+)?");
	}

	private String getFirstTextInBrackets(String input) {
		String[] splitedInput = input.split("\"");
		if (splitedInput.length >= 2) {
			return splitedInput[1];
		} else {
			return Command.INVALID_PARAM;
		}
	}
}

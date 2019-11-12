import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Output {

	public void printActiveHour(int hour) {
		//double probability = Double.valueOf(100.0 / numberOfAllMessages * numberOfMessages);
		System.out.printf("Most active hour: %d ", hour);
	}
	
	public void wrongCommand() {
		System.out.println("There is something wrong with this command");
		System.out.println("Use <help> to get e list of all commands and there params");
	}
	
	public void wrongParam() {
		System.out.println("The command is correct but not the param");
		System.out.println("Use <help> to get e list of all commands and there params");
	}
	
	public void wrongFile() {
		System.out.println("Loading data was not successful");
	}
	
	public void usernameNotFound() {
		System.out.println("This user is not in this chat or has never written something");
		System.out.println("Use <username> to get a list of all participants");
	}
	
	public void importFile() {
		System.out.println("Successful import. Dataanalysis is ready to start.");
	}
	
	public void help() {
		System.out.println(""
				+ "To import data from a file: importfile <path>\r\n" + 
				"General information about the commands: help\r\n" + 
				"Get usernames: names	\r\n" + 
				"General information: analysis <username>\r\n" + 
				"Play the w-guessing-game: startgame\r\n" + 
				"Information about the app: credits\r\n" + 
				"Search a word in messages: searchword <word> <username>\r\n" + 
				"");
	}
	
	public void usernames(HashMap<String, Integer> names) {
		System.out.println("List of all participants in this chat:");
		Iterator it = names.entrySet().iterator();
	    while (it.hasNext()) {
	    	HashMap.Entry name = (HashMap.Entry)it.next();
	    	System.out.println(name.getKey());
	    }
	}
	
	public void analysis(List<Word> wordList, int numberOfAllWords) {	
		for (int i = 0; i < wordList.size(); i++) {
			String name = wordList.get(i).getName();
			int amount = wordList.get(i).getAmount();
			double probability = Double.valueOf(100.0 / numberOfAllWords * amount);
			System.out.println(String.format("%d: %4f Amount: %d, Word: %s", i+1, probability, amount, name));
		}
	}
	

	
	public void credits() {
		System.out.println("Name: WhatsappAnalysis\r\n "
				+ "Version: 0.1 (10.11.2019)\r\n"
				+ "Author: Samuel Stalder");
	}
	
	public void searchWord(Message message) {
		
	}
	
	public void timeSpan(String date) {
		System.out.println("This chat was lounched on: " + date);
	}
	
	
	/**
	 * 0: 100 messages (24:00 - 1:00)
	 * 1: 221 messages (1:00 - 2:00)
	 * 2...
	 * @param timeTable
	 */
	public void timeTable(int[] timeArray) {
		for (int i = 0; i < timeArray.length; i++) {
			System.out.println(i + ": " + timeArray[i] + " messages (" + i + ":00 - " + (i+1) + ":00)");
		}
	}
	
	public void totalWords(int amount) {
		System.out.println("Amount of written words: " + amount);
	}
	
	public void totalMessages(int amount) {
		System.out.println("Amount of written messages: " + amount);
	}
	
	public void totalLetters(int amount) {
		System.out.println("Amount of written letters: " + amount);
	}
	
	public void favoriteEmoji(String emoji) {
		
	}
	
	public void activeDay(int year, int month, int day) {
		System.out.println("The most active day: "+ day +":" + month + ":" + year);
	}
	
	/**
	 * Key
	 * ich
	 * du
	 * hab
	 * ...
	 */
	public void favoriteWords(List<String> words) {
		System.out.println("List of the most written words:");
		for (String word : words) {
			System.out.println(word);
		}
	}
	
	public void averageMessageLength(int amountOfWords) {
		System.out.println("The average message has " + amountOfWords + " words in it.");
	}
	
	public void averageMessagePerDay(int amountOfMessages) {
		System.out.println("The average posting is " + amountOfMessages + " messages a day");
	}
	
	public void welcome() {
		System.out.println("Hello there :D");
		System.out.println("Interested about some awesome facts about your chat?");
		System.out.println("First of all: Use the import command to specify your chat.");
	}
	
	public void startGame() {
		
	}
	
	public void gameQuestion(String question, String option1, String option2, String option3) {
		System.out.println(question);
		System.out.println("A: " + option1);
		System.out.println("B: " + option2);
		System.out.println("C: " + option3);
	}
}

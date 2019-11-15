package ch.developed.WhatsappAnalysis;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Samuel Stalder
 * @version 12.11.2019
 */
public class User {
	private String name;
	private int numberOfWords;
	private int numberOfMessages;
	private int favouriteEmoji;
	private List<Word> favouriteWords;

	public User(List<Message> messageList, String name) {
		// filter user specific data
		this.name = name;
		List<Message> filteredMessageList = getAllFilteredMessages(messageList);
		numberOfMessages = filteredMessageList.size();
		printResults();
	}

	private List<Message> getAllFilteredMessages(List<Message> messageList) {		
		List<Message> filteredMessageList = new ArrayList<>();
		for (Message message : messageList) {
			String messageWriter = message.getUser();
			if (messageWriter.equals(name)) {
				filteredMessageList.add(message);
			}
		}
		return filteredMessageList;
	}
	
	private void printResults() {
		System.out.println(String.format("Analysis User %s", name));
		System.out.println(String.format("Analysis User %d", numberOfMessages));
	}

	public String getName() {
		return name;
	}

	public int getNumberOfWords() {
		return numberOfWords;
	}

	public int getNumberOfMessages() {
		return numberOfMessages;
	}

	public int getFavouriteEmoji() {
		return favouriteEmoji;
	}

	public List<Word> getFavouriteWords() {
		return favouriteWords;
	}

}

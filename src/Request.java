import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Request {
	List<Message> messageList = new ArrayList<>();
	List<Word> wordList = new ArrayList<>();
	private final static String ALL_USER = null;
	String user = ALL_USER;
	
	public Request(List<Message> dataSetList, List<Word> wordList) {
		this.messageList = dataSetList;
		this.wordList = wordList;
	}
	
	public List<Message> searchInDataSetForAWord(String word) {
		return null;
	}
	
	public List<Word> mostWrittenWords(int numberOfWords) {
		sortWordListByFrequency();
		return wordList.subList(0, numberOfWords);
	}
	
	public List<Word> mostWrittenWords(int numberOfWords, String user) {
		sortWordListByFrequency();
		return wordList.subList(0, numberOfWords);
	}
	
	public List<Word> favouriteEmoji(int numberOfEmojis) {
		return null;
	}
	
	public int activeHour() {
		int[] hour = new int[24];
		for (Message m : messageList) {
			hour[m.getHour()] += 1;
		}
		int maxHour = -1;
		for (int i = 0; i < hour.length; i++) {
			if(hour[i] > maxHour) {
				maxHour = i;
			}
		}
		//Todo: return class with numberofmessage and active hour
		int numberOfMessage = hour[maxHour];
		return maxHour;
	}
	
	public int numberOfWords() {
		return wordList.size();
	}
	
	public List<String> listOfAllParticipants() {
		//todo: search for names
		List<String> nameList = new ArrayList<>();
		nameList.add("Samuel");
		nameList.add("Lina");
		return nameList;
	}
	
	private void sortWordListByName() {
		Collections.sort(wordList, new Comparator<Word>() {
			public int compare(Word w1, Word w2) {
				return w1.getName().compareToIgnoreCase(w2.getName());
			}
		});
	}

	private void sortWordListByFrequency() {
		Collections.sort(wordList, new Comparator<Word>() {
			public int compare(Word w2, Word w1) {
				return Integer.compare(w1.getAmount(), w2.getAmount());
			}
		});
	}
	

}

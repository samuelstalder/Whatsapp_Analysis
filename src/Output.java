import java.util.List;

public class Output {
	
	// move to output class
	public void outputTextanalysis() {
		/*
		int amountOfMessages = messageList.size();
		int amountOfWords = 0;
		int amountOfWordsFromUser1 = 0;
		int amountOfWordsFromUser2 = 0;
		System.out.println("Amount of messages: " + amountOfMessages);
		System.out.println(messageList.get(1000).getDate());
		System.out.println(messageList.get(1000).getTime());
		System.out.println(messageList.get(1000).getUser());
		System.out.println(messageList.get(1000).getText());
		*/
	}

	// move to Output class
	public void printWordList(List<Word> wordList, int numberOfAllWords) {	
		for (int i = 0; i < wordList.size(); i++) {
			String name = wordList.get(i).getName();
			int amount = wordList.get(i).getAmount();
			double probability = Double.valueOf(100.0 / numberOfAllWords * amount);
			System.out.println(String.format("%d: %4f Amount: %d, Word: %s", i+1, probability, amount, name));
		}
	}
	
	public void printActiveHour(int hour) {
		//double probability = Double.valueOf(100.0 / numberOfAllMessages * numberOfMessages);
		System.out.printf("Most active hour: %d ", hour);
	}
}

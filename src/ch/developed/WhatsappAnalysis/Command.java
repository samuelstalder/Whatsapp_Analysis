package ch.developed.WhatsappAnalysis;


/**
 * @author Samuel Stalder
 * @version 12.11.2019
 */
public class Command {
	//general
	public static final String IMPORT_FILE = "import";
	public static final String HELP = "help";
	public static final String NAMES = "names";
	public static final String ANALYSIS = "analysis";
	public static final String START_GAME = "startgame";
	public static final String CREDITS = "credits";
	public static final String SEARCH_WORD = "searchword";
	//time
	public static final String TIMESPAN = "timespan";
	public static final String TIMETABLE = "timetable";
	//total numbers
	public static final String TOTAL_MESSAGES = "totalmessages";
	public static final String TOTAL_WORDS = "totalwords";
	public static final String TOTAL_LETTERS = "totalletters";
	public static final String TOTAL_MEDIA = "totalmedia";
	//tops
	public static final String FAVORITE_EMOJI = "emoji";
	public static final String FAVORITE_WORDS = "wordlist";
	public static final String ACTIVE_HOUR = "activehour";
	//averages
	public static final String AVERAGE_MESSAGE_LENGTH = "avmessagelength";
	public static final String AVERAGE_MESSAGE_PER_DAY = "avmessageperday";
	//comparison
	public static final String MEDIA_PER_MESSAGE = "mediapermessage";
	public static final String MESSAGE_PER_PERSON = "messageperperson";
	public static final String MESSAGE_PER_DAY = "messagesperday";
	public static final String CHOICE_A = "A";
	public static final String CHOICE_B = "B";
	public static final String CHOICE_C = "C";
	
	
	public static final String INVALID_COMMAND = "-1";
	public static final String INVALID_PARAM = "-2";
	public static final String INVALID_USERNAME = "-3";
	public static final int EMPTY_INT = 0;
	public static final String EMPTY_STRING = "";
	public static final String ALL_USER = "all";
	
	private String word = "";
	private String param1 = ALL_USER;
	private int param2 = EMPTY_INT;
	private String param3 = EMPTY_STRING;
		
	public Command(String word, String param1, int param2) {
		this.word = word;
		this.param1 = param1;
		this.param2 = param2;
	}
	
	public Command() {
		
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	public String getWord() {
		return word;
	}
	
	
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam1() {
		return param1;
	}
	

	public void setParam2(int param2) {
		this.param2 = param2;
	}
	public int setParam2() {
		return param2;
	}
	
	
	public void setParam3(String param1) {
		this.param3 = param3;
	}
	public String getParam3() {
		return param3;
	}
}

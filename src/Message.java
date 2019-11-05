import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Message {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	
	private String user;
	private String text;
	
	Message(int year, int month, int day, int hour, int minute, String user, String text) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.user = user;
		this.text = text;
	}
	
	public LocalDate getDate() {		
		LocalDate date = LocalDate.of(year + 2000, month, day);
		return date;
		
	}
	public LocalTime getTime() {
		LocalTime time = LocalTime.of(hour, minute);
		return time;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getHour() {
		return hour;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String newText) {
		this.text = newText;
	}
	
	public String getUser() {
		return user;
	}
}

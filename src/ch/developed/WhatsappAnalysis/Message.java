package ch.developed.WhatsappAnalysis;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Samuel Stalder
 * @version 12.11.2019
 */
public class Message {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	
	private String user;
	private String text;
	
	private boolean isMedia;
	
	
	Message(int year, int month, int day, int hour, int minute, String user, String text, Boolean isMedia) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.user = user;
		this.text = text;
		this.isMedia = isMedia;
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
	
	public int getDay() {
		return day;
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
	
	public boolean isMedia() {
		return isMedia;
	}
}

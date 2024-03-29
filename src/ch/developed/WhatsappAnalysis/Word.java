package ch.developed.WhatsappAnalysis;

/**
 * @author Samuel Stalder
 * @version 12.11.2019
 */
public class Word {

	private String name;
	private int amount;
	private String info;
	private int group; //similar words in one group, saved in a list of groups,
	private boolean isEmoji = false;
	
	public Word(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}
	
	public void counterUpAmount() {
		amount = amount + 1;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
	
	public void setEmoji(boolean isEmoji) {
		this.isEmoji = isEmoji;
	}
	
	public boolean isEmoji() {
		return isEmoji;
	}
	
}

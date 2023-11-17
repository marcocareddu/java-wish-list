package org.lessons.java.christmas;

import java.util.Comparator;

public class Gift {

	private String gift;
	private String recipient;
	
//	Constructor
	public Gift(String gift, String recipient) {
		setGift(gift);
		setRecipient(recipient);
	}
	
//	Getters
	public String getGift() {
		return gift;
	}
	public String getRecipient() {
		return recipient;
	}
	
//	Setters
	public void setGift(String gift) {
		this.gift = gift;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
//	Comparators 
    public Comparator<Gift> comparatorGift() {
        return Comparator.comparing(Gift::getGift);
    }

    public Comparator<Gift> comparatorRecipient() {
        return Comparator.comparing(Gift::getRecipient);
    }
	
	@Override
	public String toString() {
		return "\n-----------------------------------------\n"
				+ "Regalo: " + getGift() + "\n"
				+ "Ricevente: " + getRecipient() + "\n"
				+ "-----------------------------------------\n";
	}
}

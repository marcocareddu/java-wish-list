package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		Arrays
		ArrayList<Gift> giftList = new ArrayList<>();
		
//		Vars
		boolean newCicle = true;
		
		while(newCicle) {
			System.out.println("Inserisci un regalo nella lista: ");
			String giftName = in.nextLine();
			System.out.println("A chi vuoi donare il regalo? ");
			String recipient = in.nextLine();
			
			Gift gift = new Gift(giftName, recipient);
			
			giftList.add(gift);
			
			System.out.println("Vuoi inserire un nuovo regalo? \n"
					+ "Inserisci Si/No");
			String newGift = in.nextLine();
			
//			Sort methods
			System.out.println("In che ordine vuoi visutalizzare li lista? \n"
					+ "Inserisci Regalo/Destinatario");
			String ordered = in.nextLine();

	        if (ordered.trim().toLowerCase().equals("regalo")) {
	        	giftList.sort(gift.comparatorGift());
	        } else {
	        	giftList.sort(gift.comparatorRecipient());
	        };
			
			System.out.println(
					"Lista regali: \n" 
					+ giftList);
			
			newCicle = newGift.trim().toLowerCase().equals("si");
			
		}
		
//		Scanner close
		in.close();
		
	}
}

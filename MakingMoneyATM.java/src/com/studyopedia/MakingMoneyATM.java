package com.studyopedia;

public class MakingMoneyATM {

	public static void main(String[] args) {
		String welcomeMessage = "Making Money Bank ATM Service";
        String welcome = "Welcome!";
        
        // Create a border pattern to enhance the display
        String border = "=======================================";

        // Calculate the number of spaces needed to center the text
        int spaces = (border.length() - welcomeMessage.length()) / 2;
        int welcomeSpaces = (border.length() - welcome.length()) / 2;

        // Print the border with a centered welcome message
        System.out.println(border);
        System.out.println();
        // Print spaces before the welcome message
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(welcomeMessage);

        System.out.println();
        System.out.println(border);
        System.out.println();

        // Print spaces before the "Welcome!" message
        for (int i = 0; i < welcomeSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println(welcome);
        System.out.println();

        // Display a menu for ATM options
        System.out.println("Select an option:");
        System.out.println("1. View Account Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
        
        // You can add more functionality for ATM operations here

        // Close the program
        System.out.println("Thank you for using Making Money Bank ATM Service!");

	}

}

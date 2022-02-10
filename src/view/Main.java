package view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        boolean interfaceLooping = false;
        
        //Prompt user for login details, if successfully authenticated send user to menu interface.
        if (login()) {
            interfaceLooping = true;
        }
    
        //Menu interface
        while(interfaceLooping) {

            System.out.println("Welcome to Sahlgrenska Sjukhus!");
            System.out.println("[1] - Exit Application");
            
            Scanner scanner = new Scanner(System.in);
            int userInput=0;

            try {
                    
                userInput = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Input must be a valid integer from printed choices!");
            } 

            switch(userInput) {
                    
                case 0: //Do nothing
                    break;
                case 1:
                    interfaceLooping = false;
                    break;
            }

            //Wait for user input, so that the console does not become crowded with menu choices.
            System.out.println("Press any key to continue");
            System.in.read();
        }
    }

    public static boolean login () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter login details");
        
        System.out.println("Enter Username: ");
        String username = scanner.next();

        System.out.println("Enter password: ");
        String password = scanner.next();


        return true;
        // if (authenticate(username, password)) {
        //     return true;
        // } else {
        //     return false;
        // }
        
    }
}
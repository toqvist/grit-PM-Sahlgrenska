package view;

import java.util.Scanner;

import model.*;
import model.Employee;

public class Main {
    public static void main(String[] args) throws Exception {
        
        boolean interfaceLooping = false;
        Hospital hospital = new Hospital();

        //Prompt user for login details, if successfully authenticated send user to menu interface.
        if (login()) {
            interfaceLooping = true;
        }
    
        //Menu interface
        while(interfaceLooping) {

            System.out.println("Welcome to Sahlgrenska Sjukhus!");
            System.out.println("[1] - Exit Application");
            System.out.println("[2] - Show patient");
            System.out.println("[3] - Add patient");
            System.out.println("[4] - Add patient note");
            System.out.println("[5] - Change patient condition");
            System.out.println("[6] - Add employee");
            
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
                case 1: //Exit
                    interfaceLooping = false;
                    break;
                case 2: //Show patient
                    System.out.println("Input patient name:");
                    String searchName = scanner.next();
                    hospital.findPatient(searchName);
                    break;
                case 3: //Add patient
                    System.out.println("Input patient name:");
                    String patientName = scanner.next();
                    
                    System.out.println("Input patient personal ID:");
                    String personalID = scanner.next();

                    hospital.addPatient(patientName, personalID);
                    break;
                case 4: //Add note
                    System.out.println("Input patient name:");
                    String inputName = scanner.next();

                    System.out.println("Input note:");
                    String noteToAdd = scanner.next();

                    hospital.getPatient(inputName).addNote(noteToAdd);

                    break;
                case 5: //Chnage condition
                    System.out.println("Input patient name:");
                    String patientN = scanner.next();

                    System.out.println("Input new condition:");
                    String newCondition = scanner.next();

                    hospital.getPatient(patientN).changeCondtion(newCondition);;

                    break;
                case 6://Add employee
                    System.out.println("Input employee first name:");
                    String fname = scanner.next();

                    System.out.println("Input employee last name:");
                    String lname = scanner.next();

                    System.out.println("Input employee password:");
                    String ePassword = scanner.next();

                    System.out.println("Input employee work hours:");
                    Integer workhours = scanner.nextInt();

                    System.out.println("Input employee profession:");
                    String profession = scanner.next();
                    hospital.addEmployee(fname,lname,ePassword,workhours,profession);
                    break;

            }

            //Wait for user input, so that the console does not become crowded with menu choices.
            System.out.println("[ Press any key to continue ]");
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
package UseCases;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Crime;
import bean.Criminal;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("****** Welcome To Crime Information Management System ******\n");
        System.out.println("Select 1 for Admin");
        System.out.println("Select 2 for Public");

        int choice = scanner.nextInt();

        if (choice == 1) {
            adminMethod();
        } else if (choice == 2) {
        	publicMethod();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void adminMethod() {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "admin";
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();
        if (!inputUsername.equals(username) || !inputPassword.equals(password)) {
            System.out.println("Invalid username or password.");
            return;
        }
        while (true) {
            System.out.println("\n1. Add crime details");
            System.out.println("2. Update crime details");
            System.out.println("3. Add criminal details");
            System.out.println("4. Update criminal details");
            System.out.println("5. Assign criminal to crime");
            System.out.println("6. Remove criminal from crime");
            System.out.println("7. Delete crime");
            System.out.println("8. Delete criminal");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addCrimeDetails(scanner);
                    System.out.println("Add Crime");
                    break;
                case 2:
//                    updateCrimeDetails();
                	System.out.println("Update Crime");
                    break;
                case 3:
//                    addCriminalDetails();
                	System.out.println("Add Criminal");
                	break;
                case 4:
//                    updateCriminalDetails();
                	System.out.println("Update Criminal");
                    break;
                case 5:
//                    assignCriminalToCrime();
                	System.out.println("Assign Criminal");
                    break;
                case 6:
//                    removeCriminalFromCrime();
                	System.out.println("Remove Criminal");
                    break;
                case 7:
//                    deleteCrime();
                	System.out.println("Delete Crime");
                    break;
                case 8:
//                    deleteCriminal();
                	System.out.println("Delete Criminal");
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addCrimeDetails(Scanner scanner) {
		// TODO Auto-generated method stub
    	
		
	}

	List<Crime> crimes = new ArrayList<>();
    List<Criminal> criminals = new ArrayList<>();
//    
//    private static void deleteCriminal() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void deleteCrime() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void removeCriminalFromCrime() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void assignCriminalToCrime() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void updateCriminalDetails() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void addCriminalDetails() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void updateCrimeDetails() {
//		// TODO Auto-generated method stub
//		
//	}


	private static void publicMethod() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. View total crime for each Police Station area for a date range.");
            System.out.println("2. View total crime for each crime type for a date range");
            System.out.println("3. Search for criminal by name.");
            System.out.println("4. Search for crime by description.");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
//                	viewTotalCrimeForPoliceStationArea();
                	System.out.println("View Total Crime For Police Station Area");
                    break;
                case 2:
//                	viewTotalCrimeForCrimeType();
                	System.out.println("View Total Crime For Crime Type");
                    break;
                case 3:
//                    searchCriminalByName();
                	System.out.println("Search Criminal By Name");
                    break;
                case 4:
//                    searchCrimeByDescription();
                    System.out.println("Search Crime By Description");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
//
//	private static void searchCrimeByDescription() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void searchCriminalByName() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void viewTotalCrimeForCrimeType() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void viewTotalCrimeForPoliceStationArea() {
//		// TODO Auto-generated method stub
//		
//	}   
//}
//    

//    
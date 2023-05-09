package UseCases;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
                    addCrimeDetails();
                    System.out.println("Add Crime");
                    break;
                case 2:
                    updateCrimeDetails();
                	System.out.println("Update Crime");
                    break;
                case 3:
                    addCriminalDetails();
                	System.out.println("Add Criminal");
                	break;
                case 4:
                    updateCriminalDetails();
                	System.out.println("Update Criminal");
                    break;
                case 5:
                    assignCriminalToCrime();
                	System.out.println("Assign Criminal");
                    break;
                case 6:
                    removeCriminalFromCrime();
                	System.out.println("Remove Criminal");
                    break;
                case 7:
                    deleteCrime(0);
                	System.out.println("Delete Crime");
                    break;
                case 8:
                    deleteCriminal(0);
                	System.out.println("Delete Criminal");
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

//	
	  private static Map<Integer, Crime> crimes1 = new HashMap<>();
	  private static Map<Integer, Criminal> criminals1 = new HashMap<>();
		static List<Crime> crimes = new ArrayList<>();
	    static List<Criminal> criminals = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);

	  public static void addCrimeDetails() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter crime id: ");
	        int crimeId = scanner.nextInt();
	        scanner.nextLine();

	        System.out.print("Enter crime type: ");
	        String type = scanner.nextLine();

	        System.out.print("Enter crime description: ");
	        String description = scanner.nextLine();

	        System.out.print("Enter police station area: ");
	        String psArea = scanner.nextLine();

	        System.out.print("Enter date of crime (yyyy-MM-dd): ");
	        String dateStr = scanner.nextLine();
	        java.sql.Date date = java.sql.Date.valueOf(dateStr);

	        System.out.print("Enter victim name: ");
	        String victimName = scanner.nextLine();

	        Crime crime = new Crime(crime_id, type, description, psArea, date, victimName);
	        crimes.put(crime_id, crime);
		  }

	  public static void updateCrimeDetails() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter crime ID: ");
	        int crime_id = scanner.nextInt();
	        scanner.nextLine();
	        Crime crime = crimes.get(crime_id);
	        if (crime != null) {
	            System.out.print("Enter new type (or press Enter to skip): ");
	            String type = scanner.nextLine();
	            System.out.print("Enter new description (or press Enter to skip): ");
	            String description = scanner.nextLine();
	            System.out.print("Enter new police station area (or press Enter to skip): ");
	            String ps_area = scanner.nextLine();
	            System.out.print("Enter new date (or press Enter to skip): ");
	            String date = scanner.nextLine();
	            System.out.print("Enter new victim name (or press Enter to skip): ");
	            String victim_name = scanner.nextLine();
	            updateCrimeDetails(crime_id, type, description, ps_area, date, victim_name);
	        } else {
	            System.out.println("Crime not found.");
	        }
		  }

	  public static void addCriminalDetails() {
	        System.out.print("Enter criminal ID: ");
	        int criminalId = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Enter name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter date of birth: ");
	        String dob = scanner.nextLine();
	        System.out.print("Enter gender (M/F/O): ");
	        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
	        System.out.print("Enter identifying mark: ");
	        String identifyingMark = scanner.nextLine();
	        System.out.print("Enter first arrest date (yyyy-MM-dd): ");
	        java.sql.Date firstArrestDate = java.sql.Date.valueOf(scanner.nextLine());
	        System.out.print("Enter arrested from police station area: ");
	        String arrestedFromPsArea = scanner.nextLine();

	        Criminal criminal = new Criminal(criminal_id, name, dob, gender, identifyingMark, firstArrestDate, arrestedFromPsArea);
	        criminals.put(criminal_id, criminal);
		  }
		  
		  public void updateCriminalDetails(int criminal_id, String name, String dob, Gender gender, String identifying_mark, java.sql.Date first_arrest_date, String arrested_from_ps_area) {
		    Criminal criminal = criminals1.get(criminal_id);
		    if (criminal != null) {
		      if (name != null) {
		        criminal.setName(name);
		      }
		      if (dob != null) {
		        criminal.setDob(dob);
		      }
		      if (gender != null) {
		        criminal.setGender(gender);
		      }
		      if (identifying_mark != null) {
		        criminal.setIdentifying_mark(identifying_mark);
		      }
		      if (first_arrest_date != null) {
		        criminal.setFirst_arrest_date(first_arrest_date);
		      }
		      if (arrested_from_ps_area != null) {
		        criminal.setArrested_from_ps_area(arrested_from_ps_area);
		      }
		    }
		  }

		  public static void assignCriminalToCrime() {
			    Criminal criminal = criminals.get(criminal_id);
			    Crime crime = crimes1.get(crime_id);
			    if (criminal != null && crime != null) {
			      crime.addCrimeDetails(criminal);
			    }
			  }

		  public static removeCriminalFromCrime() {
			    Criminal criminal = criminals1.get(criminal_id);
			    Crime crime = crimes1.get(crime_id);
			    if (criminal != null && crime != null) {
			      crime.removeCriminalFromCrime(criminal);
			    }
			  }

		  public static void deleteCrime(int crime_id) {
		        for (int i = 0; i < crimes.size(); i++) {
		            if (crimes.get(i).crime_id == crime_id) {
		                crimes.remove(i);
		                break;
		            }
		        }
			  }
		  public static void deleteCriminal(int criminal_id) {
		        for (int i = 0; i < criminals.size(); i++) {
		            if (criminals.get(i).criminal_id == criminal_id) {
		                criminals.remove(i);
		                break;
		            }
		        }
		    }
			  




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
                	viewTotalCrimeForPoliceStationArea(null, null);
                	System.out.println("View Total Crime For Police Station Area");
                    break;
                case 2:
                	viewTotalCrimeForCrimeType(null, null);
                	System.out.println("View Total Crime For Crime Type");
                    break;
                case 3:
                	searchCriminalByName(null);
                	System.out.println("Search Criminal By Name");
                    break;
                case 4:
                	searchCrimeByDescription(null);
                    System.out.println("Search Crime By Description");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
	
	
	
	

	// view total crimes for police station area for given date range
	public static void viewTotalCrimeForPoliceStationArea(Date start_date, Date end_date) {
	    Map<String, Integer> map = new HashMap<>();
	    for (Crime crime : crimes) {
	        if (crime.date.compareTo(start_date) >= 0 && crime.date.compareTo(end_date) <= 0) {
	            String ps_area = crime.ps_area;
	            int count = map.getOrDefault(ps_area, 0);
	            map.put(ps_area, count + 1);
	        }
	    }
	    System.out.println("Total crimes for each police station area for given date range:");
	    for (String ps_area : map.keySet()) {
	        System.out.println(ps_area + ": " + map.get(ps_area));
	    }
	}

	// view total crimes for crime type for given date range
	public static void viewTotalCrimeForCrimeType(Date start_date, Date end_date) {
	    Map<String, Integer> map = new HashMap<>();
	    for (Crime crime : crimes) {
	        if (crime.date.compareTo(start_date) >= 0 && crime.date.compareTo(end_date) <= 0) {
	            String type = crime.type;
	            int count = map.getOrDefault(type, 0);
	            map.put(type, count + 1);
	        }
	    }
	    System.out.println("Total crimes for each crime type for given date range:");
	    for (String type : map.keySet()) {
	        System.out.println(type + ": " + map.get(type));
	    }
	}

	// search for a criminal by name and display their details
	public static void searchCriminalByName(String name) {
	    System.out.println("Criminals with name \"" + name + "\":");
	    for (Criminal criminal : criminals) {
	        if (criminal.name.equals(name)) {
	            System.out.println("Criminal ID: " + criminal.criminal_id);
	            System.out.println("Name: " + criminal.name);
	            System.out.println("Date of birth: " + criminal.dob);
	            System.out.println("Gender: " + criminal.gender);
	            System.out.println("Identifying mark: " + criminal.identifying_mark);
	            System.out.println("First arrest date: " + criminal.first_arrest_date);
	            System.out.println("Arrested from police station area: " + criminal.arrested_from_ps_area);
	            System.out.println();
	        }
	    }
	}

	// search for a crime by description and display its details
	public static void searchCrimeByDescription(String description) {
	    System.out.println("Crimes with description containing \"" + description + "\":");
	    for (Crime crime : crimes) {
	        if (crime.description.contains(description)) {
	            System.out.println("Crime ID: " + crime.crime_id);
	            System.out.println("Type: " + crime.type);
	            System.out.println("Description: " + crime.description);
	            System.out.println("Police station area: " + crime.ps_area);
	            System.out.println("Date: " + crime.date);
	            System.out.println("Victim name: " + crime.victim_name);
	            System.out.println();
	        }
	    }
	}
}

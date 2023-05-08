package com.masai.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Crime;
import bean.Criminal;


public class Public {

	List<Crime> crimes;
	List<Criminal> criminals;
	
	public Public(List<Crime> crimes, List<Criminal> criminals) {
	    this.crimes = crimes;
	    this.criminals = criminals;
	}
	
	// view total crimes for police station area for given date range
	public void viewTotalCrimeForPoliceStationArea(Date start_date, Date end_date) {
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
	public void viewTotalCrimeForCrimeType(Date start_date, Date end_date) {
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
	public void searchCriminalByName(String name) {
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
	public void searchCrimeByDescription(String description) {
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

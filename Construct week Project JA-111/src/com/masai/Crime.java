package com.masai;

import java.sql.Date;
import java.util.List;

public class Crime {
    private int crimeId;
    private String type;
    private String description;
    private String psArea;
    private Date date;
    private String victimName;
    private List<Criminal> criminals; // List of criminals involved in the crime
    
    
	public Crime(int crimeId, String type, String description, String psArea, Date date, String victimName,
			List<Criminal> criminals) {
		this.crimeId = crimeId;
		this.type = type;
		this.description = description;
		this.psArea = psArea;
		this.date = date;
		this.victimName = victimName;
		this.criminals = criminals;
	}


	public int getCrimeId() {
		return crimeId;
	}


	public void setCrimeId(int crimeId) {
		this.crimeId = crimeId;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPsArea() {
		return psArea;
	}


	public void setPsArea(String psArea) {
		this.psArea = psArea;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getVictimName() {
		return victimName;
	}


	public void setVictimName(String victimName) {
		this.victimName = victimName;
	}


	public List<Criminal> getCriminals() {
		return criminals;
	}


	public void setCriminals(List<Criminal> criminals) {
		this.criminals = criminals;
	}

    public String toString() {
        return "Crime ID: " + crimeId + ", Type: " + type + ", Description: " + description + ", PS Area: " + 
            psArea + ", Date: " + date.toString() + ", Victim Name: " + victimName;
    }
  
	
	
}


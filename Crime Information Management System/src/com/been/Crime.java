package com.been;

import java.sql.Date;
import java.util.List;

public class Crime {
    private int crime_id;
    private String type;
    private String description;
    private String ps_area;
    private Date date;
    private String victim;
    private List<Criminal> criminals;
    
    
	public Crime(int crime_id, String type, String description, String ps_area, Date date, String victim,
			List<Criminal> criminals) {
		super();
		this.crime_id = crime_id;
		this.type = type;
		this.description = description;
		this.ps_area = ps_area;
		this.date = date;
		this.victim = victim;
		this.criminals = criminals;
	}

    public void addCriminal(Criminal criminal) {
        criminals.add(criminal);
    }

    public void removeCriminal(Criminal criminal) {
        criminals.remove(criminal);
    }
	
	public int getCrime_id() {
		return crime_id;
	}


	public void setCrime_id(int crime_id) {
		this.crime_id = crime_id;
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


	public String getPs_area() {
		return ps_area;
	}


	public void setPs_area(String ps_area) {
		this.ps_area = ps_area;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getVictim() {
		return victim;
	}


	public void setVictim(String victim) {
		this.victim = victim;
	}


	public List<Criminal> getCriminals() {
		return criminals;
	}


	public void setCriminals(List<Criminal> criminals) {
		this.criminals = criminals;
	}


	@Override
	public String toString() {
		return "Crime [crime_id=" + crime_id + ", type=" + type + ", description=" + description + ", ps_area="
				+ ps_area + ", date=" + date + ", victim=" + victim + ", criminals=" + criminals + ", getCrime_id()="
				+ getCrime_id() + ", getType()=" + getType() + ", getDescription()=" + getDescription()
				+ ", getPs_area()=" + getPs_area() + ", getDate()=" + getDate() + ", getVictim()=" + getVictim()
				+ ", getCriminals()=" + getCriminals() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}  
	
	
	
}

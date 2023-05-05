package com.been;

import java.sql.Date;
import java.util.List;

public class Criminal {
    private int criminalId;
    private String name;
    private Date dob;
    private String gender;
    private String identifyingMark;
    private Date firstArrestDate;
    private String arrestedFromPsArea;
    private List<Crime> crimes;
    
    
	public Criminal(int criminalId, String name, Date dob, String gender, String identifyingMark, Date firstArrestDate,
			String arrestedFromPsArea, List<Crime> crimes) {
		super();
		this.criminalId = criminalId;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.identifyingMark = identifyingMark;
		this.firstArrestDate = firstArrestDate;
		this.arrestedFromPsArea = arrestedFromPsArea;
		this.crimes = crimes;
	}


	public int getCriminalId() {
		return criminalId;
	}


	public void setCriminalId(int criminalId) {
		this.criminalId = criminalId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getIdentifyingMark() {
		return identifyingMark;
	}


	public void setIdentifyingMark(String identifyingMark) {
		this.identifyingMark = identifyingMark;
	}


	public Date getFirstArrestDate() {
		return firstArrestDate;
	}


	public void setFirstArrestDate(Date firstArrestDate) {
		this.firstArrestDate = firstArrestDate;
	}


	public String getArrestedFromPsArea() {
		return arrestedFromPsArea;
	}


	public void setArrestedFromPsArea(String arrestedFromPsArea) {
		this.arrestedFromPsArea = arrestedFromPsArea;
	}


	public List<Crime> getCrimes() {
		return crimes;
	}


	public void setCrimes(List<Crime> crimes) {
		this.crimes = crimes;
	}


	@Override
	public String toString() {
		return "Criminal [criminalId=" + criminalId + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", identifyingMark=" + identifyingMark + ", firstArrestDate=" + firstArrestDate
				+ ", arrestedFromPsArea=" + arrestedFromPsArea + ", crimes=" + crimes + ", getCriminalId()="
				+ getCriminalId() + ", getName()=" + getName() + ", getDob()=" + getDob() + ", getGender()="
				+ getGender() + ", getIdentifyingMark()=" + getIdentifyingMark() + ", getFirstArrestDate()="
				+ getFirstArrestDate() + ", getArrestedFromPsArea()=" + getArrestedFromPsArea() + ", getCrimes()="
				+ getCrimes() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    

	
}

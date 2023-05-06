package com.been;

import java.sql.Date;
import java.util.List;

public class Criminal {
    private int criminal_id;
    private String name;
    private Date dob;
    private String gender;
    private String identifying_mark;
    private Date first_arrest_date;
    private String arrested_from_ps_area;
	private List<Crime> crimes;
    
	
    public Criminal(int criminal_id, String name, Date dob, String gender, String identifying_mark,
			Date first_arrest_date, String arrested_from_ps_area, List<Crime> crimes) {
		super();
		this.criminal_id = criminal_id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.identifying_mark = identifying_mark;
		this.first_arrest_date = first_arrest_date;
		this.arrested_from_ps_area = arrested_from_ps_area;
		this.crimes = crimes;
	}


	public int getCriminal_id() {
		return criminal_id;
	}


	public void setCriminal_id(int criminal_id) {
		this.criminal_id = criminal_id;
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


	public String getIdentifying_mark() {
		return identifying_mark;
	}


	public void setIdentifying_mark(String identifying_mark) {
		this.identifying_mark = identifying_mark;
	}


	public Date getFirst_arrest_date() {
		return first_arrest_date;
	}


	public void setFirst_arrest_date(Date first_arrest_date) {
		this.first_arrest_date = first_arrest_date;
	}


	public String getArrested_from_ps_area() {
		return arrested_from_ps_area;
	}


	public void setArrested_from_ps_area(String arrested_from_ps_area) {
		this.arrested_from_ps_area = arrested_from_ps_area;
	}


	public List<Crime> getCrimes() {
		return crimes;
	}


	public void setCrimes(List<Crime> crimes) {
		this.crimes = crimes;
	}


	@Override
	public String toString() {
		return "Criminal [criminal_id=" + criminal_id + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", identifying_mark=" + identifying_mark + ", first_arrest_date=" + first_arrest_date
				+ ", arrested_from_ps_area=" + arrested_from_ps_area + ", crimes=" + crimes + ", getCriminal_id()="
				+ getCriminal_id() + ", getName()=" + getName() + ", getDob()=" + getDob() + ", getGender()="
				+ getGender() + ", getIdentifying_mark()=" + getIdentifying_mark() + ", getFirst_arrest_date()="
				+ getFirst_arrest_date() + ", getArrested_from_ps_area()=" + getArrested_from_ps_area()
				+ ", getCrimes()=" + getCrimes() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

   
   
}

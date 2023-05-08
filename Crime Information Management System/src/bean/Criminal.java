package bean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Criminal {
    public int criminal_id;
    public String name;
    public Date dob;
    public String gender;
    public String identifying_mark;
    public Date first_arrest_date;
    public String arrested_from_ps_area;
    public List<Integer> crime_ids = new ArrayList<>();
    
    
	public Criminal(int criminal_id, String name, Date dob, String gender, String identifying_mark,
			Date first_arrest_date, String arrested_from_ps_area, List<Integer> crime_ids) {
		super();
		this.criminal_id = criminal_id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.identifying_mark = identifying_mark;
		this.first_arrest_date = first_arrest_date;
		this.arrested_from_ps_area = arrested_from_ps_area;
		this.crime_ids = crime_ids;
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
	public List<Integer> getCrime_ids() {
		return crime_ids;
	}
	public void setCrime_ids(List<Integer> crime_ids) {
		this.crime_ids = crime_ids;
	}
    
   
}

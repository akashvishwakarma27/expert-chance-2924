package bean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Crime {
    public static final String dateFormat = null;
	public int crime_id;
    public String type;
    public String description;
    public String ps_area; 
    public Date date;
    public String victim_name;
    public List<Integer> criminal_ids = new ArrayList<>();
    
    
    

	public Crime(int crime_id, String type, String description, String ps_area, Date date, String victim_name,
			List<Integer> criminal_ids) {
		this.crime_id = crime_id;
		this.type = type;
		this.description = description;
		this.ps_area = ps_area;
		this.date = date;
		this.victim_name = victim_name;
		this.criminal_ids = criminal_ids;
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


	public String getVictim_name() {
		return victim_name;
	}


	public void setVictim_name(String victim_name) {
		this.victim_name = victim_name;
	}


	public List<Integer> getCriminal_ids() {
		return criminal_ids;
	}


	public void setCriminal_ids(List<Integer> criminal_ids) {
		this.criminal_ids = criminal_ids;
	}    
}

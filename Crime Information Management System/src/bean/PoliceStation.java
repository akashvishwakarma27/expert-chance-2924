package bean;

public class PoliceStation {
	public String name;
	public String area;
    
	public PoliceStation(String name, String area) {
		super();
		this.name = name;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
    
    
}

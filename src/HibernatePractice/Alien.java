package HibernatePractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	
	@Id
	public int aid;
	public String aname;
	public String color;
	
	public Alien(int aid, String name, String color) {
		
		this.aid = aid;
		this.aname = aname;
		this.color = color;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

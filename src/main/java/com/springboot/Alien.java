package com.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Alien {
	@Id
	private int id;
	private String aname;
	private int points;
	
	
	public String getName() {
		return aname;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + aname + ", points=" + points + "]";
	}
	public void setName(String name) {
		this.aname = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
}

package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model.Finder;

@Entity
public class Studies {
	
//	@Id
//	private long id;
	
	private String spName;
	
	private double length;
	
	private String url;
	
	private String fieldName;
	
	private String areaName;
	
	private String executorName;
	
	private String overlordName;
	
	private String spCityName;
	
	private boolean active;
	
	private String coordinates;
	
	private String hzzCategories;
	
	
	public static Finder<Integer, Studies> find = new Finder<Integer, Studies>(Integer.class, Studies.class);
	public static Finder<String, Studies> findString = new Finder<String, Studies>(String.class, Studies.class);


//	public long getId() {
//		return id;
//	}


	public String getSpName() {
		return spName;
	}


	public double getLength() {
		return length;
	}


	public String getUrl() {
		return url;
	}


	public String getFieldName() {
		return fieldName;
	}


	public String getAreaName() {
		return areaName;
	}


	public String getExecutorName() {
		return executorName;
	}


	public String getOverlordName() {
		return overlordName;
	}


	public String getSpCityName() {
		return spCityName;
	}


	public boolean isActive() {
		return active;
	}


	public String getCoordinates() {
		return coordinates;
	}


	public String getHzzCategories() {
		return hzzCategories;
	}


	public static Finder<Integer, Studies> getFind() {
		return find;
	}
	
	

}

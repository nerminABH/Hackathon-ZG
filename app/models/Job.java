package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model.Finder;

@Entity
public class Job {
	
//	@Id
//	private long id;
	
	private String title;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	
	private String link;
	
	private String category;
	
//	private String city;
	
	public static Finder<String, Job> findString = new Finder<String, Job>(String.class, Job.class);

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getLink() {
		return link;
	}

	public String getCategory() {
		return category;
	}

//	public String getCity() {
//		return city;
//	}
	
	

}

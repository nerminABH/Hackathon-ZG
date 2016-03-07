package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import models.Job;
import models.Studies;
import play.libs.ws.WSClient;
import play.mvc.*;
import views.html.index;
import views.html.jobs;

public class Application extends Controller {

	/**
	 * Method invokes and renders index page
	 * @return
	 */
	public Result index(String job) {
		
		List<Studies> studiesList = Studies.find.all();
		Set<String> set = new HashSet<String>();
		for (Studies study : studiesList) {
			set.add(study.getFieldName());
		}
		List<String> fieldNameList = new ArrayList<String>();
		fieldNameList.addAll(set);
		Collections.sort(fieldNameList);
		
		List<Job> jobsList = null;
		List<Studies> studiesForView = null;
		
		if (job != null) {
			List<Studies> filteredStudies = Studies.findString.where().eq("fieldName", job).findList();
			String hzzCateg = filteredStudies.get(0).getHzzCategories();
			jobsList = Job.findString.where().eq("category", hzzCateg).findList();
			Set<String> filterSet = new HashSet<String>();
			studiesForView = new ArrayList<Studies>();
			for (Studies study2 : filteredStudies) {
				String exStr = study2.getExecutorName();
				if (!filterSet.contains(exStr)) {
					studiesForView.add(study2);
					filterSet.add(exStr);
				}
			}
		} 		
		
    	return ok(index.render(job, fieldNameList, jobsList, studiesForView));
	}
 
}

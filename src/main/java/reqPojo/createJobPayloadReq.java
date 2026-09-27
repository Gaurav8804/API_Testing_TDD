package reqPojo;

import java.util.*;

/*	 {
"jobId": 1,
"jobTitle": "Software Engg",
"jobDescription": "To develop andriod application",
"experience": [
    "Google",
    "Apple",
    "Mobile Iron",
    "Samsung"
],
"project": [
    {
        "projectName": "Movie App",
        "technology": [
            "Kotlin",
            "SQL Lite",
            "Gradle"
        ]
    }
]
   }
   
*/
public class createJobPayloadReq {

	private String jobId;
	private String jobTitle;
	private String jobDescription;
	private List<String> experience;
	private project project;

	public String getJobId() {
		return jobId;
	}

	public void setJobID(String JOBID) {
		this.jobId = JOBID;
	}
	
	public String jobTitle() 
	{
		return jobTitle;
	}
	
	public void setJobTitle(String JOBTITLE) 
	{
		this.jobTitle=JOBTITLE;
	}
	
	public String getJobDescription() 
	{
		return jobDescription;
	}
	
	public void setJobDescription(String JOBDESCRIPTION) 
	{
		this.jobDescription=JOBDESCRIPTION;
	}
	
	public List<String> getExperience()
	{
		return experience;
	}
	
	public void setExperience(List<String> Experience) 
	{
		this.experience=Experience;
	}
	
	public void setProject(project Project) 
	{
		this.project=Project;
	}
	
	public project getProject() 
	{
	   return project;
	}
	
	
	
	
	
	
	

}

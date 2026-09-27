package reqPojo;

import java.util.List;

public class project {
	
	
	private String projectName;
	private List<String> technology;
	
	public String getProjectName() 
	{
		return projectName;
	}
	
	public void setProjectName(String ProjectName) 
	{
		projectName=ProjectName;
		
	}
	
	public List<String> getTechnology()
	{
		return technology;
	}
	
	public void setTechnology(List<String> Technology) 
	{
		technology=Technology;
	}

}

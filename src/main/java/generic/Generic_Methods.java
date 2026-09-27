package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import endpoints.APIConstants;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Generic_Methods {

		
		static RequestSpecification Request;
		ResponseSpecification Response;
		
		/**
		 * This method is used for request , in which PrintStream is a class which is used to capture all the data after logging into the file
		 * called Logging.txt. addFilter will applied to the Object to log all the data
		 * 
		 *  Note : If we don't make RequestSpecification method as static , then it will make the available Request as null while running the 
		 *          second time and as a result it will log the result data of last run only .
		 *  
		 * @return
		 * @throws FileNotFoundException 
		 * @throws IOException 
		 */
		public static RequestSpecification requestSpecification() throws FileNotFoundException
		{
			//Error not logging all the reports
			if(Request==null) //Writing this line to log the data in every run when set of data is available 
			{
				
			PrintStream log=new PrintStream(new FileOutputStream("Logging.txt"));
			 
			 Request = new RequestSpecBuilder().setBaseUri(APIConstants.BASE_URL).addQueryParam("key", "qaclick123")
			.addFilter(RequestLoggingFilter.logRequestTo(log))// logging the req 
			.addFilter(ResponseLoggingFilter.logResponseTo(log))// Logging the response in the same file 	
			.setContentType(ContentType.JSON).build();
			 
			return Request;
			}
			
			return Request;	
			
		}
		
		public static String globalValues(String key) throws IOException 
		{
			
		Properties prop= new Properties();	
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\API_Testing_TDD\\src\\test\\resources\\Global.Properties");
		prop.load(fis);
		return prop.getProperty(key);
	    }
		
		
		public String getJsonPath( String reponse , String key  ) 
		{
			
			JsonPath js=new JsonPath(reponse);
			return js.get(key).toString();
		}
		
		public ResponseSpecification responseSpecification(int statusCode) 
		{
			 Response = new  ResponseSpecBuilder().expectStatusCode(statusCode).expectContentType(ContentType.JSON).build();
			 return Response;
		}
	}


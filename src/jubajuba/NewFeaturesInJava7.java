package jubajuba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class NewFeaturesInJava7 {

	// Numeric literal
	long credit_card_number = 1234567890123456L;

	
	
	// Binary literal
	static byte theByte = 3;

	
	
	
	// try with resource
	public void tryWithResource(String path) throws IOException {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(path));
			reader.readLine();
		} finally {
			reader.close();
		}
	}

	
	
	// Strings in switch
	public String stringsInSwitch(String dayOfWeek) {
		String typeOfDay;
		switch (dayOfWeek) {
		case "Monday":
			typeOfDay = "Start of work week";
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			typeOfDay = "Midweek";
			break;
		case "Friday":
			typeOfDay = "End of work week";
			break;
		case "Saturday":
		case "Sunday":
			typeOfDay = "Weekend";
			break;
		default:
			throw new IllegalArgumentException("Invalid day of the week: "
					+ dayOfWeek);
		}
		return typeOfDay;
	}

	
	
	// diamond operator (tune compiler options for quickfix)
	public List<String> diamond() {
		List<String> myList = new ArrayList<String>();
		
		return myList;
	}
	
	
	

	// Multi catch
	public void multiCatch(){
	   try {
		    Object list = null;
			getClass().getConstructor(Object.class).newInstance(list);
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	
	
	
	// Rethrowing Exceptions with Improved Type Checking 
	static class FirstException extends Exception { }
	static class SecondException extends Exception { }
	
	public void rethrowException(String exceptionName) throws Exception{
	  try {
	    if (exceptionName.equals("First")) {
	      throw new FirstException();
	    } else {
	      throw new SecondException();
	    }
	  } catch (Exception e) {
	    throw e;
	  }
	}
	
	  
	  
	  //Improved Compiler Warnings and Errors When Using Non-Reifiable Formal Parameters with Varargs Methods
	  ArrayBuilder b = new ArrayBuilder();
}







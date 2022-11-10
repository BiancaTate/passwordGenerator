import java.util.*;


public class Generator {
	public void Generator() {
		

		
		
		Scanner input = new Scanner(System.in);
		
		String pass;// user string input
		String another;// user string input 
		int length;// user number input
		

		
		
		
		String capitalCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	    String symbols = "!@#$";
	    String numbers = "1234567890";
	    
	    
	    
	    
	    
	    StringBuilder sb = new StringBuilder();
	    
	    Random random = new Random();  // create instance of Random class
	    
	 
	    

	    
	    
	    System.out.println("Bianca's Password Generator !");
	    
	    
	    	ArrayList<String> combined = new ArrayList<>();
	        
	        combined.add(lowerCase);   //#0 in array list
	        combined.add(capitalCase);  
	        combined.add(symbols);
	        combined.add(numbers);  //#3 in array List
	   
	  
	    	System.out.print("How many characters should your password have? (Choose a number between 8-128): ");
	    	length= input.nextInt();
	    	if (length<8||length>128) {
			System.out.println("The number you have entered is invalid. Please try again.");
			System.exit(0);
		
	    	}
		
		
	    	System.out.print("Include lower case?: ");
	    	input.nextLine();
	    	pass= input.nextLine();
	    		if (pass.equalsIgnoreCase("No")) {
	    			combined.remove(lowerCase);			// removed lower case from array 
	    
	    		}
		
	    	System.out.print("Include upper case?: ");
	    	pass= input.nextLine();
	    		if (pass.equalsIgnoreCase("No")) {
	    			combined.remove(capitalCase);		// rSystem.out.println("Test: " + combined);
	    		}
		
	    	System.out.print("Include symbols?: ");
	    	pass= input.nextLine();
	    		if (pass.equalsIgnoreCase("No")) {
	    			combined.remove(symbols);		// removed symbols from array 
	    			
	    		}
		
	    	System.out.print("Include numbers?: ");
	    	pass= input.nextLine();
	    		if (pass.equalsIgnoreCase("No")) {
	    			combined.remove(numbers);	// removed numbers from array
	    			
	    		}
		
	    	System.out.println("Here is your new password: ");
	    	String listString = String.join(", ", combined); // combining the array into a single string
	    	listString =listString.replaceAll(",","");
	    		for(int i = 0; i < length; i++) {

		      
	    			int index = random.nextInt(listString.length());// generate random index number

		      
	    			char randomChar = listString.charAt(index); // get character specified by index from the string
		     

	    			sb.append(randomChar);// append the character to string builder
	    		}
		
	    	String randomString = sb.toString();
	    	randomString=randomString.replaceAll("\\s", "");
		
	    	System.out.println(randomString);
	    	System.out.println();
		
	    	System.out.print("Would you like to generate another password?");
	    	another= input.nextLine();
	    	if(another.equalsIgnoreCase("Yes")) {
	    	Generator again= new Generator ();
	    	again.Generator();
	    	}
	    
	    	else  if (another.equalsIgnoreCase("No")) {
	        System.out.println("Thank you for using Bianca's Password Generator!");
	    
	    
		
	    input.close();
		
		
	        
	        
			}

		
		


		
				
			
		}
	

		



}


	
	
	



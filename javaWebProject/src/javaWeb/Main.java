package javaWeb;

import java.io.File;
import java.io.IOException;

public class Main { // concreate class
    
	public static void main(String[] args)  {		
		File file = new File("example.txt");
	 	 try {
	            if (file.createNewFile()) {
	                System.out.println("File created successfully.");
	            } else {
	                System.out.println("File already exists.");
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while creating the file.");
	            e.printStackTrace();
	        }		
	}	
}



package ex06;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
	    String age_type = sc.next();
	    int year = sc.nextInt();
	    
	    int answer = 0;
	        	        
        if (age_type.equals("Korea")) {
		
        answer = 2024-year+1; 
	        }
        else if(age_type.equals("Year")) {
        answer = 2024-year;
	}

	System.out.println(answer);
}

}



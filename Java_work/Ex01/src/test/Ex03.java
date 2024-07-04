package test;

public class Ex03 {

	// 3. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오.	

	public static void main(String[] args) {
		
//		a = 홀수
//       b = -짝수
		
		
        for(int i = 1; i < 100 ; i = i +( (-1*i) -1)); {
        	if(i%2 != 0) 
        		System.out.println("i는 " + i);

        	
        	}
        	                    
        	                       
        }
	
}		  
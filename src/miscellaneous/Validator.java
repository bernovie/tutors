package miscellaneous;

import java.util.*;

public class Validator {
	
	Validator(){
		
	}
	
	public static int getInt(Scanner sc, String st, int a, int b ){
		System.out.println(st);
		int answer = sc.nextInt();
		if(answer < a || answer > b){
			return -1;
		}
		return answer;
	}
	
	public static boolean getString(Scanner sc, String st){
		boolean repeat;
		
		do{
			System.out.println(st);
			String answer = sc.next();
			repeat = false;
			if(answer.equalsIgnoreCase("y")) return true;
			else if (answer.equalsIgnoreCase("n")){
				return false;
			}
			else {
				repeat = true;
			}
		}while(repeat);
				
		return false;
	}
	
}

package miscellaneous;

import java.util.*;
import java.text.NumberFormat;

public class BattingAverageApp {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	double successfulRuns = 0;
	double totalBases = 0;
	int atbatt = 0;
	String message = " ";

	AtBat bat = new AtBat();
	//System.out.print("Number of batters:	");
	int batters = 1;
	System.out.println();
	bat.setPlayers(batters);
	
	int[] atbat = new int[batters];
	double[][] calculate = new double[batters][2];
	
	
	do{
	
	totalBases = 0;
	successfulRuns = 0;
		atbat[0] = Validator.getInt(sc, "Enter the number of times at bat for player "+ (1) + ":    ", 0, 11);
		System.out.println();
		atbatt = atbat[0];
		double[] results = new double[atbatt];
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
	
    	for(int i = 0; i < atbatt; i++)
    	{
        	results[i] = 0;
            results[i] = Validator.getInt(sc, "Results for at-bat " + i + ":	", -1, 5);
            bat.setResult(results[i]);
            if (results[i] > 0)
            successfulRuns++;
        	totalBases += results[i];
    	}
    	System.out.println();
	
		calculate[0][0] = successfulRuns / (double)atbatt;
		calculate[0][1] = totalBases / (double)atbatt;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		message = "Batting average: " + number.format(calculate[0][0]) + "\t"+ "Slugging percent: " + number.format(calculate[0][1]);
		System.out.println(message);
		
	}while(Validator.getString(sc, "Do you want to check another batter(y/n)? "));
	
}
	
	private static class AtBat {
    	
		int batters;
		double result;
		
		public AtBat() {
			batters = 0;
			result  = 0;
    	}

		public void setResult(double d) {
			// TODO Auto-generated method stub
			result = d;
		}

		public void setPlayers(int batters1) {
			// TODO Auto-generated method stub
			batters = batters1;
			
		}
		
	}
	
}
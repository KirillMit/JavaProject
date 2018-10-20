package odin;

import java.util.Scanner;

public class dva {
	public static void result(int[][] local_x) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < local_x.length; i++){
			for(int j = 0; j < local_x[i].length; j++){
				System.out.print(local_x[i][j]+ " ");	
			}
			System.out.println();
		}
			
	}
	public static int sum(int[][] x){
		int total = 0;
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x.length; j++){
				total += x[i][j];	
			}
		}
		return total;
	}
}

package org.arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		int dev[][]=new int[2][3];
		dev[0][0]=23;
		dev[0][1]=33;
	    dev[0][2]=44;
		dev[1][0]=55;
		dev[1][1]=66;
		dev[1][2]=77;
		System.out.println(dev.length);
		System.out.println(dev[1][2]);
		
		for(int i=0; i<dev.length; i++) {
			for(int j=0; j<dev[i].length; j++) {
			System.out.println(dev[i][j]);
		}
		}
		
		for(int[] s:dev) {
			for(int y:s) {
			
			System.out.println(y);
		}
	}}
}
	
	
	
	
	
	
	
		
	
	
	
	
	
	


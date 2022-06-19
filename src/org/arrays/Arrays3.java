package org.arrays;

public class Arrays3 {
public static void main(String[] args) {
	

	
	int d[]=new int[3];{
	
	d[0]=15;
	d[1]=30;
	d[2]=45;
	
	System.out.println(d.length);
	System.out.println(d[1]);
	
	for(int i=0;i<3;i++) {
		System.out.println(d[i]);
	}
		for(int dev:d) {
			System.out.println(dev);
		}
	}
}
}
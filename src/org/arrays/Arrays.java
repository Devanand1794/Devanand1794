package org.arrays;

public class Arrays {

	public static void main(String[] args) {
		int a[]=new int[6];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
a[4]=50;
a[5]=60;

int b[]= {10,20,30,40,50,60};
String c[]= {"dev", "anand", "dar", "mega"};

System.out.println(a.length);
System.out.println(b.length);
System.out.println(c.length);


System.out.println(a[4]);

for(int i=0; i<a.length;i++) {
System.out.println(a[i]);

	}


for(int dev:a) {
	
	System.out.println(dev);
}
System.out.print(" ");
}}
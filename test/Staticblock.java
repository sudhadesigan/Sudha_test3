package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staticblock {

	static boolean flag = true;
	static Scanner sc = new Scanner(System.in);
static	int B= sc.nextInt();
static	int H = sc.nextInt();

static
{

if (B<=0 || H<=0)
{
	flag=false;
	System.out.println("Not correct Input");
}


}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	
		
			if(flag==true){
				int area=B*H;
				System.out.print(area);
			}
	
			

		
	}

}

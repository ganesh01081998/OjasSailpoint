package demo;

import java.io.DataInputStream;
import java.io.*;
import java.util.Scanner;

public class hai {
		static boolean odd(int number1)
		{
			if ((number1%2)!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public static void main(String[] args)throws IOException {
			// TODO Auto-generated method stub
			int number1,number2,i,j,k,sum=0;
			Scanner in =new Scanner(System.in);
			System.out.println("Enter the number1");
			number1=Integer.parseInt(in.next());
			System.out.println("Enter the number2");
			number2=Integer.parseInt(in.next());
			while(number1!=0)
			{
				if(odd(number1))
				{
					sum=sum+number2;
				}
				number1=number1/2;
				number2=number2*2;
			}
			
			System.out.println("Value is:"+sum);
			

		}

	}
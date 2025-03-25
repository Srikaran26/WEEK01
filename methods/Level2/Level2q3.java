import java.util.Scanner;
class Level2q3{
	public static void LeapYear(int year){
		if (year<1582){
			System.out.println("Year isnt part of Gregorian Calender");
		}
		else{
			if((year%4==0 && year%100!=0)|| (year%400==0)){
				System.out.println(year+" is a leapyear");
			}
			else{
				System.out.println(year+" is a not a leapyear");
			}
		}
	}
			
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year :");
		int leapyear=input.nextInt();
		Level2q3.LeapYear(leapyear);
	}
		}
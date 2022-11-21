
import java.util.Scanner;

public class TimesAndInstructors {
public static void main(String[] args) {
//storing the courses and times and instructors
String courses[]= {"CIS101","CIS210","MKT100","ACC150","CIS101"};
String time[]= {"Mon 9 am","Mon 11 am","Tues 8:30 am","Tues 6 pm","Fri 1 pm"};
String instructor[]= {"Farrell","Patel","Wong","Deitrich","Lennon"};
Scanner sc = new Scanner(System.in);
//reading the course name
System.out.println("Enter course name: ");
String str=sc.next();
boolean flag=false;
//iterating through the courses and printig the time and instructor
for(int i=0;i<courses.length;i++) {
if(courses[i].equals(str)) {
flag=true;
System.out.println(str+" ,Time : "+time[i]+", Instructor "+instructor[i]);
}
}
if(!flag)
System.out.println("Invalid Entry: No Such course.");
}
}

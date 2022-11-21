
import java.util.Scanner;

public class MeanMedian

{

public static void main(String args[]) {

// Initialize an int array for 9 elements

int array[]=new int[9];

// Declare the necessary variables

double mean, sum=0.0;

int median;

// Create the Scanner object

Scanner s=new Scanner(System.in);

System.out.println("Enter the numbers: ");

for(int i=0; i<array.length;i++)

{

// Read the user input into the array

array[i]=s.nextInt();

// Calculate the sum of the numbers

sum=sum+array[i];

}

// Calculate the mean

mean=sum/(array.length);

// Calculate the median

median=array[(array.length)/2];

System.out.println("The numbers entered are: ");

// Display the numbers of the array in the same line

System.out.println(java.util.Arrays.toString(array));

// Display the mean

System.out.println("The mean is: "+mean);

// Display the median

System.out.println("The median is: "+median);

}

}

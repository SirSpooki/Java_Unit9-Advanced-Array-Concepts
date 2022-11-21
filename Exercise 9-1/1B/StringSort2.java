//import util packages
import java.util.*;
//file name is StringSort2
public class StringSort2 {
    //initializing a scanner to  take input from user
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //total variable to count number of variables
        int total = 0;
        //list to store the user string inputs
        ArrayList<String> Stringinput = new ArrayList<>();
        //while input count is lessthan 15
        while (total < 15) {
            System.out.print("Enter Your String: ");
            //taking string inputs
            String in = sc.nextLine();
            //if input is equal to zzz, then stop
            if (in.equalsIgnoreCase("zzz")) {
                break;
            } else {
                Stringinput.add(in);
            }
            total=total+1;
        }
        //sorting the list having the input strings
        Collections.sort(Stringinput);
        //loop to print the strings in the list
        for (String string : Stringinput) {
            System.out.println(string);
        }
    }
}

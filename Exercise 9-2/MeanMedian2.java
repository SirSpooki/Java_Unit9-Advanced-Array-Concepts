import java.util.*;

class MeanMedian2 {
    public static void main(String[] args) {
        //defining an array with max capacity of 20
        int[] nums = new int[20];
        int num = 0;
        String entry;
        String list = "You entered: ";
        int a, b;
        int temp;
        double median;
        int total = 0;
        double mean = 0;
        final int QUIT = 9999;
        int size = 0;
        //defining a Scanner to read in user input
        Scanner input = new Scanner(System.in);
        //looping until the user enters the quit code OR when the array is full
        for (a = 0; num != QUIT && a < nums.length; ++a) {
            //asking for input
            System.out.print("Enter a number or 9999 to quit: ");
            //reading in the user input
            entry = input.nextLine();
            //converting the input to an integer
            num = Integer.parseInt(entry);
            //adding the number to the array IF it is not the quit code
            if (num != QUIT) {
                nums[a] = num;
                //adding the number to the total
                total += num;
                //appending the number to the string containing list of numbers
                list += num + " ";
                //incrementing the size 
                ++size;
            }
        }
        //displaying size and printing the list of numbers
        System.out.println("size is " + size);
        System.out.println(list);

        //looping and sorting the array
        int comparisonsToMake = size - 1;
        for (a = 0; a < size - 1; ++a) {
            for (b = 0; b < comparisonsToMake; ++b) {
                if (nums[b] > nums[b + 1]) {
                    temp = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = temp;
                }
            }
            --comparisonsToMake;
        }

        //computing mean value
        mean = (double) total / size;
        //computing median value
        if (size % 2 == 0) {
            //if the size is even, the median is the average of the two middle numbers
            median = (nums[size / 2] + nums[size / 2 - 1]) / 2.0;
        } else {
            //if the size is odd, the median is the middle number
            median = nums[size / 2];
        }

        //displaying the mean and median values
        System.out.println("The mean is " + mean +
                " and the median is " + median);

    }
}

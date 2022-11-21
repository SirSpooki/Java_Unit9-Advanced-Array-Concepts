import java.util.Scanner;

public class SortPurchasesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating an array of five Purchase objects
        Purchase purchases[] = new Purchase[5];

        // reading inputs from user
        for (int i = 0; i < 5; i++) {
            // creating object for Purchase class
            purchases[i] = new Purchase();

            // reading invoice number and sale amount from user
            System.out.print("Enter invoice number >> ");
            purchases[i].setInvoiceNumber(sc.nextInt());
            System.out.print("Enter sale amount >> ");
            purchases[i].setSaleAmount(sc.nextDouble());
        }
        // to store choice entered by user
        char choice;

        // flushing any data from input memory
        sc.nextLine();

        do {
            // prompting user for menu
            System.out.println("\nSort Purchases by (I)nvoice number, or (S)ale amount? ");
            System.out.print("\tor enter Z to quit >> ");

            // reading user choice
            choice = sc.nextLine().charAt(0);

            switch (choice) {
                case 'I':
                    sortByInvoice(purchases);
                    display(purchases, "invoice number");
                    break;
                case 'S':
                    sortBySaleAmount(purchases);
                    display(purchases, "sale amount");
                    break;
                case 'Z':
                    break;
                default:
                    System.out.println("Error: Invalid choice");
            }
        } while (choice != 'Z');
    }

    public static void sortBySaleAmount(Purchase[] array) {
        // Sorting using selection sort technique
        int i, j, min, size = array.length;

        // temp variable to swap addresses
        Purchase temp;
        for (i = 0; i < size - 1; i++) {
            // storing first position of the array
            min = i;
            // finding position of minimum sale amount object
            for (j = i + 1; j < size; j++) {
                // storing minimum position to min between two objects
                if (array[j].getSaleAmount() < array[min].getSaleAmount())
                    min = j;
            }
            if (i != min) {
                // swapping between min and i
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void sortByInvoice(Purchase[] array) {
        // Sorting using selection sort technique
        int i, j, min, size = array.length;

        Purchase temp;
        for (i = 0; i < size - 1; i++) {
            // temp variable to swap addresses
            min = i;
            // finding position of minimum sale amount object
            for (j = i + 1; j < size; j++) {
                // storing minimum position to min between two objects
                if (array[j].getInvoiceNumber() < array[min].getInvoiceNumber())
                    min = j;
            }
            if (i != min) {
                // swapping between min and i
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void display(Purchase[] p, String msg) {
        // Write your code here
        System.out.println("\nSorted by " + msg + "\n");

        // iterating over array p[] and displaying each object
        for (int i = 0; i < p.length; i++)
            p[i].display();
    }
}

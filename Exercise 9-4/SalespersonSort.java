import java.util.*;
public class SalespersonSort {

public static void main(String[] args) {
Salesperson salesPrsn[]=new Salesperson[7];
Scanner scnr=new Scanner(System.in);
int id;
double sales;
char choice;
for(int i=0;i<salesPrsn.length;i++)
{
System.out.print("\nEnter Id for salesperson #"+(i+1)+": ");
id=scnr.nextInt();
System.out.print("Enter Sales for salesperson #"+(i+1)+": ");
sales=scnr.nextDouble();
salesPrsn[i]=new Salesperson(id, sales);
}
System.out.println("Display Salespersons ordered by (I)D number or (S)ales value");
System.out.print("Your choice: ");
choice=scnr.next().charAt(0);
if(choice=='I' || choice=='i')
{
sortByID(salesPrsn);
}
else if(choice=='s' || choice=='S')
{
sortBySales(salesPrsn);
}
System.out.println("ID\tSales");
for(int i=0;i<salesPrsn.length;i++)
{
System.out.println(salesPrsn[i].getId()+"\t"+salesPrsn[i].getSales());
}
}

private static void sortBySales(Salesperson[] salesPrsn) {
Salesperson temp;
for(int i=0;i<salesPrsn.length-1;i++)
{
for(int j=i;j<salesPrsn.length;j++)
if(salesPrsn[i].getSales()>salesPrsn[j].getSales())
{
temp=salesPrsn[i];
salesPrsn[i]=salesPrsn[j];
salesPrsn[j]=temp;
}
}
}

private static void sortByID(Salesperson[] salesPrsn) {
Salesperson temp;
for(int i=0;i<salesPrsn.length-1;i++)
{
for(int j=i;j<salesPrsn.length;j++)
if(salesPrsn[i].getId()>salesPrsn[j].getId())
{
temp=salesPrsn[i];
salesPrsn[i]=salesPrsn[j];
salesPrsn[j]=temp;
}
}

}

}

import java.util.Arrays;
import java.util.Scanner;
public class Selection1
{
  public static void main(String[] args)
{
   System.out.println("_______________________________________________");         
   System.out.println("~  Sort string array using Selection Sort ~ ");
   System.out.print("Enter size of name list: ");
   Scanner scanner = new Scanner(System.in);
   int size = scanner.nextInt();
   System.out.println("Enter names to perform Selection sort: ");
   String[] name = new String[size];
   for(int i=0;i<size;i++)
{
   System.out.print(i+1 + ".");
   name[i] = scanner.next();
}
 System.out.println("unsorted list: " + Arrays.toString(name));
  
  String temp = " ";
for(int i=0;i<size;i++)
    
{ 
  
   int min=i;
  for(int j=i+1;j<size;j++)
 {
     if(name[j].compareTo(name[min])<0)
{

  min=j;
}
}
  temp = name[i];
  name[i] = name[min];
  name[min] = temp;
} 
   for(int i=0;i<size;i++)
{
 System.out.println(name[i] + " ");
}
  System.out.println("sorted list: " + Arrays.toString(name));
}
}
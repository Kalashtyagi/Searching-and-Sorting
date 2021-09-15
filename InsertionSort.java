import java.util.Scanner;
import java.util.Arrays;
public class InsertionSort
{
  public static void main(String[] args)
{
  System.out.println("________________________________________");
  System.out.println("~Insertion sort ~");
  System.out.print("Enter size of elements: ");
  Scanner scanner = new Scanner(System.in);
  int size = scanner.nextInt();
   System.out.print("Enter Elements: ");
   int[] element = new int[size];
   for(int i=0;i<size;i++)
{
   System.out.print(i+1 + ".");
   element[i] = scanner.nextInt();
}
  System.out.println("Unsorted list: " + Arrays.toString(element));
int temp ,j;
 for(int i=1;i<size;i++)
{
   temp = element[i];
   j=i;
   while(j>0 && element[j-1]>temp)
{
   element[j] = element[j-1];
    j=j-1;
}
 element[j] = temp;
}

  System.out.println("~ sorted list ~");
  for(int i=0;i<size;i++)
{
 System.out.print(element[i] + " ");
}}}  

import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort
{
  public static void main(String[] args)
{
   System.out.println("_______________________________________________");         
   System.out.println("~ Selection Sort ~ ");
   System.out.print("Enter size of elements: ");
   Scanner scanner = new Scanner(System.in);
   int size = scanner.nextInt();
   System.out.println("Enter elements to perform Selection sort: ");
   int[] element = new int[size];
   for(int i=0;i<size;i++)
{
   System.out.print(i+1 + ".");
   element[i] = scanner.nextInt();
}
 System.out.println("unsorted list: " + Arrays.toString(element));
  
  int temp;
for(int i=0;i<size;i++)
    
{ 
  
   int min=i;
  for(int j=i+1;j<size;j++)
 {
     if(element[j]<element[min])
{

  min=j;
}
}
  temp = element[i];
  element[i] = element[min];
  element[min] = temp;
} 
   for(int i=0;i<size;i++)
{
 System.out.println(element[i] + " ");
}
  System.out.println("sorted list: " + Arrays.toString(element));
}
}
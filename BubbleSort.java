import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
{
 public static void main(String[] args)
{    
     System.out.println("______________________________\n");
     System.out.println("This is Bubble sort program........\n");
     Scanner input = new Scanner(System.in);
     System.out.print("Enter size of elements: ");
     int size = input.nextInt();
     int[] element = new int[size];
     System.out.println("Enter elements:");
   for(int i=0 ; i<size; i++)
{
     
     System.out.print(i+1 + ":" );
     element[i] = input.nextInt();
      
    

}
     System.out.println("Unsorted elements: " + Arrays.toString(element));
     int temp;
  for(int i=0;i<size;i++)
{
     int flag =0;

  for( int j=0;j<size-1-i;j++)
{
    
    if(element[j] > element[j+1])
{
   temp = element[j];
    element[j] = element[j+1];
   element[j+1] = temp;
  flag = 1;
}
}

if(flag==0)
{
  break;
}
}
  System.out.println("~ Sorted List ~ ");
for(int i=0;i<size;i++)
{
  System.out.print(element[i] + " \n");
}
System.out.println(Arrays.toString(element));

  
}
}

    
  
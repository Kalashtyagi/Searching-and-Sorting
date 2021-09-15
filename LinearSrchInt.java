import java.util.Scanner;
import java.util.Arrays;
public class LinearSrchInt
{
  public static void main(String[] args)
{
   System.out.println("__________________________________________");
   System.out.println("~ Linear Search ~");
   System.out.print("Enter number of elements: ");
   Scanner scanner = new Scanner(System.in);
   int size = scanner.nextInt();
   int[] element = new int[size];
   System.out.print("Enter elements: ");
   for(int i=0;i<size;i++)
{
    System.out.print(i+1 + ":");
    element[i] = scanner.nextInt();
}
   System.out.println("list: " + Arrays.toString(element));
   System.out.print("Enter element for searching: ");
   int Item = scanner.nextInt();
   int temp=0;
  for(int i=0;i<size;i++)
{
 
   if(Item==element[i])
{
   System.out.println("Item is  present at "+i+" index  position");
    temp=temp+1;
}
}
  if(temp ==0)

{
    System.out.println( Item + " is not found in this list");
}
}
}
   
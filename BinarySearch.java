import java.util.Scanner;
import java.util.Arrays;
 public class BinarySearch
{
  public static void main(String[] args)
{
  System.out.println("_________________________________\n");
  System.out.println("~ Binary Search ~ \n");
  System.out.println("_________________________________\n");
  System.out.print("Enter size of list: ");
  Scanner scanner = new Scanner(System.in);
  int size = scanner.nextInt();
  System.out.println("Enter sorted list as you know binarysearch technique search element in sorted list: ");
  int[] element = new int[size];
  for(int i=0;i<size;i++)
{
  System.out.print(i+1 + ":");
  element[i] = scanner.nextInt();
}
  System.out.print("Enter Item to find in list: ");
  int item = scanner.nextInt();
  int low=0, high=size-1, mid=(low+high)/2, temp=0;
  while(low<=high)
{
  if(element[mid]==item)
{
  System.out.println(item + " is found at "+mid+" index position");
   temp = temp+1;
  break;
 }
  else if(element[mid]<item)
{
   low=mid+1;
}
  else if(element[mid]>item)
{
   high = mid-1;
}
  mid=(low+high)/2;
}
  if(temp == 0)
{
   System.out.println(item + " is not found in this list");

}}}
  
import java.util.Scanner;
import java.util.Arrays;
public class LinearSrchStrng
{
 public static void main(String[] args)
{
   System.out.println("______________________________________");
   System.out.println("Sort StringArray using linear search\n");
   System.out.print("Enter number of names: ");
   Scanner scanner = new Scanner(System.in);
   int size = scanner.nextInt();
   System.out.print("Enter names to sort: "); 
    String[] Names = new String[size];
   for(int i=0;i<size;i++)
{
    System.out.print(i+1 + ":");
    Names[i] = scanner.next();
 } System.out.println("Names list: " + Arrays.toString(Names));
   System.out.print("Enter Name to find in this list: ");
   String Srch = scanner.next();
   int temp=0;
  for(int i=0;i<size;i++)
{
   if(Names[i].equals(Srch))
{
   System.out.print( Srch + " name is present at "+i+" index position");
    temp=temp+1;
}
} 
   if(temp==0)
{
  System.out.println(Srch + " is not found in this list");
}
}}

   
   

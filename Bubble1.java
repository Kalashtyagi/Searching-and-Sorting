import java.util.Arrays;
import java.util.Scanner;
public class Bubble1
{
  public static void main(String[] args)
{
  System.out.println("___________________________________");
  System.out.println("Stringarray sort using bubble sort....\n");
  System.out.print("Enter number of Names:");
  Scanner input = new Scanner(System.in);
  int num = input.nextInt();
  String[] names = new String[num];
  System.out.print("Enter Names:");
for(int i=0;i<num;i++)
{ 
   System.out.print(i+1 + ":" );
   names[i] = input.next();
}
 System.out.println("Unsorted names:" + Arrays.toString(names));

 String temp;
 for(int i=0;i<num-1;i++)
{
   int flag=0;
  for( int j=0;j<num-1;j++)
{
 if(names[j].compareTo(names[j+1])>0)
{
 temp = names[j];
  names[j] = names[j+1];
 names[j+1] = temp;
 flag=1;
}
}
if(flag==0)
{
break;
}
}
System.out.println("~Sorted~");
for(int i=0;i<num;i++)
{
  System.out.print(names[i] + " ");
}

}}
  
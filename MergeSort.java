import java.util.Scanner;
 class MergeSort
{
 int[] array;
 int[] tempMergeArr;
 int length;
 public static void main(String[] args)
 {
  System.out.println("______________________________________________");
  System.out.println("~ Merge sort ~");
  System.out.print("Enter size of elements: ");
  Scanner scanner = new Scanner(System.in);
  int size = scanner.nextInt();
  System.out.print("Enter elements: ");
  int[] inputArr= new int[size];
for(int i=0;i<size;i++)
{
  System.out.print(i+1 + ".");
  inputArr[i] = scanner.nextInt();
}
  MergeSort ms=new MergeSort();
  ms.sort(inputArr);
 System.out.println("__Sorted list__");
  for(int i:inputArr)
  {
   System.out.print(i+" ");
  }
 }
 
 public void sort(int inputArr[])
 {
  this.array=inputArr;
  this.length=inputArr.length;
  this.tempMergeArr=new int[length];
  divideArray(0, length-1);
 }

 public void divideArray(int lowerIndex, int higherIndex)
 {
  if(lowerIndex<higherIndex)
  {
   int middle=lowerIndex+(higherIndex-lowerIndex)/2;

   //it will sort the left side of an array
   divideArray(lowerIndex, middle);

   //it will sort the right side of an array
   divideArray(middle+1, higherIndex);

   mergeArray(lowerIndex, middle, higherIndex);
  }
 }

 public void mergeArray(int lowerIndex, int middle, int higherIndex)
 {
  for(int i=lowerIndex; i<=higherIndex; i++)
  {
   tempMergeArr[i]=array[i];
  }

  int i=lowerIndex;
  int j=middle+1;
  int k=lowerIndex;
  while(i<=middle && j<=higherIndex)
  {
   if(tempMergeArr[i] <= tempMergeArr[j])
   {
    array[k]=tempMergeArr[i];
    i++;
   }
   else
   {
    array[k]=tempMergeArr[j];
    j++;
   }
   k++;
  }

  while(i<=middle)
  {
   array[k]=tempMergeArr[i];
   k++;
   i++;
  }
 }
}
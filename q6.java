
public class q6 {
     public static void main(String[] args) {
	int arr[] = {2, 3, 4, 5, 1, 5, 4, 3, 2};
	int arr2[] = new int[10];
	int temp;
	int pass = 0;

for (int i = 0; i < arr.length; i++) {
   for (int j = i + 1; j < arr.length; j++)
	{
	   if(arr[i] > arr[j])
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
 }

for (int i = 0; i < arr.length; i++) {
	System.out.print(" "+arr[i]);
    }

int loc=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		loc=loc^arr[i];
	}
	System.out.println();
	System.out.println("Value not in group is: "+loc);
    }
}

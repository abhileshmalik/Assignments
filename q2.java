package assignment1.java2;

public class q2 {

    public static void main(String[] args) {
        String a="Abhilesh";
        int i,j;
        char temp;
        char arr[]= a.toCharArray();

        for(i=0;i<arr.length;i++)
        {
            for (j=0;j<arr.length;j++)
            {
                if (arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        String b=new String(arr);
        System.out.println(b);
    }

}

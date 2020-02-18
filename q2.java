class q2
{
	public static void main(String[] args) {
		String s="hello abhi hello hey hi hi";
		String []temp;
		int count,i,j;

		temp=s.split(" ");

		for(i=0;i<temp.length;i++)
		{
		    count=1;
		    for(j=i+1;j<temp.length;j++)
		    {
			if(temp[i].equals(temp[j]))
		        {
		    	    count++;
			    temp[j]="0";
		        }
		    }

		    if(count>1 && temp[i]!="0")
		    {
			System.out.println(temp[i] + "=" + count);
		    }
		    
		}
		
	}
}



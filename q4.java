public class q4
{
    public static void main(String args[])
    {
        String s1="Hello12#$ *Abhilesh23 TTN34";
        int k=0,l=0,m=0,k1,i,j=0,n=0;
        double k2=0.0,l2=0.0,m2=0.0,n2=0.0,j2=0.0;
        k1=s1.length();
        for(i=0;i<k1;i++)
        {
            char d=s1.charAt(i);
            if(Character.isUpperCase(d))
            {
                k=k+1;
            }
            else
            if(Character.isLowerCase(d))
            {
                l=l+1;
            }
            else
            if ((int)d >= 47 && (int) d<= 54)
            {
                m = m + 1;
            }
            else
            if(d==' ')
            {
                n=n+1;
            }
            else
            {
                j=j+1;
            }
        }
        //System.out.println(k);
        //System.out.println(k1);
        k2=((float)k/k1)*100;
        l2=((float)l/k1)*100;
        m2=((float)m/k1)*100;
        n2=((float)n/k1)*100;
        j2=((float)j/k1)*100;
        System.out.println("UPPERCASE LETTERS COUNT: "+k+" PERCENTAGE: "+k2);
        System.out.println("LOWERCASE LETTERS COUNT: "+l+" PERCENTAGE: "+l2);
        System.out.println("NUMBERS COUNT: "+m+" PERCENTAGE: "+m2);
        System.out.println("SPACE COUNT: "+n+" PERCENTAGE: "+n2);
        System.out.println("SPECIAL CHARACTER COUNT: "+j+" PERCENTAGE: "+j2);


    }
}

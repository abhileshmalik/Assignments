class bank {
    int rate_of_int;
    String branch;
}

class icici extends bank{

    icici(int r, String b)
    {
        this.rate_of_int=r;
        this.branch=b;
    }
    void get_details()
    {
        System.out.println("******ICICI Bank******");
	System.out.println("rate of interest="+rate_of_int);
        System.out.println("branch="+branch);
	System.out.println(" ");
    }
}

class sbi extends bank{

    sbi(int r, String b)
    {
        this.rate_of_int=r;
        this.branch=b;
    }
    void get_details()
    {
	System.out.println("******SBI******");        
	System.out.println("rate of interest="+rate_of_int);
        System.out.println("branch="+branch);
	System.out.println(" ");
    }
}

class boi extends bank{

    boi(int r, String b)
    {
        this.rate_of_int=r;
        this.branch=b;
    }
    void get_details()
    {
	System.out.println("******BOI******");
        System.out.println("rate of interest="+rate_of_int);
        System.out.println("branch="+branch);
	System.out.println(" ");
    }
}

class q11{
    public static void main(String[] args) {
        icici o1=new icici(5,"delhi");
        o1.get_details();
        sbi o2=new sbi(6,"banglore");
        o2.get_details();
        boi o3=new boi(4,"mumbai");
        o3.get_details();
    }
}

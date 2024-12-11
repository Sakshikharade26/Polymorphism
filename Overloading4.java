 class Demo {
    int A ;
    String B;

    public int Addition(int A, int  B)//method declaration
    {
       return A + B;
    }

    public String Addition(String A , String B){
        return A + B;
    }

    public void Addition( int A, String B){
        System.out.println("Inside Arithematic is");
    }

    public void Addition(String A, int B){
        System.out.println("Inside Arithematic is");
    }
    
}

class Overloading4{

    public static void main(String args[]){

            Demo  dobj = new Demo();//creating a object

        int iret = 0;
        String sret= new String();

        iret=dobj.Addition(11,78);
        System.out.println("Addition is:" + iret);
        sret =dobj.Addtition("Sita","Gita");
        System.out.println("Addition is:" + sret);
        dobj.Addition(12,"Sonal");
        dobj.Addition("Kiran", 13);

    }
}

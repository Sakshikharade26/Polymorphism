class Arithematic{
    int A;
    double B;

    public int Substraction(int A,int B)
    {
        return A - B;
    }

    public int Substraction(int A, int B,int C)
    {
        return A - B - C;
    }

    public void Substraction(int A, double B)
    {
    System.out.println("Inside first Substraction");
    }

    public double Substraction(double A,double B)
    {
        return A - B;
    }

    public void Substraction(double A, int B)
    {
     System.out.println("Inside first Substraction");
    }


    }

    class Overloading3{

        public static void main(String args[]){

            Arithematic aobj = new Arithematic();

           int iret = 0;
           double dret = 0.0;

           iret = aobj.Substraction(67,67);
           System.out.println("Substraction is:" + iret);
           iret = aobj. Substraction(89,87,45);
           System.out.println("Substraction is :"+ iret);
           dret = aobj. Substraction(10.0,4.9);
           System.out.println("Substraction is:" + dret);
           aobj.Substraction(11,7.8);
           aobj.Substraction(67.0,33);
        }
    }
    


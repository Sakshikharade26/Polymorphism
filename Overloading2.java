 class Arithematic {
    int a;
    int b;

  public int multiplication(int A,int B){
 return A * B;
  }

  public int multiplication(int A, int B,int C){
    return A * B * C;
  }

  public double multiplication(Double A, Double B){
    return A * B;
  }

  public void multiplication(int A, Double B){
    System.out.println("Inside First multiplication");
  }

  public void multiplication(double A, int B){
    System.out.println("Inside Second multiplication");
  }
}

class Overloading2{

    public static void main(String args[]){

        Arithematic aobj = new Arithematic();
        
        int iret = 0;
        double dret =0.0;

        iret = aobj.multiplication(10,45);
        System.out.println("Multiplication is:" + iret);
        iret = aobj. multiplication(13,67,89);
        System.out.println("Multiplication is:" + iret);
       dret = aobj.multiplication(10.8,90.99);
      System.out.println("Multiplication is : " + dret);
      aobj.multiplication(11,90.99);
      aobj.multiplication(90.99,11);
    }
}
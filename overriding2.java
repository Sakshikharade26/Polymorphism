class Demo {

    public void moon(){
        System.out.println("Inside the base moon ");
    }

    public void run(){
        System.out.println("Inside the base run");
    }
}

    class Derived extends  Demo{

        public void moon(){
            System.out.println("Inside the Derived moon");
        }

        public void sun(){
            System.out.println("Inside the Derived sun");

        }

    }

    class overriding2{

        public static void main(String args[]){
            Demo dobj = new Derived();
            dobj.moon();
            dobj.run();
           //dobj.sun();
        }

    }

    


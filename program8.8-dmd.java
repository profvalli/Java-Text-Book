//Program 8.8 Program to demonstrate Dynamic Method dispatch 
//dmd.java
class p1
{
  void override ()
  {
	System.out.println ("inside p1");
  }
}
class p2 extends p1{
    void override(){
        System.out.println("inside p2");
    }
}
class p3 extends p2{
    void override(){
        System.out.println("inside p3");
    }
}

class dmd{
    public static void main(String args[]){
        p1 a=new p1();
        p2 b=new p2();
        p3 c=new p3();
        p1 r;
        r=a;
        r.override();
        r=b;
        r.override();
        r=c;
        r.override();
    }
}

/* Output:
inside p1
inside p2
inside p3
*/

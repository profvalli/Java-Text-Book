//Program 8.10 Program to prevent overriding
//preventOverride.java
class p1{
    final void show(){
        System.out.println("This is final show()");
    }
}

class p2 extends p1{
    //we cannot override show()
    void show(){
        System.out.println("This is invalid");
    }
}

class preventOverride{
    public static void main(String args[]){
    p2 x=new p2();
    x.show();
}
}

/*
Output:
preventOverride.java:11: error: show() in p2 cannot override show() in p1
    void show(){
         ^
  overridden method is final
1 error

*/

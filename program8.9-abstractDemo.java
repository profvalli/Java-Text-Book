//Program 8.9 Program to demonstrate abstract class
//abstractDemo.java
abstract class p1{  //p1 is an abstract class
abstract void show(); //show() is an unimplemented function
void show2(){
    //show2() is an implemented function
   System.out.println("in class p1 show2()");
}
}
class p2 extends p1{ //p2 is subclass of p1
void show() {  //show which was unimplemented in p1 is implemented here
System.out.println("in class p2 show()");
}
}
class abstractDemo{
    public static void main(String args[]){
    p2 x=new p2();
    x.show();
    x.show2();
}
}

/* Output:
in class p2 show()
in class p1 show2()
*/

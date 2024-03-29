//Program 8.11 Program to prevent inheritance

final class p1{  //place keyword final before class 
    final void show(){
        System.out.println("This is final class p1 show()");
    }
}

class p2 extends p1{
    //this is not valid
}

class preventInheritance{
    public static void main(String args[]){
    p2 x=new p2();
    x.show();
}
}

/*

preventInheritance.java:9: error: cannot inherit from final p1
class p2 extends p1{
                 ^
1 error
*/

//Program 7.4 Program to pass objects to methods.
//passObj.java
class test{

int a,b;

test(int i,int j){

a=i;

b=j;

}

boolean equals(test ob){

if(ob.a==a&&ob.b==b) return true;

else return false;

}

}

class passObj{

public static void main(String args[]){

test ob1=new test(100,22);

test ob2=new test(100,22);

test ob3=new test(-1,-1);

System.out.println("ob1==ob2:"+ob1.equals(ob2));

System.out.println("ob1==ob3:"+ob1.equals(ob3));

}

}
/*
Output:
ob1==ob2:true
ob1==ob3:false
*/

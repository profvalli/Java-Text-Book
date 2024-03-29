//overRide.java

class p1
{

  int i, j;

    p1 (int a, int b)
  {

	i = a;

	j = b;
  }
  
  //method show() prints i and java
  void show(){
      System.out.println("i="+i+"j="+j);
  }
  
  }
class p2 extends p1
{
    int k;
    p2(int a, int b, int c){
        super(a,b);
        k=c;
    }
    //the following show() function overrides show() of p1
    void show(){
        System.out.println("k:="+k);
    }
}
class overRide{
    public static void main(String args[]){
        p2 ex=new p2(1,2,3);
        ex.show(); //this execures p2 show()
    }
}


/*
Output
k:=3
*/
        
    

    

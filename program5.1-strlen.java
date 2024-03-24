//strlen.java
import java.lang.*;

class len{

public static int findlen(String s){

int i,length;

length=s.length();

return length;

}

}

class strlen{

public static void main(String args[]){

StringBuffer s =new StringBuffer("finding my length?");

System.out.println(len.findlen(s.toString()));

}

}

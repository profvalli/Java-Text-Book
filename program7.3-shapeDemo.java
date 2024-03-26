Program 7.3 Program to demonstrate function overriding
//shapeDemo.java

class shape{

void draw(){}

void erase(){}

}

class circle extends shape{

void draw(){

System.out.println("draw circle");

}

void erase(){

System.out.println("erase circle");

}

}

class square extends shape{

void draw(){

System.out.println("draw square");

}

void erase(){

System.out.println("erase square");

}

}

class triangle extends shape{

void draw(){

System.out.println("draw triangle");

}

void erase(){

System.out.println("erase triangle");

}

}

class rectangle extends shape{

void draw(){

System.out.println("draw rectangle");

}

void erase(){

System.out.println("erase rectangle");

}

}

class shapeDemo{

public static void main(String args[])

{

triangle t =new triangle();

t.draw();

circle c = new circle();

c.draw();

rectangle r = new rectangle();

r.draw();

}

}

/*
Output:
draw triangle
draw circle
draw rectangle
*/

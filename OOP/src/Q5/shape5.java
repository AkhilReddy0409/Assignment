package Q5;

abstract class Shape5{  
abstract public void draw();  
}  
  
class Rectangle5 extends Shape5{  
 public void draw(){
	System.out.println("Rectangle");
}  
}  
class Line5 extends Shape5{  
public void draw(){
	System.out.println("LINE");
}  
}
class Cube5 extends Shape5{  
public void draw(){
	System.out.println("CUBE");
}  
}  
  
class a2q5{  
public static void main(String args[]){  
Cube5 c=new Cube5();  
c.draw();  
}  
} 
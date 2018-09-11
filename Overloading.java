//Overloading Method/Constructor in Java
package javaapplication2;

class Overloading{
    private int a;  //Here this a is object level variable       
    void display(){
        System.out.println("Method: 1 Without Parameter");
    }
    void display(int a,double b){ //Here this a is local variable 
        System.out.println("Method: 2 With Parameter a = " +a+ " b = "+b);
    }
    void display(double b,int a){
        System.out.println("Method: 3 With Parameter, Just I changed the parameter order b = "+b+" a = "+a);
    }
}
public class demo{   
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.display();
        obj.display(1, 1.1);
        obj.display(1.1, 1);
    }
}

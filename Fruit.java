package oops.handson;

class Fruit//hierarchial inheritence
{  
          String name, taste, size;  
          void eat() {  
          System.out.println("Eating");  
          }  
}  
     class Apple extends Fruit 
     {  
         Apple() 
         {  
               name = "Apple";  
               taste = "sweet";  
          }  
          @Override  
          void eat()
           {  
               System.out.println(name + " is "+ taste + " in taste.");  
          }  
     }  
     class Orange extends Fruit 
     {  
          Orange() 
          {  
               name = "Orange";  
               taste = "sour";  
          }  
          @Override  
          void eat() 
          {  
               System.out.println(name + " is "+ taste + " in taste.");  
          }       
     }  
      class Q {  
          public static void main(String[] args) {  
               Fruit fruit = new Fruit();  
               Apple apple = new Apple();  
               Orange orange = new Orange();  
               fruit.eat();  
               apple.eat();  
               orange.eat();  
          }  
    } 

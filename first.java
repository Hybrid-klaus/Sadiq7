package oops.handson;

public class first {  
            double width;  
            double height;  
            double depth;  
           first(int width, int height, int depth){  
                this.width = width;  
                this.height = height;  
                this.depth = depth;  
           }  
           double Volume() {  
                return width * height * depth;  
           }  
           public static void main(String[] args) {   
                first box = new first(10, 20, 30);  
                System.out.print("volume of Box is " + box.Volume());  
           }  
      }  

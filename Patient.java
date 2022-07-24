package oops.handson;
public class Patient {  
           String patientName;  
           double height, weight;  
           Patient(String name, double height, double weight){  
                this.patientName = name;  
                this.height = height;  
                this.weight = weight;  
           }  
           double computeBMI()
            {  
                return ( weight / ( height * height ) );  
           }  
           public static void main(String[] args)
            {  
                Patient patient = new Patient("ME", 177.54, 59);  
                System.out.println("\nBMI=" + patient.computeBMI());  
    }  
 } 
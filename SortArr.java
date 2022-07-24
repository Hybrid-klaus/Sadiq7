public class SortArr {    
    public static void main(String[] args) {            
        int  arr[] = new int [] {10,2,9,1,4};     
        int temp = 0;      
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }      
        System.out.println("Sorted order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    

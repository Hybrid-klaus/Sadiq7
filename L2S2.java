public class L2S2 
{
     public static void main(String[] args) 
    {
            int a;
            int arr[] = {1,2,3,4,5,6,7,8,9};
            int count = arr.length;
    
            for (int i=0; i<count; i++) {
    
                for (int j=i+1; j<count; j++) {
                    
                      if(arr[i]>arr[j]) { //performing Sorting
    
                          a = arr[i];
                          arr[i] = arr[j];
                          arr[j] =a;  
                      }
                }
            }
            System.out.println("Smallest 2 No. : "+arr[0]+" , "+arr[1]);
            System.out.println("Largest 2 No. : "+arr[count-1]+" , "+arr[count-2]);
        }    
}

public class MInMaxArr {
    public static void main(String args[])
    {
    int  arr[] = { 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
            else{
                min=e;
            }
        }
        System.out.println("maximum element in this array is: "+ max);
        System.out.println("minimum element in this array is: "+ min);
}
}

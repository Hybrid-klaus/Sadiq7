public class sumAvgarr {
    public static void main(String[] args) {
        int [] marks = {10,20,30,40,50};
        int sum = 0;
        int avg=0;
        for(int element:marks){
            sum = sum + element;
            avg=sum/5;
        }
        System.out.println("The value of sum  is " + sum);
        System.out.println("The value of avg  is " + avg);
    }
}

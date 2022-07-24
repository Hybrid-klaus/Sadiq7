public class Divide10 {
    public static void main(String args[])
    {
        int  c=1;//loop counter how many no.s divided by 2,3 and 5
        for(int i=1;c<=5;i++)
        {
            if((i%2==0 && i%3==0 && i%5==0))
            {
                System.out.println(i);
                c++; //increasing the counter by 1, so that every time the loop repeats
            }
        }
    }  
}

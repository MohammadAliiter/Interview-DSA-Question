public class Reverse_a_number
{
    public static void main (String[]args)
    {

        
        int num = 1234, reverse = 0, rem;

                                                    //1st itration              2nd itration
    
        while (num != 0)                           // 1234 != 0                   123 != 0
        {
            rem = num % 10;                        // rem = 4                     rem = 3
            reverse = reverse * 10 + rem;        //  reverse = 0*10 + 4 = 4     reverse = 4*10 + 3 =   43  
            num = num/10;                           // num = 1234/10 = 123       num = 123/10 = 12
        };

        
        System.out.println ("Reversed Number: " + reverse);
    }
}
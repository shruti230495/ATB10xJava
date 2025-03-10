public class lab016_reversenum {
    public static void main(String[] args){
        int num =121;
        int orignalnum = num;
        int reversenum = 0;

        while(num!=0)
           {
                       reversenum = (reversenum*10 + num%10);
                       num /= 10;
           }
             System.out.println(reversenum);

            if(orignalnum == reversenum)
            {
                System.out.println("Number is a Palindrome");
            }
            else {
                System.out.println("Number is not a Palindrome");
            }



       }
    }


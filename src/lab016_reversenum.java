public class lab016_reversenum {
    public static void main(String[] args){
        int num =1234;
        int reversenum = 0;

        while(num!=0)
           {
                       reversenum = (reversenum*10 + num%10);
                       num /= 10;
           }
           System.out.println(reversenum);
       }
    }


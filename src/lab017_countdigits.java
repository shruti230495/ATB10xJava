public class lab017_countdigits {
    public static void main(String[] args){
        int num= 43234;
        int count= 0;
        do
            {
                count++;
                num /= 10; //removing last digit
            } while(num != 0);
            {
                System.out.println(count);
            }
        }
    }


public class lab018_evenodd_count {
    public static void main(String[] args){
        int num =1234567;
        int even =0;
        int odd=0;

        while(num!=0) {
            int i = (int) (num % 10);//get the last digit
            {if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10; //remove the last digit
        }
        }
        System.out.println(even);
        System.out.println(odd);
        }
    }


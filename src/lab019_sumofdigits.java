public class lab019_sumofdigits {
    public static void main(String[] args) {
        int num = 12345678;
        int sum = 0;
        while (num != 0){
            sum+=(num % 10);
            num /= 10;}
            System.out.println(sum);

    }
}

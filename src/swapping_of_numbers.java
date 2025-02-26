public class swapping_of_numbers {
    public static void main (String[] args){
        //swapping of number using 3rd variable
        int a = 10;
        int b = 20;
        //before swapping
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);
        int c = a;
        a = b;
        b = c;
        //after swapping
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);

    }
}

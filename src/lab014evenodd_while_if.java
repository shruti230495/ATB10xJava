public class lab014evenodd_while_if {
    public static void main(String[] args){
        int i=1;
        while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println(i+"- "+"even");
                i++;
            }
            else
            {
                System.out.println(i+"- "+ "odd");
                i++;
            }
        }
    }
}

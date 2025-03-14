import static java.lang.System.*;

public class lab021_search_from_array {
    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        int b = 60;
        for(int i=0;i<a.length;i++)
        {
            if (a[i] == b)
            {
                System.out.println("Number is present in array");
            }
            else
            {
                System.out.println("Number is not present in array");
            }
            break;


        }

    }
}

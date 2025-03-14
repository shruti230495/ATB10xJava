public class lab022_count_from_array {
    public static void main(String[] args){
        int a[] ={10,20,10,30,40,20,10,20,30};
        int num=10;
        int count = 0;
        for(int value:a)
        {
            if (value == num)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

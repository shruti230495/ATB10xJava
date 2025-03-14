public class lab019_single_dimension_array {
    /*
    1. Declare an array.
    2.Assign values in array
    3.Find size of array
    4.Read single value in array
    5.Read multiple values in array.
     */
    public static void main(String[] args){
        //Approach 1
        int a[] = new int[5];//declaration of array
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        //Approach 2
       // int a[] ={100,200,300,400,500};
        //System.out.println("Length of array is " +a.length); //find size of array

        for(int x : a)
        {
            //print complete array
            System.out.println(x);
        }

    }
}

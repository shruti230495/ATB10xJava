public class lab009_switch {
    public static void main(String[] args){
        int weekno= 6;
        switch (weekno)
        {
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednusday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;
            case 7: System.out.println("Saturday");break;
            default : System.out.println("Invalid");
        }
    }
}

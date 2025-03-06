// public class StaticB {
//     static int a = 10;
//     static int b;

//     static {
//         System.out.println("This is a Static Block");
//         b = a * 5;
//     }

//     public static void main (String[] args){
//         System.out.println("The value of a is :"+ a);
//         System.out.println("The value of b is :"+b);
//     }
// }

public class StaticB {
    static int age ;
    static String name;

    static void disp(){
        System.out.println("The Age is : "+ age);
        System.out.println("The Name is : "+ name);  
    }
    public static void main(String [] args ){
        age = 10;
        name = "Sam";
        disp();
    }
}
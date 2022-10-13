import java.util.Scanner;


public class calculator {
    public static void add(int Integer1, int Integer2){
        int TotalSum;
        TotalSum = new (Integer1 + Integer2);
        System.out.println(TotalSum);
    }// end of add method
   /* public static void subtract(){
        int TotalSum1;
        TotalSum1 = new (Integer1 - Integer2);
        System.out.println(TotalSum1);
    }//ed of subtract
    public static void Multiply(){
        int TotalSum2;
        TotalSum2 = new (Integer1 * Integer2);
        System.out.println(TotalSum2); */
    }//end of Multiply method
    public static void main(String[]args){
        Main mysolution = new Main();
        Scanner input = new Scanner(System.in);
        int Integer1;
        System.out.pritnln("Enter the first number: ");
        Integer1 = input.nextInt();
        System.out.pritnln("Enter the second number: ");
        Integer2 = input.nextInt();
        mysolution.add();
        
    }//end of main method
}// end of class calculator
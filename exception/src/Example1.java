
/**
 * Created by Stivie_Mr on 9/19/2016.
 */
public class Example1 {
    public static void main(String[] args) {
        int num1, num2;

        try{
            num1 = 0;
            num2 = 21/num1;

            System.out.println("This shoul be executed!");

        }catch (ArithmeticException e){
            System.out.println("Exceptia este : " + e);

        }
        System.out.println("Out of the block try-catch");
    }
}

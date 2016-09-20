
/**
 * Created by Stivie_Mr on 9/19/2016.
 */
public class Example2 {
    public static void main(String[] args) {

        try {
            int a[] = new int[5];
             a[6] =13 / 3;


        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception | " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds array | " + e);
        } catch (Exception e) {
            System.out.println("Exceptie | " + e);
        }
        System.out.println("Out of try-catch block ...");
    }
}

/**
 * Created by Stivie_Mr on 9/20/2016.
 */
public class Example3 {
    public static void main(String[] args) {

        try{
            try{
                try{
                    int array[] = {1,2,3,5,8};
                    System.out.println(array[10]);
                }catch (ArithmeticException e){
                    System.out.println("Arithmetic Exception handled in try-block 3" );
                }
            }catch (ArithmeticException e){
                System.out.println("Arithmetic Exception handled in try-block 2" );
            }
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception handled in main block" );
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception ArrayIndexOutOfBoundsException handled in main block " );
        }catch (Exception e){
            System.out.println("Exception e");
        }
    }
}

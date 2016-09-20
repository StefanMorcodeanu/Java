/**
 * Created by Stivie_Mr on 9/20/2016.
 */
public class Example4 {

    static void throwMethod(){
        System.out.println("Inside throw method");
        throw new NullPointerException("Exception");
    }

    public static void main(String[] args) {

        try {
            throwMethod();
        }catch (NullPointerException e){
            System.out.println("This is NullPointerException");
        }
    }


}

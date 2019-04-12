package methodreference;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> lambda = s-> printStackTrace(s);
        lambda.accept("Defined as a lambda");
        System.out.println("=============================");
        Consumer<String> methodRef = Main::printStackTrace;
        methodRef.accept("Defined as a method reference");
    }


    static void printStackTrace(String description) {
    	System.out.println("Hellooooooooo");
        //new Throwable(description).printStackTrace();
    }
}
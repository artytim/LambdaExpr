/*
 * Sample program to introduce functional interfaces with lambda notation
 */
package j8se.example.lambda;

import java.util.function.*;

public class FunctionalInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Predicate – takes one argument, returns a Boolean
        //using the test method of Predicate
        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");

        //Consumer – accepts single argument with no return value
        //Consumer example uses accept method
        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("ABCDefghijklmnopQRSTuvWxyZ");

        //Function – accepts one argument and produces a result
        //Function example        
        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println("length of 26: " + converter.apply(26).length());

        //Supplier example
        //Supplier – represents a supplier of results
        Supplier<String> s = () -> "Java is fun";
        System.out.println(s.get());

        //BinaryOperator – takes two arguments and returns one
        //Binary Operator example
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("add 10 + 25: " + add.apply(10, 25));

        //UnaryOperator – single argument with a return value
        //Unary Operator example
        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("This is my message in upper case"));
    }

}

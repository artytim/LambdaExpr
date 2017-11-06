/*
 * 
 */
package j8se.example.lambda;

public class NewfunctionalInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example of passing multiple values to a method using lambda 
        //notice that I do NOT have to specify the data type of a and b

        //Calculate add =(int a,int b)-> a + b;
        //just put a, b, the compiler will infer the values of a & b from the interface spec
        Calculate add =(a,b)-> a + b;
        Calculate difference = (a,b) -> Math.abs(a-b);
        Calculate divide =(a,b)-> (b != 0 ? a/b : 0);
        Calculate multiply =(c,d)   -> c*d;

        System.out.println(add.calc(3,2));
        System.out.println(difference.calc(5,10));
        System.out.println(divide.calc(5, 0));
        System.out.println(multiply.calc(10, 5));
    }
    
}

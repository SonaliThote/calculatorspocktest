
public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }
    public int divide(int n, int d) {
        if(d==0){
            throw new IllegalArgumentException("Division by zero is not correct");
        }
        return n/d;
    }
}

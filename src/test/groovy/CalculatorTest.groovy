import spock.lang.Specification

class CalculatorTest extends Specification{

    private static Calculator calculator;
    private int result ;

    static def "init"() {
        calculator = new Calculator()
    }

    def "when Calculator Initialized Then Return True"() {
        given:
        calculator = new Calculator()
        boolean b
        when:
        b = calculator.getStatus()
        then:
        b
    }

    def "when Addition Two Number Then Return Correct Answer"() {
        given:
        calculator = new Calculator()
        when:
        result = calculator.addition(5, 6)
        then:
        result == 11
    }

    def "when Subtraction Then Return Correct Answer"() {
        given:
        calculator = new Calculator()
        when:
        result =  calculator.subtraction(7, 4)
        then:
        result == 3
    }

    def "when Division Then Return Correct Answer"() {
        given:
        calculator = new Calculator()
        when:
        result =  calculator.division(8, 4)
        then:
        result == 2
    }

    /*public void whenDivisionByZeroThenThrowException() {
        given:
        calculator = new Calculator();
        Throwable exception;
        when:
        exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(5, 0);
        });
        then:
        IllegalArgumentException ex = thrown()
        ex
        Assert.assertEquals("Cannot divide by zero", exception.getMessage());
    }*/
}

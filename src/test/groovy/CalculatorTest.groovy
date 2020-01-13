import spock.lang.Specification

class CalculatorTest extends Specification{

    def "calculator class initialized then return true"(){
        given:
        Calculator calculator = new Calculator()
        when:
        boolean b =(calculator != null)
        then:
        b
    }

    def "when Addition Two Number Then Return Correct Answer"() {
        given:
        Calculator calculator = new Calculator()
        when:
        def result
        result = calculator.addition(5, 6)
        then:
        result == 11
    }

    def "when Subtraction Then Return Correct Answer"() {
        given:
        Calculator calculator = new Calculator()
        when:
        def result
        result =  calculator.subtraction(7, 4)
        then:
        result == 3
    }

    def "division should return correct answer"(){
        given:
        Calculator calculator = new Calculator()
        when:
        def result
        result = calculator.divide(6, 2)
        then:
        result == 3
    }

    def "for division by zero throw exception"(){
        given:
        Calculator calculator = new Calculator()
        when:
        calculator.divide(2, 0)
        then:
        thrown(IllegalArgumentException)

    }

    def "for division by -ve number"(){
        given:
        Calculator calculator = new Calculator()
        when:
        def result
        result = calculator.divide(2, -2)
        then:
        result == -1
    }

}

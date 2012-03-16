import spock.lang.Specification

class DigitReaderSpecification extends Specification {
    def reader = new DigitReader()
    
    def "reader can read a 1"() {    
        expect: reader.read(Digit.ONE) == 1
    }
    
    def "reader can read a 2"() {     
        expect: reader.read(Digit.TWO) == 2
    }
    
    def "reader can read a 3"() {
        expect: reader.read(Digit.THREE) == 3
    }
    
    def "reader can read a 4"() {
        expect: reader.read(Digit.FOUR) == 4
    }
    
    def "reader can read a 5"() {
        expect: reader.read(Digit.FIVE) == 5
    }
    
    def "reader can read a 6"() {    
        expect: reader.read(Digit.SIX) == 6
    }
    
    def "reader can read a 7"() {     
        expect: reader.read(Digit.SEVEN) == 7
    }
    
    def "reader can read a 8"() {
        expect: reader.read(Digit.EIGHT) == 8
    }
    
    def "reader can read a 9"() {
        expect: reader.read(Digit.NINE) == 9
    }
    
    def "reader can read a 0"() {
        expect: reader.read(Digit.ZERO) == 0
    }
}

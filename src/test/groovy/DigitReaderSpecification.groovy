import spock.lang.Specification

class DigitReaderSpecification extends Specification {
    def "reader can read a 1"() {
        def reader = new DigitReader()
        def one = "   " +
                  "  |" +
                  "  |"
        
        expect: reader.read(one) == 1
    }
}

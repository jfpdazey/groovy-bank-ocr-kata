import spock.lang.*

class DigitReaderSpecification extends Specification {
    def reader = new DigitReader()

    @Unroll({ "reader can read a $digit" })
    def "reader can read each digit from 0-9"() {
        expect: reader.read(digitText) == digit

        where:
            digitText << [ Digit.ZERO, Digit.ONE, Digit.TWO, Digit.THREE, Digit.FOUR,
                            Digit.FIVE, Digit.SIX, Digit.SEVEN, Digit.EIGHT, Digit.NINE ]
            digit << (0..9).collect { it.toString() }
    }
}

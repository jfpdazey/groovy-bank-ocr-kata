class DigitReader {
    static def DIGITS = [ (Digit.ONE):1, (Digit.TWO):2, (Digit.THREE):3, (Digit.FOUR):4, (Digit.FIVE):5,
                            (Digit.SIX):6, (Digit.SEVEN):7, (Digit.EIGHT):8, (Digit.NINE):9, (Digit.ZERO):0 ]
    
    def read(digitText) {
        DIGITS[digitText]
    }
}

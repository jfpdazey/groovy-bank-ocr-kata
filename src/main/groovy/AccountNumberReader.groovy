class AccountNumberReader {
    private static final int DIGIT_WIDTH = 3
    private final reader = new DigitReader()
    
    def read(accountNumberLines) {
        def accountNumber = ""
        
        (1..9).each { digitPosition ->
            accountNumber += parseADigit(accountNumberLines, getStartingReadPosition(digitPosition))
        } 

        return accountNumber
    }

    private def parseADigit(accountNumberLines, startPosition) {
        def linesForDigit = accountNumberLines.collect { line ->
            line.getAt(startPosition..(startPosition + 2))
        }
        
        def digitString = linesForDigit.subList(0,3).join()

        return reader.read(digitString)
    }

    private def getStartingReadPosition(digitPosition) {
        return (digitPosition - 1) * DIGIT_WIDTH
    }
}

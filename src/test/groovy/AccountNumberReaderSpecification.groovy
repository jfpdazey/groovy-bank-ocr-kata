import spock.lang.*

class AccountNumberReaderSpecification extends Specification {
    def reader = new AccountNumberReader()
    def fileLocation = "src/test/resources"

    def "nine ones can be read from one set of lines in a file"() {
        def testFile = new File("${fileLocation}/111111111.txt")
        expect: reader.read(testFile.readLines()) == "111111111"
    }
   
    def "nine nines can be read from one set of lines in a file"() {
        def testFile = new File("${fileLocation}/999999999.txt")
        expect: reader.read(testFile.readLines()) == "999999999"
    }
    
    def "a varied set of nine digits can be read from one set of lines in a file"() {
        def testFile = new File("${fileLocation}/029543861.txt")
        expect: reader.read(testFile.readLines()) == "029543861"
    }
    
    def "another varied set of nine digits can be read from one set of lines in a file"() {
        def testFile = new File("${fileLocation}/731529640.txt")
        expect: reader.read(testFile.readLines()) == "731529640"
    }

//    def validLengthString = " " * 27

//    def "an account number with less than 27 characters in the first line is bad"() {
//        when: reader.read(validLengthString - " ")
//        then: thrown(InvalidAccountNumberFormatException)
//    }
//
//    def "an account number with more than 27 characters in the first line is bad"() {
//        when: reader.read(validLengthString + " ")
//        then: thrown(InvalidAccountNumberFormatException)
//    }
//
//    def "an account number with less than 27 characters in the second line is bad"() {
//        when: reader.read([validLengthString, validLengthString - " "])
//        then: thrown(InvalidAccountNumberFormatException)
//    }
//
//    def "an account number with more than 27 characters in the second line is bad"() {
//        when: reader.read([validLengthString, validLengthString + " "])
//        then: thrown(InvalidAccountNumberFormatException)
//    }

}

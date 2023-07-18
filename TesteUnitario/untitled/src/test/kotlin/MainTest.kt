import org.junit.jupiter.api.*

class MainTest {


    @Test
    fun testCountXDExpectedTrue(){
        var result = countXO("xxoo")
        Assertions.assertTrue(result)
    }
    @Test
    fun testCountXDExpectedFalse(){
        var result = countXO("xxoox")
        Assertions.assertFalse(result)
    }
    @Test
    @Disabled
    fun testNaoImplementado(){


    }

    @Test
    fun vaiFalhar(){
        fail("Preciso fazer esse teste")
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abcAssumption())
    }

    @Test
    fun abcExceptionTest(){
        assertThrows<NullPointerException> { abcException() }

    }

    @Test
    fun ifElseTestReturnFalse(){
        Assertions.assertFalse(ifElse(10))
    }

    @Test
    fun ifElseTestReturnTrue(){
        Assertions.assertFalse(ifElse(25))
    }
}
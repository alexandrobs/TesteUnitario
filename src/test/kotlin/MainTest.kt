import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        //se um teste falhar os outros n rodam
        //Assertions.assertFalse(countXO("xxoo"))
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xXoo"))
        Assertions.assertTrue(countXO("xxOo"))
        Assertions.assertTrue(countXO("xxoox"))
        //Assertions.assertEquals(countXO("xxoo"), true)

        //para executar todos use
//        Assertions.assertAll(
//            {Assertions.assertTrue(countXO("xxoox"))},
//            {Assertions.assertTrue(countXO("xxoxxx"))},
//            {Assertions.assertTrue(countXO("xxxxxxxxxOo"))},
//            {Assertions.assertTrue(countXO("Xxxxxxoo"))}
//        )
    }
}
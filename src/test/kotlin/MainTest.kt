import org.junit.jupiter.api.*
import kotlin.test.assertTrue

class MainTest {

    //teste inutil pois nunca testa nada nesse metodo, n adianta criar teste que n esteja realmente testando o metodo
//    @Test
//    fun provocacao() {
//        Assertions.assertNotNull(countXO("jjksahjkdhjkdhfjk"))
//        Assertions.assertNotNull(countXO("xxoo"))
//        Assertions.assertNotNull(countXO("xxxxxo"))
//    }

    @Test
    fun maiorDeIDade() {
        Assertions.assertTrue(maiorDeIdade(18))
    }

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

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxo"))
        Assertions.assertTrue(abc())
    }
    @Test
    fun exception() {
        assertThrows<java.lang.NullPointerException> {
            abc()
        }
    }


}
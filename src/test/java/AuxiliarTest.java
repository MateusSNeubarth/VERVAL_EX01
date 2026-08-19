import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuxiliarTest {

    @Test
    @DisplayName("Teste de configuração")
    void configuracao() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @DisplayName("Primeiro teste da classe auxiliar")
    void testAuxiliar() {
        assertEquals(3, Auxiliar.calcular(1, 2));
    }

    @Test
    @DisplayName("'This is a problem statement' deve retornar score 500")
    void testCase01() {
        assertEquals(500, Auxiliar.calculateDifficulty("This is a problem statement"));
    }

    @Test
    @DisplayName("'523hi.' deve retornar score 250")
    void testCase02() {
        assertEquals(250, Auxiliar.calculateDifficulty("523hi."));
    }

    @Test
    @DisplayName("'Implement a class H5 which contains some method.' deve retornar score 500")
    void testCase03() {
        assertEquals(500, Auxiliar.calculateDifficulty("Implement a class H5 which contains some method."));
    }

    @Test
    @DisplayName("' no9 . wor7ds he8re. hj..' deve retornar score 250")
    void testCase04() {
        assertEquals(250, Auxiliar.calculateDifficulty(" no9 . wor7ds he8re. hj.."));
    }

    @Test
    @DisplayName("'Programming computer science' deve retornar score 1000")
    void testCase05() {
        assertEquals(1000, Auxiliar.calculateDifficulty("Programming computer science"));
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}

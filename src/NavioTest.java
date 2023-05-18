import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NavioTest {

    private Navio navio;

    @BeforeEach
    public void setup() {
        // Configuração inicial para cada teste
        navio = new Navio(3); // Crie um navio de tamanho 3 para os testes
    }

    @Test
    public void testGetTamanho() {
        int tamanho = navio.getTamanho();
        Assertions.assertEquals(3, tamanho);
    }

    @Test
    public void testGetCoordenadas() {
        // Verifique se a lista de coordenadas está vazia inicialmente
        Assertions.assertTrue(navio.getCoordenadas().isEmpty());

        // Adicione algumas coordenadas e verifique se a lista de coordenadas reflete as alterações
        navio.getCoordenadas().add(new Coordenada(1, 1));
        navio.getCoordenadas().add(new Coordenada(1, 2));

        Assertions.assertEquals(2, navio.getCoordenadas().size());
        Assertions.assertTrue(navio.getCoordenadas().contains(new Coordenada(1, 1)));
        Assertions.assertTrue(navio.getCoordenadas().contains(new Coordenada(1, 2)));
    }

}

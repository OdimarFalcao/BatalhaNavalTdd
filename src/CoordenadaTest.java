import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordenadaTest {

    @Test
    public void testGetX() {
        Coordenada coordenada = new Coordenada(3, 4);
        int x = coordenada.getX();
        Assertions.assertEquals(3, x);
    }

    @Test
    public void testGetY() {
        Coordenada coordenada = new Coordenada(3, 4);
        int y = coordenada.getY();
        Assertions.assertEquals(4, y);
    }

    @Test
    public void testFoiAtacadaInicialmente() {
        Coordenada coordenada = new Coordenada(3, 4);
        boolean foiAtacada = coordenada.foiAtacada();
        Assertions.assertFalse(foiAtacada);
    }

    @Test
    public void testAtacar() {
        Coordenada coordenada = new Coordenada(3, 4);
        coordenada.atacar();
        boolean foiAtacada = coordenada.foiAtacada();
        Assertions.assertTrue(foiAtacada);
    }

    @Test
    public void testEquals() {
        Coordenada coordenada1 = new Coordenada(3, 4);
        Coordenada coordenada2 = new Coordenada(3, 4);
        Assertions.assertEquals(coordenada1, coordenada2);
    }

    @Test
    public void testHashCode() {
        Coordenada coordenada1 = new Coordenada(3, 4);
        Coordenada coordenada2 = new Coordenada(3, 4);
        Assertions.assertEquals(coordenada1.hashCode(), coordenada2.hashCode());
    }
}

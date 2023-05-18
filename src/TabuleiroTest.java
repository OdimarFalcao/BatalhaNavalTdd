//import org.junit.Assert;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class TabuleiroTest {
//
//    private Tabuleiro tabuleiro;
//
//    @BeforeEach
//    public void setUp() {
//        tabuleiro = new Tabuleiro();
//    }
//
//    @Test
//    public void testExibir() {
//        assertDoesNotThrow(() -> tabuleiro.exibir());
//        // Aqui você pode verificar a saída esperada do método exibir
//        // e compará-la com o resultado real obtido na saída do console
//    }
//    @Test
//    public void testExibirTabuleiroOculto() {
//        tabuleiro.exibirTabuleiroOculto();
//        // Aqui você pode verificar a saída esperada do método exibirTabuleiroOculto
//        // e compará-la com o resultado real obtido na saída do console
//    }
//
//    @Test
//    public void testAtacarCoordenadaAgua() {
//        Coordenada coordenada = new Coordenada(0, 0);
//        boolean resultado = tabuleiro.atacar(coordenada);
//        Assertions.assertFalse(resultado);
//        // Aqui você pode verificar se a célula foi marcada como tiro na água (- > A)
//        // e se o resultado do método atacar é false
//    }
//
//    @Test
//    public void testAtacarCoordenadaNavio() {
//        // Primeiro, posicionamos um navio manualmente em uma coordenada específica
//        tabuleiro.posicionarNavioManualmente(new Coordenada(0, 0));
//
//        // Em seguida, atacamos a mesma coordenada
//        Coordenada coordenada = new Coordenada(0, 0);
//        boolean resultado = tabuleiro.atacar(coordenada);
//        Assertions.assertTrue(resultado);
//        // Aqui você pode verificar se a célula foi marcada como tiro acerto (- > X)
//        // e se o resultado do método atacar é true
//    }
//
//    @Test
//    public void testTodosNaviosAfundados() {
//        // Posicionamos um navio manualmente em uma coordenada específica
//        tabuleiro.posicionarNavioManualmente(new Coordenada(0, 0));
//
//
//        // Atacamos a coordenada do navio, mas não afundamos completamente o navio
//        tabuleiro.atacar(new Coordenada(0, 0));
//
//        // Verificamos se ainda existem navios no tabuleiro
//        boolean resultado = tabuleiro.todosNaviosAfundados();
//        Assertions.assertTrue(resultado);
//    }
//
//    @Test
//    public void testPosicionarNavios() {
//        // Configuração do tabuleiro
//        tabuleiro.posicionarNavios();
//
//        // Verificar se todos os navios foram posicionados corretamente
//        List<Navio> navios = tabuleiro.getNavios();
//        Assertions.assertEquals(Tabuleiro.TAMANHOS_NAVIOS.length, navios.size());
//
//        for (Navio navio : navios) {
//            int tamanho = navio.getTamanho();
//            List<Coordenada> coordenadas = navio.getCoordenadas();
//            Assertions.assertEquals(tamanho, coordenadas.size());
//
//            for (Coordenada coordenada : coordenadas) {
//                int x = coordenada.getX();
//                int y = coordenada.getY();
//                Assertions.assertEquals(Tabuleiro.NAVIO, tabuleiro.getTabuleiro()[x][y]);
//            }
//        }
//    }
//
////    @Test
////    public void testPosicionarNaviosNulos() {
////        // Configuração do tabuleiro
////        tabuleiro.posicionarNavios();
////
////        // Verificar se todos os navios foram posicionados corretamente
////        Navio n1 = new Navio();
////        List<Navio> navios = tabuleiro.getNavios();
////        Assertions.assertEquals(Tabuleiro.TAMANHOS_NAVIOS.length, navios.size());
////
////        for (Navio navio : navios) {
////            int tamanho = navio.getTamanho();
////            List<Coordenada> coordenadas = navio.getCoordenadas();
////            Assertions.assertEquals(tamanho, coordenadas.size());
////
////            for (Coordenada coordenada : coordenadas) {
////                int x = coordenada.getX();
////                int y = coordenada.getY();
////                Assertions.assertEquals(Tabuleiro.NAVIO, tabuleiro.getTabuleiro()[x][y]);
////            }
////        }
////    }
//
//    @Test
//    public void testPosicionarNavioManualmente_PosicaoInvalida() {
//        Coordenada coordenada = new Coordenada(10, 10);
//
//        // Executar o método de posicionamento do navio manualmente
//        try {
//            tabuleiro.posicionarNavioManualmente(coordenada);
//            Assert.fail("Expected ArrayIndexOutOfBoundsException");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // Verificar se a exceção foi lançada corretamente
//            Assert.assertEquals("Index 10 out of bounds for length 10", e.getMessage());
//        }
//
//        // Verificar se o tabuleiro e a lista de navios não foram modificados
//        char[][] expectedTabuleiro = new char[10][10];
//        for (int i = 0; i < expectedTabuleiro.length; i++) {
//            Arrays.fill(expectedTabuleiro[i], '-');
//        }
//        Assert.assertArrayEquals(expectedTabuleiro, tabuleiro.getTabuleiro());
//        Assert.assertEquals(0, tabuleiro.getNavios().size());
//    }
//
//
//}
package transforma;

import static org.junit.Assert.*;
import org.junit.Test;

public class TransformaNomeTest {

  @Test
  public void testMaiusculo() {
    TransformaNome tnome = new TransformaNome("Maria");
    assertEquals("MARIA222",tnome.maiusculo());
  }

  @Test
    public void testMinusculo() {
    TransformaNome tnome = new TransformaNome("Maria");
    assertEquals("maria",tnome.minusculo());
  }

  @Test
    public void testBuscarBranco() {
    TransformaNome tnome = new TransformaNome("Maria            Clara Machado");
    assertEquals(13,tnome.buscarBranco());
    //assertEquals(13,tnome.buscarBranco());
  }
}

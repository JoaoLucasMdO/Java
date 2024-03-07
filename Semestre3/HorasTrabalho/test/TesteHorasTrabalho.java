import HorasTrabalhadas.HorasTrabalhadas;
import HorasTrabalhadas.HorasTrabalhadas2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteHorasTrabalho {
  HorasTrabalhadas2 h;
  
  
  /*@Test
  public void receberDuasDatasRetornarValorTotalDeHoras(){
    h = new HorasTrabalhadas();
      assertEquals(4f, h.calculaHoras(8f,12f), 0);
      assertEquals(5f, h.calculaHoras(13f,18f), 0);
      assertEquals(11.5f, h.calculaHoras(8f,18f), 0);
      assertEquals(5.5f,  h.calculaHoras(14f,19f), 0);
      assertEquals(7.0f,  h.calculaHoras(6f,12f), 0);
      assertEquals(9.5f,  h.calculaHoras(6f,13f), 0);
      assertEquals(9.0f,  h.calculaHoras(17f,23f), 0);
      assertEquals(17.5f, h.calculaHoras(0f,09f), 0);
      assertEquals(8f,  h.calculaHoras(22f,2f), 0);
      assertEquals(19.5f, h.calculaHoras(14f,2f), 0);  
}*/
  
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras2(){
      h = new HorasTrabalhadas2();
      assertEquals(4f, h.calculaHoras2(8f,12f), 0);
      assertEquals(5f, h.calculaHoras2(13f,18f), 0);
      assertEquals(11.5f, h.calculaHoras2(8f,18f), 0);
      assertEquals(5.5f,  h.calculaHoras2(14f,19f), 0);
      assertEquals(7.0f,  h.calculaHoras2(6f,12f), 0);
      assertEquals(9.5f,  h.calculaHoras2(6f,13f), 0);
      assertEquals(9.0f,  h.calculaHoras2(17f,23f), 0);
      assertEquals(17.5f, h.calculaHoras2(0f,09f), 0);
      assertEquals(8f,  h.calculaHoras2(22f,2f), 0);
  }
}

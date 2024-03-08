import HorasTrabalhadas.HorasTrabalhadas;
import HorasTrabalhadas.HorasTrabalhadas2;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteHorasTrabalho {
  HorasTrabalhadas h;
  
  
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras1(){
    h = new HorasTrabalhadas();
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    
    c1.set(2024, 5, 25, 5, 0);
    c2.set(2024, 5, 25, 9, 0);
    
    
    h.calculaHoras(c1,c2); 
}
  
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras2(){
    h = new HorasTrabalhadas();
      assertEquals(5f, h.calculaHoras(13f,18f), 0);
}
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras3(){
    h = new HorasTrabalhadas();
      assertEquals(11.5f, h.calculaHoras(8f,18f), 0);
}
 @Test
  public void receberDuasDatasRetornarValorTotalDeHoras4(){
    h = new HorasTrabalhadas();
      assertEquals(5.5f,  h.calculaHoras(14f,19f), 0);
} 

  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras5(){
    h = new HorasTrabalhadas();
      assertEquals(7.0f,  h.calculaHoras(6f,12f), 0);
}
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras6(){
    h = new HorasTrabalhadas();
      assertEquals(9.5f,  h.calculaHoras(6f,13f), 0);
}
  
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras7(){
    h = new HorasTrabalhadas();
      assertEquals(9.0f,  h.calculaHoras(17f,23f), 0);
}
  
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras8(){
    h = new HorasTrabalhadas();
      assertEquals(17.5f,  h.calculaHoras(0f,9f), 0);
}
  
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras9(){
    h = new HorasTrabalhadas();
      assertEquals(8.0f,  h.calculaHoras(22f,2f), 0);
}
  
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras10(){
    h = new HorasTrabalhadas();
      assertEquals(19.5f,  h.calculaHoras(14f,2f), 0);
}
  
}

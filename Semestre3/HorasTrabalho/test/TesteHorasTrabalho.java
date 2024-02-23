import HorasTrabalhadas.HorasTrabalhadas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteHorasTrabalho {
  HorasTrabalhadas h;
  
  
  @Test
  public void receberDuasDatasRetornarValorTotalDeHoras(){
    h = new HorasTrabalhadas();
      assertEquals(7, h.calculaHoras(15, 20, 16, 3));
      
  }
  
    
    
}

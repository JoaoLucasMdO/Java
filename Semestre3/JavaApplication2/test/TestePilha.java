import Pilha.Pilha;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestePilha {
    public static int tamanhoPilha = 10;
    public static Pilha p;
    
    //Método para inicializar a pilha
    @BeforeClass
    public static void inicializaPilha(){
    p = new Pilha(tamanhoPilha);
    }
    
    //Método para empilhar um elemneto na Pilha
    //A pilha irá trabalhar com Object
    
    
    @Test
    public void EmpilharUmObjeto(){
    assertTrue(p.vazia());
    p.empilha("Elemento 1");
    assertFalse(p.vazia());
    }
    
    @Test
    public void EmpilharDoisObjetosDesempilhaUm(){
    assertTrue(p.vazia());
    p.empilha("Elemento 1");
    p.empilha("Elemento 2");
    Object retorno = p.desempilha();
    assertEquals("Elemento 1", p.verificaTopo()); 
    assertFalse(p.vazia());
    }
    
    @Test
    public void empilharDezElemento(){
        assertTrue(p.vazia());
        for(int i = 0; i < 10; i ++){
            p.empilha(i);
        }
        assertFalse(p.vazia());
        assertTrue(p.cheia());
    }
}

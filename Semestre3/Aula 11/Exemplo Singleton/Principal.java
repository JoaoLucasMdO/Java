
import java.util.Calendar;


public class Principal {

  
    public static void main(String[] args) throws InterruptedException {
        
        Configuracao conf1= Configuracao.getInstance();
        System.out.println("Data Config1:" + conf1.getData());
        System.out.println("Data Sistema:" + Calendar.getInstance().toString());
        Thread.sleep(1000);// Cria uma pausa de 1 segundo;
        
        Configuracao conf2= Configuracao.getInstance();
        System.out.println("Data Config2:" + conf2.getData());
        System.out.println("Data Sistema:" + Calendar.getInstance().toString());
        Thread.sleep(1000);// Cria uma pausa de 1 segundo;
        
        Configuracao conf3= Configuracao.getInstance();
        System.out.println("Data Config3:" + conf3.getData());
        System.out.println("Data Sistema:" + Calendar.getInstance().toString());
        Thread.sleep(1000);// Cria uma pausa de 1 segundo;
    }
    
}

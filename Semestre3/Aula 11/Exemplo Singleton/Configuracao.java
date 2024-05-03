
import java.util.Calendar;
public class Configuracao {
    
    private static Configuracao instance;
    private Calendar data;
    
    private Configuracao(){
        data= Calendar.getInstance();
    }
    public static Configuracao getInstance(){
        if(instance==null)
            instance= new Configuracao();
        return instance;
    }
    public String getData(){
        return data.toString();
    }
            
}

package HorasTrabalhadas;

public class HorasTrabalhadas {

    
    
    public float calculaHoras(float horaInic, float horaFim) {
        float total = 0;
        
        total = horaFim - horaInic;
        
        if(horaFim < horaInic){
            total += 24;
        }
        
            if(total > 6){
            total += 1.5f;
        }
        
        
        
        if(horaInic <= 6){
            total += (6 - horaInic) * 0.5;
        }   else if(horaFim <= 6){
                total += (6 - horaFim) * 0.5;
            } 
        
        if(horaFim >= 22){
            total += (horaFim - 22) * 0.5;
        }   else if(horaInic >= 22){
                total += (horaInic - 22) * 0.5;
            }  
        
        if(horaInic <= 8){
            total += (8 - horaInic) * 0.5;
        }   else if(horaFim <= 8){
                total += (8 - horaFim) * 0.5;
            }  
        
        if(horaFim >= 18){
            total += (horaFim - 18) * 0.5;
        }
              
        return total;
    }
    
    
   
}

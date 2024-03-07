
package HorasTrabalhadas;

public class HorasTrabalhadas2 {
    float total = 0;
    float aux = (float) 1.5;
    
    
    public float calculaHoras2(float horaInic, float horaFim){
        float horaExtra = (float) 0;
        total = horaFim - horaInic;
        
        if(horaInic > horaFim){
            total += 24;
        }
        
        if(total > 6){
            total += aux;
        }
        
        if(horaFim > 22){
            total -= horaFim - 22;
            horaExtra += (horaFim - 22) * 2;
        }
        
        if(horaInic > 22){
            total -= horaInic - 22;
            horaExtra += (horaInic - 22) * 2;
        }
        
        if(horaFim > 18 && horaFim > 22){
            total -= horaFim - 18 - (horaFim - 22);
            horaExtra += (horaFim - 18 - (horaFim - 22)) * 1.5;
        }else if(horaFim > 18 ){
            total -= horaFim - 18;
            horaExtra += (horaFim - 18) * 1.5;
        }
        
        if(horaInic > 18 && horaInic >= 22){
            total -= horaInic - 18 - (horaInic - 22);
            horaExtra += (horaInic - 18 - (horaInic - 22)) * 1.5;
        }else if(horaInic > 18 ){
            total -= horaInic - 18;
            horaExtra += (horaInic - 18) * 1.5;
        }
        
        if(horaInic < 6){
            total -= 6 - horaInic;
            horaExtra += (6 - horaInic) * 1.5;
            
        }
        
        if(horaFim < 6){
            total -= 6 - horaFim;
            horaExtra += (6 - horaFim) * 1.5;
            
        }
        
        if(horaInic < 8 && horaInic < 6){
            total -= 8 - horaInic - (6 - horaInic);
            horaExtra += (8 - horaInic) * 1.5;
        }else if(horaInic < 8){
            total -= 8 - horaInic;
            horaExtra += (8 - horaInic) * 1.5;  
        }
        
       if(horaFim < 8 && horaFim <6){
            total -= 8 - horaFim - (6 - horaFim);
            horaExtra += (8 - horaFim) * 1.5;
        }else if(horaFim < 8){
            total -= 8 - horaFim;
            horaExtra += (8 - horaFim) * 1.5;  
        }
                   
    total += horaExtra;
    return total;
    }
}

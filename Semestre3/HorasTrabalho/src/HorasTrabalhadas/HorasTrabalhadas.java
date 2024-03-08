package HorasTrabalhadas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HorasTrabalhadas {

    public float calculaHoras(Calendar dataInic, Calendar dataFim) {
        float horasTrabalhadas = 0;
        
        
        //Adicional da Hora do almoço
        //Se o período trabalhado for maior que 6 horas - 
        //adicione 1.5 horas a jornada
        
        if(calculaHora(dataInic, dataFim) > 6)
            horasTrabalhadas += 1.5;
        
        horasTrabalhadas += calculaPeriodo(horaInic, horaFim, 0.00f, 6.00f) * 2.0f;
        
        horasTrabalhadas += calculaPeriodo(horaInic, horaFim, 6.00f, 8.00f) * 1.5f;
        
        horasTrabalhadas += calculaPeriodo(horaInic, horaFim, 8.00f, 18.00f) * 1f;
        
        horasTrabalhadas += calculaPeriodo(horaInic, horaFim, 18.00f, 22.00f) * 1.5f;
        
        horasTrabalhadas += calculaPeriodo(horaInic, horaFim, 22.00f, 24.00f) * 2.0f;
        
        return horasTrabalhadas;
    }
    
    private float calculaPeriodo
        (float inicioPeriodo, float fimPeriodo, float inicioIntervalo, float fimIntervalo){
    //O método deve calcular a quantidade de horas entre inicio e fim dentro do intervalo
    
    if(inicioPeriodo < fimIntervalo && fimPeriodo > inicioIntervalo){
        //Período está contido dentro do Intervalo
        if(inicioPeriodo < inicioIntervalo)
            inicioPeriodo = inicioIntervalo;
        
        if(fimPeriodo > fimIntervalo)
            fimPeriodo = fimIntervalo;
        
        return (fimPeriodo - inicioPeriodo > 0)? fimPeriodo - inicioPeriodo:0;
        
    }else//Não está dentro do Intervalo 
        return 0;
        
    }
        
    public float calculaHora(Calendar inicio, Calendar fim){
        return (fim.getTimeInMillis() - inicio.getTimeInMillis()/1000/60/60);
    }
}

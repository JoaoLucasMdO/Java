
package Controller;

import Model.DAO.*;
import Model.Estacionamento.*;
import View.TelaPrincipal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Controlador {
    
    private List<ContaVeiculo> listaVeiculos;
    private Thread t0,t1;
    private PersistenciaDados DAO;
    
    public Controlador(){
        listaVeiculos=new ArrayList<ContaVeiculo>();  
        DAO=new PersistenciaDados();
    }
    
    public void addContaVeiculo(String nome, String placa, TipoVeiculoEnum tipo)throws Exception{
        listaVeiculos.add(new ContaVeiculo(Calendar.getInstance().getTimeInMillis() - (1000*60*60*2), new Veiculo(nome, placa, tipo)));
    }
    
    public String[][] listaVeiculosCadastrados() throws Exception{
        
        String[][] aux=new String[listaVeiculos.size()][6];
        ContaVeiculo conta;
        Date dataAux;
        for(int i=0;i<listaVeiculos.size();i++){
            conta=(ContaVeiculo) listaVeiculos.get(i);
            aux[i][0]=conta.getVeiculo().getNome();
            aux[i][1]=conta.getVeiculo().getPlaca();
            aux[i][2]=conta.getVeiculo().getTipo().toString();
            dataAux=new Date(conta.getInicio());
            aux[i][3]= dataAux.toString();
            dataAux=new Date(conta.getFim());
            aux[i][4]= dataAux.toString();
            aux[i][5]=conta.getStatus().toString();
        }
        return aux;
        
    }
    
    public String calculaPermanencia(String placa){
        String mensagem = "";
       
       for(int i = 0; i < listaVeiculos.size(); i++){
       
           if(placa.equals( listaVeiculos.get(i).getVeiculo().getPlaca())){
             mensagem += (Calendar.getInstance().getTimeInMillis() -  listaVeiculos.get(i).getInicio())/(1000*60);
           }
       }
        return mensagem + " Minutos";
    }
    
    public String calculaValor(String periodo, MetricaCalculoEnum metrica, String placa){
       int aux = 0;
       String mensagem = "";
       
       for(int i = 0; i < listaVeiculos.size(); i++){
           if(placa.equals( listaVeiculos.get(i).getVeiculo().getPlaca())){
            aux = i;
           }
       }
            
        if(metrica == MetricaCalculoEnum.UM_QUARTO_HORA){
            Calculo15Minutos calculo = new Calculo15Minutos();
            mensagem += calculo.calcular(Integer.getInteger(periodo), listaVeiculos.get(aux).getVeiculo());
        }
        return mensagem;
    }
    
    public void finalizarConta(String placaVeiculo,MetricaCalculoEnum metrica) throws Exception{
        //Finaliza a conta, utilizando a metrica de calculo recebida como paramentro.
        // Se a metrica for AUTOMATICO, o sistema deverá verificar a opção mais barata e utiliza-la
        
        // Altera o status para fechado e salva o registro.
        //Se valor da conta for zero retorna um erro.
        
        //Se não for possivel registra no BD, salve um backup local da listaVeiculos;
        //Utilize o objeto DAO  
    }
    
 
    
}

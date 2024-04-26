
package PacotesEstacionamentos.Controller;

import Model.Classes.ContaVeiculo;
import Model.Classes.Veiculo;
import Model.DAO.*;
import Model.Estacionamento.*;
import Model.VeiculoDAO.VeiculoDAO;
import PacotesEstacionamentos.View.TelaPrincipal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Controlador {
    
    private List<ContaVeiculo> listaVeiculos;
    private Thread t0,t1;
    private PersistenciaDados DAO;
    private VeiculoDAO veiculoDAO;
    
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
             mensagem += (Calendar.getInstance().getTimeInMillis() -  listaVeiculos.get(i).getInicio())/(1000*60*60);
           }
       }
        return mensagem;
    }
    
    public String calculaValor(MetricaCalculoEnum metrica, String placa){
       int aux = 0;
       String mensagem = "";
       
       for(int i = 0; i < listaVeiculos.size(); i++){
           if(placa.equals( listaVeiculos.get(i).getVeiculo().getPlaca())){
            aux = i;
           }
       }
        long periodo = Calendar.getInstance().getTimeInMillis() -  listaVeiculos.get(aux).getInicio();
        double hora = periodo / (1000*60*60);
        
        if(metrica == MetricaCalculoEnum.UM_QUARTO_HORA){
            Calculo15Minutos calculo = new Calculo15Minutos();
            mensagem += calculo.calcular(periodo, listaVeiculos.get(aux).getVeiculo());
            return mensagem;
        }
        else if(metrica == MetricaCalculoEnum.DIARIA){
            CalculoDiaria calculo = new CalculoDiaria();
            mensagem += calculo.calcular(periodo, listaVeiculos.get(aux).getVeiculo());
            return mensagem;
        }
        else if(metrica == MetricaCalculoEnum.HORA){
            CalculoHorista calculo = new CalculoHorista();
            mensagem += calculo.calcular(periodo, listaVeiculos.get(aux).getVeiculo());
            return mensagem;
        }
        else{
            if(hora < 1){
                Calculo15Minutos calculo = new Calculo15Minutos();
                mensagem += calculo.calcular(periodo, listaVeiculos.get(aux).getVeiculo());
            }
            else if(hora >= 1 && hora < 12){
                CalculoHorista calculo = new CalculoHorista();
                mensagem += calculo.calcular(periodo, listaVeiculos.get(aux).getVeiculo());
            }
            else{
                CalculoDiaria calculo = new CalculoDiaria();
                mensagem += calculo.calcular(periodo, listaVeiculos.get(aux).getVeiculo());
            }
               
            return mensagem;
        }
        
    }
    
    public List carregarPlacas(){
        List<String> placas = new ArrayList<String>();
        
       for(int i = 0; i < listaVeiculos.size(); i++){
       placas.add(listaVeiculos.get(i).getVeiculo().getPlaca());
       }
        return placas;
    }
    
    public void finalizarConta(String placa) throws Exception{
        //Finaliza a conta, utilizando a metrica de calculo recebida como parametro.
        // Altera o status para fechado e salva o registro.
        //Se valor da conta for zero retorna um erro.
        int aux = 0;
        for(int i = 0; i < listaVeiculos.size(); i++){
           if(placa.equals( listaVeiculos.get(i).getVeiculo().getPlaca())){
            aux = i;
           }
       }
       listaVeiculos.get(aux).setFim(Calendar.getInstance().getTimeInMillis());
       listaVeiculos.get(aux).setStatus(StatusConta.FECHADO); 
        //Se não for possivel registra no BD, salve um backup local da listaVeiculos;
        //Utilize o objeto DAO  
    }
    public void salvar(){
        
        veiculoDAO = new VeiculoDAO();
        List<Veiculo> aux = veiculoDAO.listar();
        
        for(int i = 0; i < listaVeiculos.size(); i++){
            int aux2 = 0;
            for(int p = 0; p < aux.size(); p++){
                
                if(aux.get(p).getPlaca().equals(listaVeiculos.get(i).getVeiculo().getPlaca())){
                    aux2 ++;
                }   
            }
            if(aux2 == 0){
                veiculoDAO.inserir(listaVeiculos.get(i).getVeiculo());
            }
        }
        
        PersistenciaDados salvar = new PersistenciaDados();
        try{
        salvar.salvarBackupLocal(listaVeiculos);
        }catch(Exception e){
          
        }
    }
    public void carregar(){
    PersistenciaDados carregar = new PersistenciaDados();
    try{
        listaVeiculos = carregar.carregarBackup();
        }catch(Exception e){
          
        }
    }
 
    
}

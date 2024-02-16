import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diver
 */
public class Pessoas {
    
    public String nome;
    public String dataNascimento;
    
    //private Pessoas pai;
    //private Pessoas mae;        
    public Pessoas pais[]=new Pessoas[2];
    /* As variáveis pai e mãe foram substituidas por um vetor do tipo Pessoa que irá armazenar na posição [0] o pai e na posição [1] a mãe
    pais[0] ==> MAE
    pais[1] ==> PAI*/
    public List<Pessoas> filhos= new ArrayList<>();
    public List<Pessoas> irmaos=new ArrayList<>();
    public List<Pessoas> primos=new ArrayList<>();
    
    public Pessoas(){}
    //****  Construtores ********
    public Pessoas(String nome) {
        this.nome = nome;
    }    
    public Pessoas(String nome, Pessoas mae){
        this(nome);
        AddMaternidade(mae);
    }
    public Pessoas(String nome, Pessoas mae, Pessoas pai){
        this(nome,mae);
        AddPaternidade(pai);
    }
    public Pessoas(String nome, Pessoas mae, Pessoas pai, String nascimento) {
        this(nome,mae,pai) ;        
        this.dataNascimento = nascimento; 
    }
    //**************************************
    
    //***** Métodos Publicos *****
    public void AddPaternidade(Pessoas pai)
    {
        this.pais[1]=pai;
        pai.addFilho(this);
    }
    public void AddMaternidade(Pessoas mae)
    {
        this.pais[0]=mae;
        mae.addFilho(this);
    }
     public void addFilho(Pessoas filho){
                    
        for(int i=0; i<filhos.size();i++){            
            filho.addIrmao(filhos.get(i));
            filhos.get(i).addIrmao(filho);
        }
        addLista(filhos, filho);
    }
    private void addIrmao(Pessoas irmao){   
        
        addLista(irmaos , irmao);
    }
    //************************************
    
    //***** Métodos internos privados ****
    private void addLista(List<Pessoas> lista, Pessoas p){
        for(int i=0; i<lista.size();i++){
            //Verificar se o item Pessoa já foi adicionado antes de incluir na lista
            if (lista.get(i).equals(p)) return;
        }
        lista.add(p);        
    }    
    ///**********************************
    
    // *** Metodos Getters e Setters ****
    public String getNomePai() {
        return pais[1].nome;
    }
    
    public String getNomeMae() {
        return pais[0].nome;
    }      
    
    public int getQtdFilhos(){
        return filhos.size();
    }
    public int getQtdIrmaos(){
        return irmaos.size();
    }
    
     public String listaIrmaos(){
        String listaIrmaos="";
        for (int i=0;i<irmaos.size();i++){
            listaIrmaos+= irmaos.get(i).nome;
            if (i<irmaos.size()-1){
                listaIrmaos+=", ";}
        }
        return listaIrmaos;
    }
    public String listaFilhos(){
        String listaFilhos="";
        for (int i=0;i<filhos.size();i++){
            listaFilhos+= filhos.get(i).nome;
            if (i<filhos.size()-1){
                listaFilhos+=", ";
            }
        }        
        return listaFilhos;
    }
    
    public String listaSobrinhos(){
        String listaSobrinhos="";
        String resp;
        for (int i=0;i<irmaos.size();i++){
            resp= irmaos.get(i).listaFilhos();
            if (resp.length() >0){ 
                listaSobrinhos+=resp;
                if (i<irmaos.size()-1){
                listaSobrinhos+=", ";}
            } 
        }
        return listaSobrinhos;
    }
    public String listaTios(){
        String listaTios="";
        String resp;
        for (Pessoas pai : pais) {
            for (int i = 0; i < pai.getQtdIrmaos(); i++) {
                resp = pai.irmaos.get(i).nome;
                if (resp.length() >0) { 
                    listaTios+=resp;
                    if (i < pai.getQtdIrmaos() - 1) {
                        listaTios+=", ";
                    } 
                }
            }
        }
        return listaTios;
    }
     /*public String listaTios(){
        String listaTios="";
        String resp;
        for(int j=0; j<pais.length;j++){
            for (int i=0;i<pais[j].getQtdIrmaos() ;i++){
                resp= pais[j].irmaos.get(i).nome;
                if (resp.length() >0){ 
                    listaTios+=resp;
                    if (i<pais[j].getQtdIrmaos()-1){
                    listaTios+=", ";}
                } 
            }
        }
        return listaTios;
    }*/
   
    public String listaAvos(){
        String listaAvos="";
        String resp;
        for (int i=0;i<pais.length;i++){
            for (int j=0;j<pais[i].pais.length;j++){
                if(pais[i].pais[j] != null){
                    resp=pais[i].pais[j].nome;
                    if (resp.length() >0){
                        if (listaAvos.length()>0){
                        listaAvos+=", "+resp;}
                        else
                            listaAvos+=resp;
                    }
                }
            }
        }
        return listaAvos;
    }
}
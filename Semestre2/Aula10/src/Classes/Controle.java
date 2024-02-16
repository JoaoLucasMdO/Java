
package Classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;


public class Controle {
    
    private List listaEquipamentos;
    private StringBuffer logErros;
    private List listaID;
    
    public Controle(){
        listaEquipamentos= new ArrayList<Componente>();
        listaID= new ArrayList<String>();
        logErros=new StringBuffer("Log de Erro");
    }
    
    public void criaNovoEquipamento(String nome, String id) throws FormatoIdInvalido {
             
            id=id.toUpperCase();//Converte para maiuscula  
            
                if(id.length()!=3){
                    logErros.append("Formato do ID inválido: " + id);
                    throw new FormatoIdInvalido("Formato do ID inválido, insira 3 caracteres.", id);
                }
                else if(id.matches("[0-9]*")){//Verifica se ID é numérico
                    logErros.append("Formato do ID inválido: " + id);
                    throw new FormatoIdInvalido("Formato do ID inválido, ID não pode ser numérico.", id);
                }
                else if(!idUnico(id)){//Verifica se o ID já foi cadastrado
                    logErros.append("ID já existe: " + id);
                    throw new FormatoIdInvalido("Formato do ID inválido, ID já foi cadastrado.", id);
                }
                else if(nome.isEmpty()){
                    logErros.append("Nome Vazio: " );
                    throw new FormatoIdInvalido("Nome inválido!", nome);
                }
                else{//Cria um novo equipamento
                    listaEquipamentos.add(new Equipamento(nome, id));
                    listaID.add(id);
                }
               
    }
    
    public void addNode(String idEquipamento, String idPai, String Nome) throws Exception {
        Componente equipamento;
        Componente pai=null;
        //Busca o Equipamento e o componente dentro do equipamento
        
        if(idEquipamento.equals(idPai)){
            //Se idEquipamento== idPai, está sendo adicionado a Raiz
            pai=getEquipamento(idPai);
            
        }else{        
            for(int i=0; i<listaEquipamentos.size();i++){
                equipamento=(Equipamento) listaEquipamentos.get(i);
                if(equipamento.getId().equals(idEquipamento)){
                    pai=equipamento.buscaComponente(idPai);
                    break;
                }
            }
        }
        if (pai!=null){//Se o pai foi encontrado
            pai.addComponente(Nome);
        }
        else{
            new Exception("Componente de ID:" + idPai+" não foi encontrado na coleção!");
        }
    }
    
    public void deletNode(Object idComponente, Object idEquipamento){
    //Percorrer a lista de Componentes e se o id existir remove da lista
        
        
        
        
        
        
    /*Componente equipamento;
    for(int i = 0; i < listaEquipamentos.size(); i++){
    equipamento = (Equipamento) listaEquipamentos.get(i);
        if(equipamento.getId().equals(idEquipamento)){

        }
    }*/
}
   
    private boolean idUnico(String id){
        //Verifica se o ID já foi adicionado a lista
        return !listaID.contains(id);
    }

    public List getListaEquipamentos() {
        return listaEquipamentos;
    }
    public String[] getNomeEquipamentos(){
        
        String[] lista = new String[listaEquipamentos.size()];
        Componente aux;
        for(int i=0;i<listaEquipamentos.size();i++){
           aux=(Componente)listaEquipamentos.get(i);
           lista[i]=aux.getNome() + " - " + aux.getId();
        }
        return lista;
    }
    public Componente getEquipamento(String id){
        Componente aux;
        for(int i=0;i<listaEquipamentos.size();i++){
           aux=(Componente)listaEquipamentos.get(i);
           if(aux.getId().equals(id)){
               return aux;
           }
        }
        return null;
    }
    //Cria um objeto DefaulMutableTreeNode para ser inserido na arvore
    public DefaultMutableTreeNode carregarArvore(int indice){
        
        Equipamento equipamento=(Equipamento)listaEquipamentos.get(indice);
        
        return carregarSubArvores(equipamento);
        
       /* DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(equipamento.getId() +"-"+ equipamento.getNome());
        DefaultMutableTreeNode node;
        
        List<Componente> listaComponentes = equipamento.getListaComponentes();
        for(Componente aux: listaComponentes){
            node= new DefaultMutableTreeNode(aux.getId() + "-"+ aux.getNome());
            raiz.add(node);
        }
        return raiz;*/
    }
    private DefaultMutableTreeNode carregarSubArvores(Componente componente){
        
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(componente.getId() +"-"+ componente.getNome());
        DefaultMutableTreeNode node;
                
        List<Componente> listaComponentes = componente.getListaComponentes();
        for(Componente aux: listaComponentes){
            node=carregarSubArvores(aux);
            //node= new DefaultMutableTreeNode(aux.getId() + "-"+ aux.getNome());
            raiz.add(node);
        }
        return raiz;
    }
            
    public void salvar(String endereco) throws IOException{
        //Salva a lista de Equipamentos
        Serializador.gravar(endereco, listaEquipamentos);
            
    }
    public void abrir(String endereco) throws IOException, FileNotFoundException, ClassNotFoundException{
        
            Object arquivo;        
            arquivo=Serializador.ler(endereco);
            listaEquipamentos=(List) arquivo;
        
    }
    
}

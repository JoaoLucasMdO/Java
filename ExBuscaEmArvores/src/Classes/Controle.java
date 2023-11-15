
package Classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;


public class Controle {
    
    private List listaEquipamentos;
    private StringBuffer logErros;
    private List listaID;
    public boolean cadastroServicoHabilitado=false;
    
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
    
    public void addNode(String idEquipamento, String idComponente, String Nome) throws Exception {
        
        Componente noPai=null;
        //Busca o Equipamento e o componente dentro do equipamento
        
        noPai=buscaComponente(idEquipamento, idComponente);
        
        if (noPai!=null){//Se o noPai foi encontrado
            noPai.addComponente(Nome);
        }
        else{
            throw new Exception("Componente de ID:" + idComponente+" não foi encontrado na coleção!");
        }
        
    }
   public void addServico(String idEquipamento,String id, EnumServicos servico, String descricao, float qtd) throws Exception{
       //Busca o componente       
       Componente aux;
       
       aux=buscaComponente(idEquipamento, id);
       if(aux!=null){
           aux.addServico(servico, descricao, qtd);
       }
       else{
           throw new Exception("Componente de ID:" + id+" não foi encontrado na coleção!");
       }
       
   }
    public Componente buscaComponente(String idEquipamento,String id){
        
        Componente aux=null;
        Equipamento equipamento;
        
         if(idEquipamento.equals(id)){
            //Se idEquipamento== id, será adicionado a Raiz da arvore
            aux=getEquipamento(id);
         }else{
            for(int i=0; i<listaEquipamentos.size();i++){
                    equipamento=(Equipamento) listaEquipamentos.get(i);
                    if(equipamento.getId().equals(idEquipamento)){
                        //se componente.buscaComponente não encontrar o componente = idPai, retorna null
                        aux=equipamento.buscaComponente(id);
                        break;
                    }
           }
         }
        return aux;
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
    public Object[][] carregarTabelaComponente(String idEquipamento,String idComponente){
        Object[][] tabela=null;
        //Busca o componente
        Componente aux=buscaComponente(idEquipamento, idComponente);
        
        if(aux!=null){
            //Inicializa a Tabela            
            List listaComponente=aux.getListaComponentes();            
            tabela=new Object[aux.getListaComponentes().size()][2];
            Componente componenteAux;
            
            for(int i=0; i<listaComponente.size();i++){
                //Settar a Tabela
                componenteAux=(Componente) listaComponente.get(i);
                tabela[i][0]= componenteAux.getNome();
                tabela[i][1]= componenteAux.getCusto();
                
            }
            
            return tabela;
        }else{
            return tabela;
        }
    }
    public Object[][] carregarTabelaServico(String idEquipamento,String idComponente){
        
        Object[][] tabela=null;
        //Busca o componente
        Componente aux=buscaComponente(idEquipamento, idComponente);
        
        if(aux!=null){
            //Inicializa a Tabela
            tabela=new Object[aux.getListaServicos().size()][4];
            List listaServico=aux.getListaServicos();
            Servicos servicoAux;
            for(int i=0; i<listaServico.size();i++){
                //Settar a Tabela
                servicoAux=(Servicos) listaServico.get(i);
                tabela[i][0]= servicoAux.getTIPO().name();
                tabela[i][1]= servicoAux.getDescricaoServico();
                tabela[i][2]= servicoAux.getQtdHoras();
                tabela[i][3]= servicoAux.getTIPO().getValor();
            }
            
            return tabela;
        }else{
            return tabela;
        }
         
       
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

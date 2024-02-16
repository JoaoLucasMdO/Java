
package Classes;

import java.awt.Component;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Componente  implements Serializable {
    private String nome,descricao, id;
    private float custo;
    private List listaServicos;
    private List listaComponentes;
    private int contNumPecas;
    
    public Componente(String nome, String id) {
        this.nome=nome;
        this.id = id;
        listaComponentes=new ArrayList<Componente>();
        listaServicos=new ArrayList<EnumServicos>();
        contNumPecas=1;
    }
    public Componente(String nome, String id, String descricao){
        this(nome, id);
        this.descricao=descricao;
    }
    
    public Componente addComponente(String nome){
        Componente aux=new Componente(nome, id+"."+contNumPecas);
        listaComponentes.add(aux);
        contNumPecas+=1;
        return aux;        
    }
    public Componente addComponente(String nome, String descricao){
        Componente aux= Componente.this.addComponente(nome);
        aux.setDescricao(descricao);
        return aux;
    }
    public void addServico(EnumServicos TIPO, String descricaoServico, float qtdHoras){
        listaServicos.add(new Servicos(TIPO, descricaoServico, qtdHoras));
    }
    
    public Componente buscaComponente(String id){
        Componente c;
        for(int i=0;i<listaComponentes.size();i++){
            c=(Componente) listaComponentes.get(i);
            if(c.id.equals(id))
                return c;
        }
        return null;
    }
    
    public void removerComponente(){
    //Percorrer a lista de Componentes e se o id existir remove da lista
    Componente c;
    for(int i = 0; i < listaComponentes.size(); i++){
        c = (Componente) listaComponentes.get(i);
        if(c.getId().equals(id)){
        listaComponentes.remove(i);
        break;
        }
    }
}
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getId() {
        return id;
    }

    public float getValor() {
        return custo;
    }

    public List getListaServicos() {
        return listaServicos;
    }

    public List getListaComponentes() {
        return listaComponentes;
    }
}


package Classes;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class Controle implements Serializable{
    
    //Atributos
    
    private ArrayList<Object> listaPessoas;
    private ArrayList<Object> listaAux;
    private Pessoa usuarioLogado=null;
    
    public Controle(){
        listaPessoas=new ArrayList<Object>();
    }
    
    //Método para criar um novo professor e adiciona-lo a listaProfessores
    public  void addProfessor(String nome, EnumGenero genero, int idade){
        //Criar o professor.
        listaPessoas.add(new Professor(nome,genero,idade));
    }
    public  void addFuncionarioAdm(String nome, EnumGenero genero, int idade){
        //Criar o professor.
        listaPessoas.add(new Administrativo(nome,genero,idade));
    }
    
     public  void addAlunoColegial(String nome, EnumGenero genero, int idade){
        //Criar o professor.
        listaPessoas.add(new Colegial(nome,genero,idade));
    }
    public  void addAlunoFundamental(String nome, EnumGenero genero, int idade){
        //Criar o professor.
        listaPessoas.add(new Fundamental(nome,genero,idade));
    }
    
    public Pessoa getListaPessoas(int indice){
        if(indice< listaPessoas.size())
            return (Pessoa)listaPessoas.get(indice);
        else
            return null;
    }
    public Pessoa getPessoa(int indice){
        //Retorna a pessoa da listaPessoa indica pela listaAux
        return (Pessoa)listaPessoas.get(listaPessoas.indexOf(listaAux.get(indice)));
    }
    public void removerPessoa(int indice){
        //Remove a pessoa da listaPessoa indica pela listaAux
        listaPessoas.remove(listaAux.get(indice));
    }
    public void editarPessoa(int indice, String nome,EnumGenero genero, int idade) throws Exception{
         Pessoa aux=(Pessoa)   listaAux.get(indice);
         aux.setNome(nome);
         aux.setGenero(genero);
         aux.setIdade(idade);
    }
    
    public ArrayList<Object> getListaPessoas(){
        return listaPessoas;
    }
    public int getListaTamanho(){
        return listaPessoas.size();
    }
    public List<String> pesquisaListaPessoas(Object tipoClasse){
        
        Pessoa pessoa;
        String aux;
        List lista = new ArrayList<Pessoa>();
        listaAux=new ArrayList<Object>();
        
        for(int i =0 ;i<getListaTamanho();i++){
           aux="";
           pessoa=getListaPessoas(i);
           
           if(pessoa.getClass()== tipoClasse || tipoClasse==null ){
               
                if(pessoa.getClass()== Professor.class){
                aux="<Funcionario> ";
                }else if(pessoa.getClass()== Administrativo.class){
                    aux= "<Funcionario Adm> ";
                }else if(pessoa.getClass()== Colegial.class){
                    aux= "<Aluno Colegial> ";
                }else if(pessoa.getClass()== Fundamental.class){
                    aux= "<Aluno Fundamental> ";
                }else{
                    aux="";
                }

                aux+=pessoa.getNome()+ " Idade: "+pessoa.getIdade();
                lista.add(aux);
                listaAux.add(pessoa);
                
           }
        }
        return lista;
    }
    
    public String login(int indice){
        
        Object p= listaAux.get(indice);
        
        if(p.getClass().equals(Professor.class)){
            Professor prof=(Professor)p;
            usuarioLogado=prof;
            return prof.login();  
        }
        else if(p.getClass().equals(Colegial.class)){
            
            Colegial col=(Colegial)p;
            usuarioLogado=col;
            return col.login();
        }
        else if(p.getClass().equals(Fundamental.class)){
            
            Fundamental fun=(Fundamental)p;
            usuarioLogado = fun;
            return fun.login();
        }
        else{
            return "Usuario não possui acesso para Login!";
        }
    }
    public String logout(){
                 
        if(usuarioLogado.getClass().equals(Professor.class)){
            Professor prof=(Professor)usuarioLogado;
            usuarioLogado=null;
            return prof.logout();  
        }
        else if(usuarioLogado.getClass().equals(Colegial.class)){
            
            Colegial col=(Colegial)usuarioLogado;
            usuarioLogado=null;
            return col.logout();
        }
        else if(usuarioLogado.getClass().equals(Fundamental.class)){
            
            Fundamental fun=(Fundamental)usuarioLogado;
            usuarioLogado=null;
            return fun.logout();
        }
        else{
            return "Usuario não possui acesso para Logout!";
        }
    }
    
    public String getUsuarioLogado(){
        return usuarioLogado.getNome();
    }
    
    
    public void setSalario(int indice,Float salarioBase, Float salarioHora, Float qtdHoras){
        
        Object p= listaAux.get(indice);
        
        if(p.getClass().equals(Professor.class)){
            Professor aux=(Professor)   listaAux.get(indice);
            aux.setSalarioBase(salarioBase);
            aux.setSalarioHora(salarioHora);
            aux.setQtdHora(qtdHoras);
        }
        else if(p.getClass().equals(Administrativo.class)){
            Administrativo aux=(Administrativo)   listaAux.get(indice);
            aux.setSalarioBase(salarioBase);
        }
        else{
            //Gera uma excessão informando que a Pessoa selecionada não é um Funcionário
        }
    }
    public float calculaSalario(int indice){
        Object p= listaAux.get(indice);
        
        if(p.getClass().equals(Professor.class)){
            Professor aux=(Professor)   listaAux.get(indice);
            return (float) aux.calculaSalario();
        }
        else if(p.getClass().equals(Administrativo.class)){
            Administrativo aux=(Administrativo)   listaAux.get(indice);
            return (float)aux.calculaSalario();
        }
        else{
            //Gera uma excessão informando que a Pessoa selecionada não é um Funcionário
        }
        return 0;
    }
    
     public void abrir(String endereco) throws IOException, FileNotFoundException, ClassNotFoundException{
        
            Object arquivo;        
            arquivo=Serializador.ler(endereco);
            listaPessoas =(ArrayList) arquivo;
        
    }
}

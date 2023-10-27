package Classes;

import java.util.List;
import java.util.ArrayList;


public class Controle {
    //Atributos
    private List<Professor> listaProfessores;
    private List<Administrativo> listaAdministrativos;
    private List<Fundamental> listaFundamental;
    private List<Colegial> listaColegial;
    private List<Pessoa> listaTodos;
    
    public Controle(){
    listaProfessores = new ArrayList<Professor>();
    listaAdministrativos = new ArrayList<Administrativo>();
    listaFundamental = new ArrayList<Fundamental>();
    listaColegial = new ArrayList<Colegial>();
    listaTodos = new ArrayList<Pessoa>();
    }
    
    //Método para criar um novo professor e adiciona-lo a listaProfessores
    public void addProfessor(String nome, EnumGenero genero, int idade){
        //Criar o Professor
        listaProfessores.add(new Professor(nome, genero, idade));
    }
    
    public void addAdministrativo(String nome, EnumGenero genero, int idade){
        //Criar o Professor
        listaAdministrativos.add(new Administrativo(nome, genero, idade));
    }
    
    public void addColegial(String nome, EnumGenero genero, int idade){
        //Criar o Professor
        listaColegial.add(new Colegial(nome, genero, idade));
    }
    
    public void addFundamental(String nome, EnumGenero genero, int idade){
        //Criar o Professor
        listaFundamental.add(new Fundamental(nome, genero, idade));
    }
    
    public java.util.List<Professor> getListaProfessor() {
        return listaProfessores;
    }
    
    public java.util.List<Administrativo> getListaAdministrativo() {
        return listaAdministrativos;
    }
    
    public java.util.List<Colegial> getListaColegial() {
        return listaColegial;
    }
    
    public java.util.List<Fundamental> getListaFundamental() {
        return listaFundamental;
    } 
    
    public java.util.List<Pessoa> getListaTodos() {
        
        return listaTodos;
    } 
}

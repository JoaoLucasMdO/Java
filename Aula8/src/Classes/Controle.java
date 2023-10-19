package Classes;

import java.util.List;
import java.util.ArrayList;


public class Controle {
    //Atributos
    
    private List<Professor> listaProfessores;
    public Controle(){
    listaProfessores = new ArrayList<Professor>();
    }
    
    //Método para criar um novo professor e adiciona-lo a listaProfessores
    public void addProfessor(String nome, EnumGenero genero, int idade){
        //Criar o Professor
        listaProfessores.add(new Professor(nome, genero, idade));
    
    }
}

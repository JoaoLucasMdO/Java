package Principal;
import ClassesPilha.*;
import ClassesFila.*;
import Lista.*;

public class Principal {

 
    public static void main(String[] args) {
        /*PilhaInteger p = new PilhaInteger();
        p.empilhar(10);
        p.empilhar(5);
        p.empilhar(15);
        p.empilhar(8);
        
        while(!p.pilhaVazia()){
            System.out.println(p.desempilhar());
        }
         PilhaString p = new PilhaString();
        p.empilhar("A");
        p.empilhar("B");
        p.empilhar("C");
        
        System.out.println("Topo: " + p.exibirTopo());
        while(!p.pilhaVazia()){
            System.out.println(p.desempilhar());
        }

        //System.out.println(ExercicioPilha.palindromo("Arara"));
        //ExercicioPilha.validaBalanceamento("({[Paralelo]})");
        //System.out.println(ExercicioPilha.validaBalanceamento("({[Paralelo]})"));
        
        for(int i = 0; i < 10; i++){
        p.empilhar((int) Math.round(Math.random()*1000));
        }
        System.out.println(ExercicioPilha.listarItensPilha(ExercicioPilha.ordenaPilha(p)));*/
        
        /*Fila fila1 = new Fila();
       
        fila1.adiciona("Maria");
        fila1.adiciona("Pedro");
        fila1.adiciona("Joao");
        fila1.adiciona("Alice"); 
        
        for(int i = fila1.tamanho(); i > 0; i--){
            System.out.println("Remover: " + fila1.remove().toString());
        }
        System.out.println("Remover: " + fila1.remove().toString());*/
        
        /*FilaPref fila1 = new FilaPref();
        for(int i = 0; i < 10; i++){
        fila1.adiciona((int) Math.round(Math.random()*1000));
        }
        for(int i = fila1.tamanho(); i > 0; i--){
            System.out.println("Remover: " + fila1.remove().toString());
        }
        System.out.println("Remover: " + fila1.remove().toString());*/
        
        TesteLista.adicionarLista();
        
        
    }
    
}

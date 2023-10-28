package ClassesNoBinario;


public class TesteArvore {
    
    public static void CriarArvore(){
    ArvoreBinaria arvore = new ArvoreBinaria(100);
    arvore.adicionarOrdenado(30);
    arvore.adicionarOrdenado(150);
    arvore.adicionarOrdenado(20);
    arvore.adicionarOrdenado(35);
    arvore.adicionarOrdenado(130);
    arvore.adicionarOrdenado(135);
    
    }
    
    public static void main(String[] args){
        CriarArvore();
    }
}

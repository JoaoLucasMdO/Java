
package Classes;

public class No {
    private Object info;
    private No proximo;
    
    public No(Object info, No proximo){
        this.info=info;
        this.proximo=proximo;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Object getInfo() {
        return info;
    }

    public No getProximo() {
        return proximo;
    }
    
}

package Classes;

public class NoDuplo{
    private Object info;
    private NoDuplo proximo;
    private NoDuplo anterior;
    
    public NoDuplo(Object info, NoDuplo proximo, NoDuplo anterior){
        this.info = info;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

    public Object getInfo() {
        return info;
    }

    public NoDuplo getProximo() {
        return proximo;
    }
    
}
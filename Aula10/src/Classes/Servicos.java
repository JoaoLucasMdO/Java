
package Classes;

import java.io.Serializable;

public class Servicos implements Serializable{
    
  private EnumServicos TIPO;
  private String descricaoServico;
  private float qtdHoras;
  
  /*public Servicos(EnumServicos tipo, String descricaoServico, float qtdHoras ){
      this.TIPO=tipo;
  } */

    public Servicos(EnumServicos TIPO, String descricaoServico, float qtdHoras) {
        this.TIPO = TIPO;
        this.descricaoServico = descricaoServico;
        this.qtdHoras = qtdHoras;
    }

    public void setTIPO(EnumServicos TIPO) {
        this.TIPO = TIPO;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public void setQtdHoras(float qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public EnumServicos getTIPO() {
        return TIPO;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public float getQtdHoras() {
        return qtdHoras;
    }
    
    
  
  
    
}

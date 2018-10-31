
package model;

public class TextView extends View {
    String texto;

    public TextView(int largura, int altura, int codigo, String texto) {
        super(largura, altura, codigo);
        this.texto = texto;
    }

    
    
    public void alterar(String texto){
        this.texto = texto;
    }
    
}

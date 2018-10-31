
package model;

public class LinearLayout extends ViewGroup{
    String orientacao;
    
    public LinearLayout(int largura, int altura, int codigo, String orienta) {
        super(largura, altura, codigo);
        this.orientacao = orienta;
    }

    @Override
    public void setIsAlayout() {
        super.setIsAlayout(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setOrientacao(String orientacao){
        this.orientacao = orientacao;
    }
    
}

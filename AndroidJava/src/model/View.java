
package model;

public class View {
    private int largura;
    private int altura;
    private int codigo;
    
    View(int largura, int altura,int codigo){
        this.largura = largura;
        this.altura = altura;
        this.codigo = codigo;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
}


package model;

public class Button extends TextView {
    private boolean clicavel = true;

    public Button(int largura, int altura, int codigo, String texto) {
        super(largura, altura, codigo, texto);
    }

    public boolean isClicavel() {
        return clicavel;
    }
}

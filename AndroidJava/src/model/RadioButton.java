
package model;

public class RadioButton extends Button {
    boolean marcado = false;

    public RadioButton(int largura, int altura, int codigo, String texto) {
        super(largura, altura, codigo, texto);
    }

    public void marcar(){
        this.marcado = true;
    }
    
    public void desmarcar(){
        this.marcado = false;
    }

    public boolean isMarcado() {
        return marcado;
    }

}


package model;

public class ScrollView extends ViewGroup {
    int unico = 0;
    public ScrollView(int largura, int altura, int codigo) {
        super(largura, altura, codigo);
    }
    

    @Override
    public void add(View new_view){
        if(this.unico == 0){
            super.add(new_view);
        } //To change body of generated methods, choose Tools | Templates.
    }

}

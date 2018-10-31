
package model;

public class ViewGroup extends View {
    private View []views = new View[10];
    private boolean isAlayout;
    //linear layout e constrain layout sao aceitaveis;

    public ViewGroup(int largura, int altura, int codigo) {
        super(largura, altura, codigo);
    }
    
     public void add(View new_view){
       for(int i = 0; i < views.length; i++){
           if(views[i] == null){
               views[i] = new_view;
           }
       }
    }
   
    public void apaga(int rem_app){
        for(int i = 0; i < views.length; i++){
            if(views[i].getCodigo() == rem_app){
               views[i] = null;
            }
        }
        organiza();
    }
    
    private void organiza(){
        View temp;
        for(int i = 0; i < views.length;i++){
            if(this.views[i] == null && this.views[i+1] != null){
               temp = this.views[i+1];
               this.views[i] = temp;
               this.views[i+1] = null;
            }
        }
    }

    public boolean isIsAlayout() {
        return isAlayout;
    }

    public void setIsAlayout() {
        this.isAlayout = true;
    }
    
    
}

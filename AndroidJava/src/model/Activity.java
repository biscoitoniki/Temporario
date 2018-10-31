
package model;

public class Activity {
    private View []views = new View[10];
    private String nome;

    public Activity(String nome) {
        this.nome = nome;
    }
    
    public void add(ViewGroup nova){
        if(nova.isIsAlayout() == true){
            for(int i = 0; i < views.length; i++){
                if(views[i] == null){
                    views[i] = nova;
                }
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
   
    public int listar(int i){
        if(this.views[i] != null){
            return this.views[i].getCodigo();
        }
        return 0;
    }

    public String getNome(){
        return nome;
    }
}

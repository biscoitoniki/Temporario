
package model;

public class Android {
    private Aplicativo []apps = new Aplicativo[10];
    private String marca;
    private String modelo;

    public Android(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void instalar(Aplicativo new_app){
       for(int i = 0; i < apps.length; i++){
           if(apps[i] == null){
               apps[i] = new_app;
           }
       }
    }
    
    public void desinstalar(String rem_app){
        for(int i = 0; i < apps.length; i++){
            if(apps[i].getNome() == rem_app){
               apps[i] = null;
            }
        }
        organiza();
    }
    
    private void organiza(){
        Aplicativo temp;
        for(int i = 0; i < apps.length;i++){
            if(this.apps[i] == null && this.apps[i+1] != null){
               temp = this.apps[i+1];
               this.apps[i] = temp;
               this.apps[i+1] = null;
            }
        }
    }
    
    public String listar(int i){
        if(this.apps[i] != null){
            return this.apps[i].getNome();
        }
        return null;
    }
}

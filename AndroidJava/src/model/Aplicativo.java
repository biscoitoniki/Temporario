
package model;

public class Aplicativo {
    private Activity []telas = new Activity[10];
    private String nome;

    public Aplicativo(String nome) {
        this.nome = nome;
    }
    
    public void add(String nome){
        Activity nova = new Activity(nome);
        for(int i = 0; i < telas.length; i++){
           if(telas[i] == null){
               telas[i] = nova;
            }
        }
    }
    
    public void apaga(String rem_app){
        for(int i = 0; i < telas.length; i++){
            if(telas[i].getNome() == rem_app){
               telas[i] = null;
            }
        }
        organiza();
    }
    
    private void organiza(){
        Activity temp;
        for(int i = 0; i < telas.length;i++){
            if(this.telas[i] == null && this.telas[i+1] != null){
               temp = this.telas[i+1];
               this.telas[i] = temp;
               this.telas[i+1] = null;
            }
        }
    }
    
    public String listar(int i){
        if(this.telas[i] != null){
            return this.telas[i].getNome();
        }
        return null;
    }
    
    public Activity modifica(String nome){
        for(int i = 0; i < telas.length; i++){
           if(telas[i].getNome() == nome){
               return telas[i];
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }
}


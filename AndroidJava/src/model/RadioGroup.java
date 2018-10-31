
package model;

public class RadioGroup {
    RadioButton []buttons = new RadioButton[10];
    
    
    
    public void marca(int codigo){
        for(int i = 0; i < buttons.length; i++){
            if(buttons[i].getCodigo() == codigo){
                buttons[i].marcar();
            }
            else{
                buttons[i].desmarcar();
            }
        }
    }

     public void add(RadioButton nova){
            for(int i = 0; i < buttons.length; i++){
                if(buttons[i] == null){
                    buttons[i] = nova;
                }
            }
    }
    
   public void apaga(int rem_app){
        for(int i = 0; i < buttons.length; i++){
            if(buttons[i].getCodigo() == rem_app){
               buttons[i] = null;
            }
        }
        organiza();
    }
   
    private void organiza(){
        RadioButton temp;
        for(int i = 0; i < buttons.length;i++){
            if(this.buttons[i] == null && this.buttons[i+1] != null){
               temp = this.buttons[i+1];
               this.buttons[i] = temp;
               this.buttons[i+1] = null;
            }
        }
    }
}

package oop.ex_printer;

public class Printer {
    private int paintVolume;

    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    public int getPaintVolume() {
        return paintVolume;
    }

    public void setPaintVolume(int paintVolume) {
        this.paintVolume = paintVolume;
    }
    public void print(String message){
        for(int i = 0; i<paintVolume;i++){
            if(message.length()<=paintVolume){
                System.out.println("На печать отправлен текст: "+message+", длина: "+message.length());
            }
            else{
                System.out.println("Не хватило краски: "+paintVolume);
                charge();
            }
        }
    }
    public void charge(){
        paintVolume++;
    }
}

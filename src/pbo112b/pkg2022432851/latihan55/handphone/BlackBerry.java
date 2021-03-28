
package pbo112b.pkg2022432851.latihan55.handphone;


public class BlackBerry extends Handphone {
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga){
        super(man,os,model,harga);
        
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
    
    
}

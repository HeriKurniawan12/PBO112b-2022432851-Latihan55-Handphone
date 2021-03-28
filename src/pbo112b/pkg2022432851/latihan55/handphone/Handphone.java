
package pbo112b.pkg2022432851.latihan55.handphone;


public class Handphone {
    protected String manufacture,operatingSystem,model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
        
    }
    
    public void displayProduct(){
        
        Android hki = new Android("Samsung","Android","Grand",3000000);
        System.out.println("Manufaktur : "+hki.manufacture);
        System.out.println("Os : "+hki.operatingSystem);
        System.out.println("Model : "+hki.model);
        System.out.println("Harga : "+hki.harga);
        hki.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : "+hki.getKeyStore());
        
        System.out.println("");
        
        BlackBerry hki1 = new BlackBerry("blackB","RIM","Cruve",2000000);
        System.out.println("Manufaktur : "+hki1.manufacture);
        System.out.println("Os : "+hki1.operatingSystem);
        System.out.println("Model : "+hki1.model);
        System.out.println("Harga : "+hki1.harga);
        hki1.setPinBB("BHS249");
        System.out.println("Android Key Store : "+hki1.getPinBB());
        
        System.out.println("");
        
        WindowsPhone hki2 = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        System.out.println("Manufaktur : "+hki2.manufacture);
        System.out.println("Os : "+hki2.operatingSystem);
        System.out.println("Model : "+hki2.model);
        System.out.println("Harga : "+hki2.harga);
        hki2.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Android Key Store : "+hki2.getWpKeyStore());
        
        
        
        
        
    }
    
}

public class MainApp {
    //main class
    public static void main(String[] args) throws Exception {
    
        //objek handphone dari class Handphone
        Handphone handphone = new Handphone ("Sandisk", 3, 2.20f, false);
        handphone.Informasi();
        handphone.Telfon(628122122);
        handphone.kirimSMS(628521112);
        handphone.kirimSMS(628121212, 629292211);
        System.out.println("");
        System.out.println("");

        //objek laptop dari class Laptop
        
        Laptop laptop = new Laptop ("Seagate", 8, 2.40f,true);
        laptop.Informasi();
        laptop.bukaGame("Dota 2");
        laptop.kirimEmail("niceyuk@gmail.com");
        laptop.kirimEmail("aanarji@gmail.com", "rusmango@gmail.com");
        System.out.println("");
        
        
    }
}

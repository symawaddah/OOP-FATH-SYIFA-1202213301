public class MainApp {
    //main class
    public static void main(String[] args) throws Exception {

        //objek sampan dari class sampan
        Sampan Sampan = new Sampan (20, 5000, 2);
        Sampan.Informasi();
        Sampan.Berlayar();
        Sampan.Berlabuh();
        Sampan.Berlabuh(2);
        handphone.kirimSMS(628121212, 629292211);
        System.out.println("");
        System.out.println("");

        //objek kapal dari class kapal
        Kapal Kapal = new Kapal (50, 100000, "Diesel");
        Kapal.Informasi();
        Kapal.Berlayar();
        Kapal.Berlayar(20);
        Kapal.Berlabuh();
        System.out.println("");
        System.out.println("");
}

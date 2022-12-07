public class Kapal extends TransportasiAir {
    //attribute
    protected String mesin;

    //variabel constructor
    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super (jumlahKursi, biaya);
        this.mesin = mesin;
    }

    //method void
    @Override
    public void Informasi() {
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }
    @Override
    public void Berlayar() {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin diesel dengan kecepatan yang tidak stabil");
    }
    @Override
    public void Berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil di kisaran " + kecepatan + "knot");
    }
    @Override
    public void Berlabuh() {
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }
}

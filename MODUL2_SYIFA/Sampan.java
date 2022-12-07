public class Sampan extends TrasnportasiAir{
    //attribute
    protected int layar;

    //variable constructor
    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    //method void
    @Override
    public void Informasi() {
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }
    @Override
    public void Berlayar() {
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan " + layar + "layar");
    }
    @Override
    public void Berlabuh() {
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    @Override
    public void Berlabuh(int jangkar) {
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan " + jangkar + "jangkar");
    }
}

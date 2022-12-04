public class Handphone extends Perangkat{
    //attribute
    protected boolean fingerprint;

    //variable constructor
    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    //method void 
    @Override
    public void Informasi() {
        if (fingerprint == false){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini TIDAK memiliki fingerprint");
        }else{
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini juga memiliki fingerprint");
        }
    }

    public void Telfon(int no_hp1) {
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + no_hp1);
    }

    
    public void kirimSMS(int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp2);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke No " + no_hp2);
    }


}

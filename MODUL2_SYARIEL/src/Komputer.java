class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaJam;
    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaJam){
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaJam = hargaJam;
    }
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    public void informasi(){
        System.out.println("jumlaKomputer : " + jumlahKomputer);
        System.out.println("namaWarnet : " + namaWarnet);
        System.out.println("hargaJam : " + hargaJam);
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

}
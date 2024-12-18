class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaJam);
        this.ruangPrivat = ruangPrivat;
    }
    @Override
    public void informasi(){
        if (ruangPrivat) {
            System.out.println("status ruangan premium");
            System.out.println("Fasilitas Ruang Premium");
            System.out.println("Ruangan ber-Ac");
            System.out.println("Sofa Gaming");
            System.out.println("Komputer Spesifikasi tinggi");
            System.out.println("Koneksi Internet dedicated 100bps");
        }
        else {
            System.out.println("status ruangan premium");
            System.out.println("Fasilitas Ruang Premium");
            System.out.println("Ruangan ber-Ac");
            System.out.println("Sofa Gaming");
            System.out.println("Komputer Spesifikasi tinggi");
            System.out.println("Koneksi Internet dedicated 100bps");
        }
    }
    public void pesan(int nomorKomputer){
        System.out.println("memesan komputer nomor: " + nomorKomputer);
    }
    public void tambahLayanan(String Makanan){
        System.out.println("menambah layanan makanan: " + Makanan);
    }
    public void tambahLayanan(String Makanan, String Minuman){
        System.out.println("menambah layanan makanan: " + Makanan + Minuman);
    }
}


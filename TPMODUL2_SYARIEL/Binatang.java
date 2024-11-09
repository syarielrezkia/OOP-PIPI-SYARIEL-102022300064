public class Binatang {
    protected String Nama;
    protected int umur;

    public Binatang(String Nama, int umur) {
        this.Nama = Nama;
        this.umur = umur;
    }

    public void suara() {
        System.out.println(Nama + " membuat suara.");
    }

    public void makan() {
        System.out.println(Nama + " sedang makan.");
    }

    public void makan(String makanan) {
        System.out.println(Nama + " sedang makan " + makanan + ".");
    }

    public void infoBinatang() {
        System.out.println("Nama: " + Nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}

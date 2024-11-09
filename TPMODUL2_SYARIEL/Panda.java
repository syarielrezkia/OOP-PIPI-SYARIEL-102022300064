public class Panda extends Binatang {
    private String Panda_Lucu;

    public Panda(String Nama, int umur, String Panda_Lucu) {
        super(Nama, umur);
        this.Panda_Lucu = Panda_Lucu;
    }

    @Override
    public void suara() {
        System.out.println(Nama + " mengeluarkan suara aseasease.");
    }

    @Override
    public void infoBinatang() {
        System.out.println("Nama: " + Nama + ", Umur: " + umur + " tahun, Lucu Sekali: " + Panda_Lucu + ".");
    }
}

public class Anjing extends Binatang {
    private String ras_Anjing; 

    
    public Anjing(String Nama, int umur, String ras_Anjing) {
        super(Nama, umur);  
        this.ras_Anjing = ras_Anjing;  
    }

    @Override
    public void suara() {
        System.out.println(Nama + " menggonggong.");
    }

    @Override
    public void infoBinatang() {
        System.out.println("Nama: " + Nama + ", Umur: " + umur + " tahun, Ras: " + ras_Anjing + ".");
    }
}

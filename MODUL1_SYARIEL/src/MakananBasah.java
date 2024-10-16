// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
         private String nama;
         private int jumlah;
         private double  harga;
         private String bahan;
    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, int jumlah, double harga, String bahan){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }
// Todo : Create Getter and Setter
    public String nama(){
        return nama; 
    }
    public void setnama(String nama){
        this.nama = nama;
    }
// Todo : Create Getter and Setter
    public int getjumlah(){
        return jumlah;
    }
    public void getjumlah(String jumlah){
        this.jumlah = jumlah;
    }

    public int getharga(String harga){
        return harga;
    }
    public void getharga(String harga){
        this.harga = harga 
    }
    public String getbahan(String bahan){
        return bahan;
    }
    public void getbahan(String bahan){
        this bahan = bahan
    }
}

    // Todo : Create Method ShowData

    public void display () {
        System.out.println ("nama: " + nama + " , jumlah: + jumlah + " , harga: + harga + " , bahan: + bahan + ");
    }

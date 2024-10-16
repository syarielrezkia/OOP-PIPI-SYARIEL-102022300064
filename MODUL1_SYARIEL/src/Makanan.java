// Don't delete any comments below!!!

public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
         private String Nama;
         private int jumlah;
         private double  harga;
    // Todo : Create Constructor of Makanan
        public Makanan(String Nama, int jumlah, double harga){
            this.Nama = Nama;
            this.jumlah = jumlah;
            this.harga = harga;
        }
        public String getNama(){
            return Nama; 
        }
         public void setNama(String Nama){
            this.Nama = Nama;
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
        }
    }

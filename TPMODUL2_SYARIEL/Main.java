public class Main {
    public static void main(String[] args) {
        
        Panda panda = new Panda("Pinoy", 19, "Sphynx");
        Anjing anjing_ = new Anjing("Kayla", 20, "Kuning");

        System.out.println("Detail Hewan\n");

        System.out.println("Ini adalah " + panda.Nama + " !");
        panda.suara();
        panda.makan();
        panda.makan("Catfood");
        System.out.println();

        System.out.println("Ini adalah " + anjing_.Nama + " !");
        anjing_.suara();
        anjing_.makan();
        anjing_.makan("Daging");
        System.out.println();

        panda.infoBinatang();
        anjing_.infoBinatang();
    }
}

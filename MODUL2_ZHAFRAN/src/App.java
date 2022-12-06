public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("==== INFORMASI PELABUHAN =====");
        System.out.println("");

        TransportasiAir transportasi = new TransportasiAir(1, 2000);
        transportasi.informasi();
        transportasi.berlayar();
        transportasi.berlabuh();

        Sampan sampanbaru = new Sampan(4, 2000, 2);
        sampanbaru.informasi();
        sampanbaru.berlayar();
        sampanbaru.berlabuh();
        sampanbaru.berlabuh(2);

        Kapal kapalbaru = new Kapal(50, 500, "avtur");
        kapalbaru.informasi();
        kapalbaru.berlayar();
        kapalbaru.berlayar(200);
        kapalbaru.berlabuh();
    }
}

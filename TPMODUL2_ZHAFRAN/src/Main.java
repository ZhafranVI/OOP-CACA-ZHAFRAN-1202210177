public class Main {
     public static void main(String[] args) {
        
        Perangkat perangkat = new Perangkat("Mito",16,2.4f);
        perangkat.informasi();

        System.out.println("");

        Laptop laptop = new Laptop("Seagate",16,3.5f,true);
        laptop.informasi();
        laptop.bukaGame("Brawlhalla");
        laptop.kirimEmail("walterheisenbergwhite@gmail.com");
        laptop.kirimEmail("cintamamah@gmail.com", "cintapapah@gmail.com");

        System.out.println("");

        Handphone handphone = new Handphone("Sandisk",8,2.2f, false);
        handphone.informasi();
        handphone.telfon(621312123);
        handphone.kirimSMS(621414312);               
        handphone.kirimSMS(62145952, 62983929);

    }
}

public class TransportasiAir {
    protected int JumlahKursi;
    protected int biaya;
  
    public TransportasiAir(int JumlahKursi, int biaya) {
      this.JumlahKursi = JumlahKursi;
      this.biaya = biaya;
    }

    public void informasi() {
        System.out.println("transportasi air jenis tidak diketahui dengan kursi berjumlah " + JumlahKursi + " itetapkan dengan biaya sebesar Rp. " + biaya);
    }

    public void berlayar() {
        System.out.println("transportasi air dengan jenis yang tidak diketahui sedang berlayar");
    }

    public void berlabuh() {
        System.out.println("transportasi air dengan jenis yang tidak diketahui sedang berlabuh di pantai" );
    }

}

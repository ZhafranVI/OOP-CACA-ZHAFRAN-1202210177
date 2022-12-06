public class Sampan {
    protected int layar;

    public Sampan(int JumlahKursi, int biaya, int layar) {
        super(JumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi() {
        System.out.printf("transportasi air jenis sampan dengan jumlah kursi " + JumlahKursi + " itetapkan dengan biaya sebesar Rp. " + biaya);
    }

    //@Override
    public void berlayar() {
        System.out.println("transportasi air jenis sampan sedang berlayar menggunakan" + layar + " layar");
    }

    //@Override
    public void berlabuh() {
        System.out.println("transportasi air jenis sampan berlabuh di pantai tanpa jangkar" );
    }

    public void berlabuh(int jangkar) {
        System.out.println("transportasi air jenis sampan berlabuh di pantai menggunakan"+ jangkar +"jangkar" );
    }
}

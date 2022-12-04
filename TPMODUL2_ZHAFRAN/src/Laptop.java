public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        if(webcam == true){
            System.out.println("Laptop ini memiliki drive tipe "+ drive + " dengan ram sebesar " +ram +" dan processor secepat " +processor+" Ghz. Selain itu laptop ini juga? memiliki Webcam");
        }
        else {
            System.out.println("Laptop ini memiliki drive tipe "+ drive + " dengan ram sebesar " +ram +" dan processor secepat " +processor+" Ghz. Selain itu laptop ini juga tidak memiliki Webcam");

        }

    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop telah berhasil membuka game " + nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop telah berhasil mengirim Email ke " + email);
    }
    public void kirimEmail(String email1,String email2){
        System.out.println("Laptop telah berhasil mengirim Email ke " + email1 + " dan ke " + email2);
    }

}

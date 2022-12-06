public class Perangkat {

    protected int ram;
    protected String drive;
    protected float processor;

    public Perangkat(String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("Perangkat ini tidak memiliki drive tipe "+ drive + " dengan ram sebesar " +ram +" GB dan processor secepat " +processor+" Ghz");
    }
}

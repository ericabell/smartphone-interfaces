public class Smartphone implements Camera, AudioPlayer, Comparable<Smartphone> {
    Integer serialNumber;

    public Smartphone(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void playSong() {
        System.out.println("Playing");
    }

    @Override
    public void pauseSong() {
        System.out.println("Pausing");
    }

    @Override
    public void shareSong() {
        System.out.println("Sharing");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking picture");
    }

    @Override
    public void takeSelfie() {
        System.out.println("Taking seflie");
    }

    @Override
    public void sendPicture() {
        System.out.println("Send picture");
    }

    @Override
    public int compareTo(Smartphone otherPhone) {
        if( this.serialNumber > otherPhone.serialNumber ) {
            return 1;
        } else if( this.serialNumber < otherPhone.serialNumber) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}

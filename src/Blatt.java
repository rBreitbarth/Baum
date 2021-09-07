public class Blatt {
    boolean kaefer;

    Blatt() {
        int zahl = (int) ((Math.random() * 10) + 1);
        if (zahl % 7 == 0 || zahl % 11 == 0) {
            kaefer = true;
        } else {
            kaefer = false;
        }
    }

    public boolean hatKaefer() {
        return kaefer;
    }
}

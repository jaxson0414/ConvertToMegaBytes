public class converter {
    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if(kilobytes<0) {
            System.out.println("Invalid Number");
        }else {
            int megabytes = (kilobytes / 1024);
            int remainingKiloBytes = (kilobytes % 1024);
            System.out.println(kilobytes + " KB = " + megabytes + "MB and " + remainingKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(9625);
    }
}

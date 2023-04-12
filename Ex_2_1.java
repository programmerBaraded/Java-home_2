import java.io.IOException;
import java.util.logging.*;

public class Ex_2_1 {

    public static void main(String[] args) throws IOException{
        int[] mass = new int [] {6,7,5,9,5,6,8,8,5,3,2,3,1,1,9,0};
        Logger log = Logger.getLogger(Ex_2_1.class.getName());
        FileHandler fihler = new FileHandler("log.txt");
        log.addHandler(fihler);
        SimpleFormatter sifter = new SimpleFormatter();
        fihler.setFormatter(sifter);

        int q = mass.length;
        int temp = 0;
        for (int i = 0; i < q; i++) {
            for (int j = 1; j < (q-i); j++) {
                if (mass[j-1] > mass[j]){
                    temp = mass[j-1];
                    mass[j-1] = mass[j];
                    mass[j] = temp;

                    StringBuilder result = new StringBuilder();
                    for (int k = 0; k < q; k++) {
                        result.append(mass[k]).append(" ");
                    }
                    log.info("We changed " + temp + " and " + mass[j-1] + "\n" + result);
                }

            }
        }
    }
}
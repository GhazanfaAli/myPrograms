import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("C:\\Users\\it solution\\Music\\wav.wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);

            String respone = "";
            while(!respone.equals("Q")){
                System.out.println("P = play, S = stop, R = Reset, Q = Quiet");
                System.out.println("Enter your choice: ");

                respone = sc.next();
                respone = respone.toUpperCase();

                switch (respone){
                    case("P"): clip.start();
                    break;
                    case("S"): clip.stop();
                    break;
                    case("R"): clip.setMicrosecondPosition(0);
                    break;
                    case("Q"): clip.close();
                    break;
                    default:
                        System.out.println("Invalid response");
                }
            }


        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file format: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the audio file: " + e.getMessage());
        }
    }
}

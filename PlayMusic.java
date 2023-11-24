import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayMusic {

    public static void playMusic (String location) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
  
    File musicPath = new File("playmusic/Fun & Upbeat Background.wav");

    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInput);
    clip.start();
   

}
}

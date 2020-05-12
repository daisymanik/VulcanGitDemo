package testProject1.Package;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class autoPlaySound {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playSound();
	}
	
	public static void playSound() {
	    try {
	    	
	    	//C:\Users\Public\Music\Sample Music\Kalimba.mp3
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Public\\Music\\Sample Music\\Kalimba.mp3").getAbsoluteFile());
	       // AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(MyClazz.class.getResource("music.wav"));
	        System.out.println("nearing clip");
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}

}


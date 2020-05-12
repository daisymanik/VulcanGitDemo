package testProject1.Package;

/*public class playAudio {

}*/

//package application;  
import java.io.File;  
  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  
import javafx.stage.Stage;  
public class playAudio extends Application  
{  
  
    public void start (Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        //Initialising path of the media file, replace this with your file path   
       // String path = "/home/javatpoint/Downloads/test.mp3"; 
        String path = "C:\\Users\\Public\\Music\\Sample Music\\Kalimba.mp3";        
        
          
        //Instantiating Media class  
        Media media = new Media(new File(path).toURI().toString());  
          
        //Instantiating MediaPlayer class   
        MediaPlayer mediaPlayer = new MediaPlayer(media);  
          
        //by setting this property to true, the audio will be played   
        mediaPlayer.setAutoPlay(true);  
        primaryStage.setTitle("Playing Audio");  
        primaryStage.show();  
        
        for (int i=0; i<=100; i++) {
        	System.out.println("SUMMER CAMP - GAMIFICATION");
        	//Thread.sleep(2000);
        	System.out.println("THANK YOU LEARNING TEAM");
        }
        
        System.out.println("Well Done !!!!!!!!!!!!!!!!");
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
      
}  
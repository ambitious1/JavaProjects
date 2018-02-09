package com.javaprojects.mediaplayer;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Owner
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      Player player = new Player("file:///C:/Users/Owner/Videos/Carmelo_Anthony_reacts_to_Dwyane_Wade_going_back_to_Miami.mp4");
      Scene scene = new Scene(player, 1725, 720, Color.BLACK);
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

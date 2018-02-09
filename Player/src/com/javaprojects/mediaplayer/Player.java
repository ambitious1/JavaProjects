package com.javaprojects.mediaplayer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Owner
 */
public class Player extends BorderPane {
    
    Media media;
    MediaPlayer player;
    MediaView view;
    Pane mPane;
    public Player(String file){
        media = new Media(file);
        player = new MediaPlayer(media);
        view = new MediaView(player);
        mPane = new Pane();
        
        mPane.getChildren().add(view);
        
        setCenter(mPane);
        
        player.play();
    }
    
}

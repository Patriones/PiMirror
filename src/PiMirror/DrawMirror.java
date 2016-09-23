package PiMirror;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class DrawMirror extends Application{
	    @Override
	    public void start(Stage primaryStage) throws IOException {
	    	PiMirror pi = new PiMirror();
			pi.weatherTime();
			
	        primaryStage.setTitle("Hello World!");
	        Text condition = new Text(pi.condition);
	        Text time = new Text(pi.time);
	        Text temp = new Text(pi.temperature);
	        Text date = new Text(pi.date);
	        
	        condition.setFont(Font.font ("Arial", 20));
	        condition.setFill(Color.BLUE);
	        time.setFont(Font.font ("Arial", 20));
	        time.setFill(Color.BLUE);
	        temp.setFont(Font.font ("Arial", 20));
	        temp.setFill(Color.BLUE);
	        date.setFont(Font.font ("Arial", 20));
	        date.setFill(Color.BLUE);
	        
	        TextFlow textFlow = new TextFlow();
	        textFlow.getChildren().addAll(condition, time, temp, date);
	        
	        Group g = new Group(textFlow);
	        Scene sc = new Scene(g, 600, 400, Color.BLACK);
	        primaryStage.setTitle("");
	        primaryStage.setScene(sc);
	        primaryStage.show();
	    }
	    public static void main(String[] args) {
	        launch(args);
	    }
	}
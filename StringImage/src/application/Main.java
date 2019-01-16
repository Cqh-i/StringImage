package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**   
* @Title: Main.java 
* @Package application 
* @author  Cqh_i
* @date 2019年1月16日 下午4:33:12   
*/
public class Main extends Application {
	private AnchorPane rootLayout;
	public static Stage primaryStage;

	 
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("图片转字符串画");
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("FileCho.fxml"));
        try {
			rootLayout = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

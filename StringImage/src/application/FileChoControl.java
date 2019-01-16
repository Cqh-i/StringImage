package application;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

/**   
* @Title: FileChoControl.java 
* @Package application 
* @author  Cqh_i
* @date 2019年1月16日 下午4:33:29   
*/
public class FileChoControl {
	@FXML
	private Button choosefileButton;
	@FXML
	private ImageView imageView;
	@FXML
	private Button strimgButton;
	
	private final Desktop desktop = Desktop.getDesktop();
	private String clist = "■★◆✪◐◔@#$%&*9876543210~ ";//转化的字符
	private File strimg;

	@FXML
	private void initialize() {
		//给两个按钮增加事件处理器
		choosefileButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub);
				FileChooser fileChooser = new FileChooser();
				fileChooser.setTitle("请选择一个图片文件");
				fileChooser.setInitialDirectory(new File("C:\\Users\\Public\\Pictures"));
				fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PNG", "*.png"), new FileChooser.ExtensionFilter("JPG", "*.jpg"),
						new FileChooser.ExtensionFilter("JPEG", "*.jpeg"));
				File file = fileChooser.showOpenDialog(Main.primaryStage);
				if (file != null) {
                    openFile(file);
                }
			}
		});
		strimgButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				try {
					desktop.open(strimg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
	private void openFile(File file) {
        EventQueue.invokeLater(() -> {
        	String url = file.toURI().toString();
			Image image = new Image(url);
			imageView.setImage(image);
			strimgButton.setDisable(false);
			PixelReader pixelReader =  image.getPixelReader();//读取图片像素
			StringBuffer sBuffer = new StringBuffer();
			for(int i = 0; i < image.getHeight(); i++){
				for(int j = 0; j < image.getWidth(); j++){
					Color  color = pixelReader.getColor(j, i);//get指定坐标像素的颜色, 方向每一行读完换下一行	
					int redValue = (int)(color.getRed() * 255);
					sBuffer.append(getChar(redValue));
				}
				sBuffer.append("\r\n");
			}
			strimg = new File("D:/strimg.txt");
			try {
				FileOutputStream fOutputStream = new FileOutputStream(strimg);
				OutputStreamWriter oStreamWriter = new OutputStreamWriter(fOutputStream);
				BufferedWriter bufferedWriter = new BufferedWriter(oStreamWriter);
				bufferedWriter.write(sBuffer.toString());
				bufferedWriter.close();
				oStreamWriter.close();
				fOutputStream.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });
        
    }
	
	private char getChar(int value){
		if(value >= 0 && value < 10){
			return clist.charAt(0);
		}else if(value >= 10 && value < 20){
			return clist.charAt(1);
		}else if(value >= 20 && value < 30){
			return clist.charAt(2);
		}else if(value >= 30 && value < 40){
			return clist.charAt(3);
		}else if(value >= 40 && value < 50){
			return clist.charAt(4);
		}else if(value >= 50 && value < 60){
			return clist.charAt(5);
		}else if(value >= 60 && value < 70){
			return clist.charAt(6);
		}else if(value >= 70 && value < 80){
			return clist.charAt(7);
		}else if(value >= 80 && value < 90){
			return clist.charAt(8);
		}else if(value >= 100 && value < 110){
			return clist.charAt(9);
		}else if(value >= 110 && value < 120){
			return clist.charAt(10);
		}else if(value >= 120 && value < 130){
			return clist.charAt(11);
		}else if(value >= 130 && value < 140){
			return clist.charAt(12);
		}else if(value >= 140 && value < 150){
			return clist.charAt(13);
		}else if(value >= 150 && value < 160){
			return clist.charAt(14);
		}else if(value >= 160 && value < 170){
			return clist.charAt(15);
		}else if(value >= 170 && value < 180){
			return clist.charAt(16);
		}else if(value >= 180 && value < 190){
			return clist.charAt(17);
		}else if(value >= 190 && value < 200){
			return clist.charAt(18);
		}else if(value >= 200 && value < 210){
			return clist.charAt(19);
		}else if(value >= 210 && value < 220){
			return clist.charAt(20);
		}else if(value >= 220 && value < 230){
			return clist.charAt(21);
		}else if(value >= 230 && value < 240){
			return clist.charAt(22);
		}else{
			return clist.charAt(23);
		}
	}
}

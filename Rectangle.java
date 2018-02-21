import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rectangle extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	//@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Perimeter");
		
		GridPane grid = new GridPane();
		
		Scene myScene = new Scene (grid, 400, 400);
		
		primaryStage.setScene(myScene);
		
		Label lengthlbl = new Label ("Enter Length: ");
		
		Label widthlbl = new Label ("Enter Width: ");
		
		
		TextField lengthtxt = new TextField();
		TextField widthtxt = new TextField();
		
		Button calculatebtn = new Button("Find");
		
		calculatebtn.setOnAction(new EventHandler <ActionEvent>() {
		
			
			public void handle(ActionEvent event) {
	
				int length = Integer.parseInt(lengthtxt.getText());
				int width = Integer.parseInt(widthtxt.getText());
		
				primaryStage.setScene(resultScene(primaryStage, length, width));
				
		
			}
		});
	grid.add(lengthlbl, 0, 0);
	grid.add(lengthtxt, 0, 1);
	grid.add(widthlbl, 1, 0);
	grid.add(widthtxt, 1, 1);
	grid.add(calculatebtn, 2, 1);
	
	primaryStage.show();
	
	}
		Scene resultScene(Stage primaryStage, int length, int width) {
	
		GridPane grid = new GridPane();
		
		double perimeter = length * width * 2;
	
		Label perimeterrslt = new Label(perimeter+"");
		
		grid.add(perimeterrslt, 0, 0);
		
		Scene myScene = new Scene(grid, 300, 300);
		
		return myScene;
	
}
}



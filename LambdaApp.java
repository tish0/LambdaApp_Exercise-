package tish;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LambdaApp extends Application {
	
	private Pane root = new Pane();
	private Parent createContent() {
		root.setPrefSize(600, 600);
		return root;
	}	
	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene (createContent());		
		/*scene.setOnKeyPressed(new EventHandler<Event>() {		
			@Override
			public void handle(Event event) {			
			}			
		});		
		scene.setOnKeyPressed((KeyEvent Event) -> handleKeyEvent(Event));
		scene.setOnKeyPressed(event->handleKeyEvent(event));*/		
		scene.setOnKeyPressed(this::handleKeyEvent); //not calling the method just referencing	
		stage.setScene(scene);
		stage.show();

	}
	private void handleKeyEvent(KeyEvent event){
		Text text = new Text(event.getCode().toString());
		text.setFont(Font.font(22));
		root.getChildren().add(text);
		Circle circle = new Circle(100);
		circle.setTranslateX(300);
		circle.setTranslateY(300);
		
		PathTransition pt = new PathTransition(Duration.seconds(5), circle, text);
		//pt.setAutoReverse(true);
		pt.setCycleCount(Animation.INDEFINITE);
		pt.play();
	}
	public static void main(String[] args) {
			launch(args);
	}
}

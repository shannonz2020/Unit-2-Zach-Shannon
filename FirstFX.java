import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//importing shapes
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Polygon;

public class FirstFX extends Application{
  public void start(Stage stage){
    //VARIABLES
     //stage VARIABLES
     final int STAGEWIDTH = 202;
     final int STAGEHEIGHT = 52;

    //shapes
    Rectangle screenBox = new Rectangle(1,1,200,50);
    screenBox.setStroke(Color.RED);
    screenBox.setFill(null);

    Circle roundShape1 = new Circle(25,25,10);
    roundShape1.setStroke(Color.RED);
    roundShape1.setFill(null);

    Ellipse roundShape2 = new Ellipse(100,25,40,10);
    roundShape2.setStroke(Color.DARKORCHID);
    roundShape2.setFill(Color.LIGHTBLUE);

    Polygon notASquare = new Polygon();
    notASquare.getPoints().addAll(new Double[]{ 1.0,1.0, 135.0,20.0, 40.0,15.0, 45.0,35.0});
    notASquare.setStroke(Color.CHOCOLATE);
    notASquare.setFill(Color.CORNFLOWERBLUE);

    //text
    Text text = new Text(40,45,"Oh hi, I didn't see you there.");

    //prep
    Group root = new Group(screenBox, roundShape1, roundShape2, text, notASquare);
    Scene scene = new Scene(root, STAGEWIDTH, STAGEHEIGHT, Color.CHARTREUSE);

    stage.setTitle("First FX Thing");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}

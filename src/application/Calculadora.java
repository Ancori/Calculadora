package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Calculadora extends Application {
	private String[] Operaciones=new String[] {"+","-","x","/"};
	private ComboBox<String> ListaOperaciones;
	private TextField Primervalor,Segundovalor;
	
	public void start(Stage primaryStage) {
		try {
			
			//Primera seccion
			ListaOperaciones = new ComboBox<>();
			ListaOperaciones.getItems().addAll(Operaciones);
			ListaOperaciones.getSelectionModel().selectFirst();
			VBox sec1 = new VBox();
			sec1.setSpacing(5);
			sec1.setAlignment(Pos.CENTER);;
			sec1.getChildren().add(ListaOperaciones);
			
			//Segunda seccion
			Primervalor = new TextField("0");
			Primervalor.setPrefColumnCount(4);
			Text valor=new Text(".");
			Segundovalor = new TextField("0");
			Segundovalor.setPrefColumnCount(4);
			Text i=new Text("i");
			
			HBox Operacion1 = new HBox();
			Operacion1.setSpacing(5);
			
			
			HBox root = new HBox();
			root.setSpacing(5);
			root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(sec1);
			
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setTitle("IMC");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

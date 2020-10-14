package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Calculadora extends Application {
	private String[] Operaciones=new String[] {"+","-","x","/"};
	private ComboBox<String> ListaOperaciones;
	private TextField Primervalor,Segundovalor,Tercervalor,Cuartovalor,Result1,Result2;
	private Text valor,i;
	private Button calcular;
	
	public void start(Stage primaryStage) {
		try {
			
			//Primera seccion
			ListaOperaciones = new ComboBox<>();
			ListaOperaciones.getItems().addAll(Operaciones);
			ListaOperaciones.getSelectionModel().selectFirst();
			VBox sec1 = new VBox();
			sec1.setSpacing(5);
			sec1.setAlignment(Pos.CENTER);
			sec1.getChildren().add(ListaOperaciones);
			
			//Segunda seccion
			Primervalor = new TextField("0");
			Primervalor.setPrefColumnCount(4);
			valor=new Text(".");
			Segundovalor = new TextField("0");
			Segundovalor.setPrefColumnCount(4);
			i=new Text("i");
			HBox Operacion1 = new HBox();
			Operacion1.setSpacing(5);
			Operacion1.setAlignment(Pos.CENTER);
			Operacion1.getChildren().addAll(Primervalor,valor,Segundovalor,i);
			Tercervalor = new TextField("0");
			Tercervalor.setPrefColumnCount(4);
			valor=new Text(".");
			Cuartovalor = new TextField("0");
			Cuartovalor.setPrefColumnCount(4);
			i=new Text("i");
			HBox Operacion2 = new HBox();
			Operacion2.setSpacing(5);
			Operacion2.setAlignment(Pos.CENTER);
			Operacion2.getChildren().addAll(Tercervalor,valor,Cuartovalor,i);
			Separator separador = new Separator ();
			Result1 = new TextField("0");
			Result1.setPrefColumnCount(4);
			Result1.setEditable(false);
			valor=new Text(".");
			Result2 = new TextField("0");
			Result2.setPrefColumnCount(4);
			Result2.setEditable(false);
			i=new Text("i");
			HBox Resultado = new HBox();
			Resultado.setSpacing(5);
			Resultado.setAlignment(Pos.CENTER);
			Resultado.getChildren().addAll(Result1,valor,Result2,i);
			
			VBox sec2 = new VBox();
			sec2.setSpacing(5);
			sec2.setAlignment(Pos.CENTER);
			sec2.getChildren().addAll(Operacion1,Operacion2,separador,Resultado);
			
			calcular = new Button("=");
			VBox sec3 = new VBox();
			sec3.setSpacing(5);
			sec3.setAlignment(Pos.CENTER);
			sec3.getChildren().addAll(calcular);
			
			
			//Final
			HBox root = new HBox();
			root.setSpacing(5);
			root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(sec1,sec2,sec3);
			
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setTitle("Calculadora");
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

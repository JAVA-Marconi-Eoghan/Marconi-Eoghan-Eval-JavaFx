package com.example.app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;




public class App extends Application {
    Scene scene;
    Stage window;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button bFileName;


    public void start(Stage primaryStage) throws Exception {
        URL url = new URL("https://download.data.grandlyon.com/wms/grandlyon");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
       /* window = primaryStage;

        Label label1 = new Label("je suis la premiere scène");
        button1 = new Button("Allons sur la deuxieme scène");
        Button buttonAlert = new Button(" Surprise ! ");
        buttonAlert.setOnAction(e -> AlertBox.display("Ma pop-up", " Hey !"));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1, buttonAlert);
        Scene scene1 = new Scene(layout1, 200, 200);

        Button button2 = new Button("retour sr la premiere scene");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        Scene scene2 = new Scene(layout2, 600, 300);
        button1.setOnAction(e -> window.setScene(scene2));


        window.setScene(scene1);
        window.setTitle("changement scene");
        window.show(); */

        /*window = primaryStage;
        window.setTitle("Formulaire de connexion");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20 ));
        grid.setVgap(0);
        grid.setHgap(10);


        Label nameLabel = new Label("Pseudo");
        GridPane.setConstraints(nameLabel, 0,0,0,0);

        TextField nameInput = new TextField();
        nameInput.setPromptText("saisie ton pseudo");
        GridPane.setConstraints(nameInput,0,0);

        Label passLabel = new Label("Pseudo");
        GridPane.setConstraints(nameLabel, 0,1 ) ;

        TextField passInput = new TextField();
        passInput.setPromptText("saisie ton mdp");
        GridPane.setConstraints(nameInput,1,1 ) ;

        Button login = new Button("login");
        GridPane.setConstraints(login, 1,2 ) ;

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, login);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();*/
        window = primaryStage;
        window.setTitle("Examen App");


        Label label1 = new Label("je suis la premiere scène");
        button1 = new Button("Consuter les données");
        button2 = new Button("Créer un fichier");
        button3 = new Button("Ecrire dans le fichier");
        button4 = new Button("Supprimer un Fichier");



        Button buttonAlert = new Button(" Surprise ! ");
        buttonAlert.setOnAction(e -> AlertBox.display("Ma pop-up", " Hey !"));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1,button2, button3,button4, buttonAlert);
        Scene scene1 = new Scene(layout1, 500, 500);

        Button button5 = new Button("retour sur la premiere scene");
        Button button10 = new Button("retour sur la premiere scene");
        Button button11 = new Button("retour sur la premiere scene");
        Button button12 = new Button("retour sur la premiere scene");
        Button button6= new Button("Lire les données");
        Button bFileName= new Button("Entrer le nom du fichier");
        buttonAlert.setOnAction(e -> AlertBox.display("Ma pop-up", " Hey !"));
        bFileName.setOnAction(e -> Name.display("test"));



        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(button5, button6, bFileName);
        Scene scene2 = new Scene(layout2, 600, 300);

        VBox layout3 = new VBox(20);
        layout3.getChildren().addAll(button11);
        Scene scene3 = new Scene(layout3, 600, 300);

        VBox layout4 = new VBox(20);
        layout4.getChildren().addAll(button12);
        Scene scene4 = new Scene(layout4, 600, 300);

        VBox layout5 = new VBox(20);
        layout5.getChildren().addAll(button10);
        Scene scene5 = new Scene(layout5, 600, 300);

        button1.setOnAction(e -> window.setScene(scene2));
        button2.setOnAction(e -> window.setScene(scene3));
        button3.setOnAction(e -> window.setScene(scene4));
        button4.setOnAction(e -> window.setScene(scene5));


        button5.setOnAction(e -> window.setScene(scene1));
        button10.setOnAction(e -> window.setScene(scene1));
        button11.setOnAction(e -> window.setScene(scene1));
        button12.setOnAction(e -> window.setScene(scene1));

        window.setScene(scene1);
        window.setTitle("changement scene");
        window.show();


    }
   //try {
//            URL url = new URL("https://download.data.grandlyon.com/wms/grandlyon?VERSION=1.3.0&SERVICE=WMS&REQUEST=GetMap&transparent=true&WIDTH=700&HEIGHT=821&layers=pvo_patrimoine_voirie.pvostationvelov&FORMAT=image/png&CRS=EPSG:4171&BBOX=45.437,4.568,46.03,5.18");
//            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//            int rep = conn.getResponseCode();
//            String inline = "";
//            if(rep != 200)
//                throw new RuntimeException("HttpResponseCode: " +rep);
//            else
//            {
//                Scanner sc = new Scanner(url.openStream());
//                while(sc.hasNext())
//                {
//                    inline+=sc.nextLine();
//                }
//                System.out.println("\nJSON data in string format");
//                System.out.println(inline);
//                sc.close();
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

    public static void main(String[] args) {
        launch();
    }
}

// Petit message j'ai passer la moitier de mon temps de l'examen à juste savoir comment importer JSON, ensuite j'ai essayer quelque truc avec l'api pui j'ai laisser tomber au bout de deux heure, à la place j'ai juste tester de trois truc mais il me rester plus de temps pour produire quelque chose d'autre
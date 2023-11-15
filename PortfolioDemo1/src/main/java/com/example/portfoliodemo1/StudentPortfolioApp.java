package com.example.portfoliodemo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StudentPortfolioApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a linked list to store portfolio items
        LinkedList<StudentPortfolioItem> portfolio = new LinkedList<>();

        // Add portfolio items to the linked list
        portfolio.add(new StudentPortfolioItem("ACM Artistry", "This is an exercise from LBYCPEI", "sample1.jpg"));
        portfolio.add(new StudentPortfolioItem("Nature", "Description 2", "sample2.jpg"));
        portfolio.add(new StudentPortfolioItem("Person", "Description 3", "sample3.jpg"));

        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("portfolio.fxml"));
        ScrollPane root = loader.load();

        // Access labels within each HBox and set title and description
        for (int i = 0; i < portfolio.size(); i++) {
            HBox portfolioItem = (HBox) root.lookup("#portfolioItem" + (i + 1));
            if (portfolioItem != null) {
                Label titleLabel = (Label) portfolioItem.lookup("#titleLabel" + (i + 1));
                Label descriptionLabel = (Label) portfolioItem.lookup("#descriptionLabel" + (i + 1));
                ImageView imageView = (ImageView) portfolioItem.lookup("#imageView" + (i + 1));

                if (titleLabel != null) {
                    titleLabel.setText(portfolio.get(i).getTitle());
                }

                if (descriptionLabel != null) {
                    descriptionLabel.setText(portfolio.get(i).getDescription());
                }

                if (imageView != null) {
                    imageView.setImage(new Image(portfolio.get(i).getImageUrl().toExternalForm()));
                }
            }
        }

        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Student Portfolio");
        primaryStage.show();
    }
}

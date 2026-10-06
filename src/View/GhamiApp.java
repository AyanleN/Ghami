package View;

import Controller.GhamiController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/** Run this class to preview the sample maps and controls. */
public final class GhamiApp extends Application {
    @Override
    public void start(Stage stage) {
        GhamiView view = new GhamiView(new GhamiController());
        Scene scene = new Scene(view, 850, 590);
        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if (view.handleKey(event.getCode())) event.consume();
        });
        stage.setTitle("Ghami: Arabic Adventure");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(args); }
}

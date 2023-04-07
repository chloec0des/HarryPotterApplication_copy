module com.example.harrypotterapplication {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.harrypotterapplication to javafx.fxml;
    exports com.example.harrypotterapplication;
}
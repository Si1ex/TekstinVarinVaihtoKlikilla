module com.example.klikkivaihto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.klikkivaihto to javafx.fxml;
    exports com.example.klikkivaihto;
}
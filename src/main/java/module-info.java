module es.ieslosmontecillos.login {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.login to javafx.fxml;
    exports es.ieslosmontecillos.login;
}
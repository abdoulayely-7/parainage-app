module sn.dev.parainageapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static lombok;
    requires mysql.connector.j;


    opens sn.dev.parainageapp to javafx.fxml;
    exports sn.dev.parainageapp;
    exports sn.dev.parainageapp.controllers;
    opens sn.dev.parainageapp.controllers to javafx.fxml;
    exports sn.dev.parainageapp.entities;
    opens sn.dev.parainageapp.entities to javafx.fxml;

}
package oop.step2.calc;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

        @FXML
        private Button div;
        @FXML
        private Button minus;
        @FXML
        private Button mult;
        @FXML
        private TextField scnd;
        @FXML
        private Button getAnswr;
        @FXML
        private Label action;
        @FXML
        private TextField answr;
        @FXML
        private TextField frst;
        @FXML
        private Button plus;

        @FXML
        void onPlus() {
            action.setText("+");
        }

        @FXML
        void onMinus() {
            action.setText("-");
        }

        @FXML
        void onDiv() {
            action.setText("/");
        }

        @FXML
        void onMult(ActionEvent event) {
            action.setText("x");
        }

        @FXML
        void onAnswer(ActionEvent event) {
            switch (action.getText()) {
                case "+":
                    answr.setText((Integer.parseInt(frst.getText()))+Integer.parseInt(scnd.getText())+"");
                    break;
                case "-":
                    answr.setText((Integer.parseInt(frst.getText()))-Integer.parseInt(scnd.getText())+"");
                    break;
                case "x":
                    answr.setText((Integer.parseInt(frst.getText()))*Integer.parseInt(scnd.getText())+"");
                    break;
                case "/":
                    answr.setText((Integer.parseInt(frst.getText()))/Integer.parseInt(scnd.getText())+"");
                    break;
            }
        }
}

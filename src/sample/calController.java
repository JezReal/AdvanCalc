package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class calController {

    @FXML
    private TextField valuesField;

    @FXML
    private TextField inputField;

    @FXML
    private TextField partialAnswerField;

    @FXML
    private Button delButton;

    @FXML
    private Button acButton;

    @FXML
    private Button negateButton;

    @FXML
    private Button _7Button;

    @FXML
    private Button _8Button;

    @FXML
    private Button _9Button;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button divideButton;

    @FXML
    private Button _4Button;

    @FXML
    private Button _5Button;

    @FXML
    private Button _6Button;

    @FXML
    private Button subtractButton;

    @FXML
    private Button _1Button;

    @FXML
    private Button _2Button;

    @FXML
    private Button _3Button;

    @FXML
    private Button addButton;

    @FXML
    private Button _0Button;

    @FXML
    private Button pointButton;

    @FXML
    private Button yRootButton;

    @FXML
    private Button squareRootButton;

    @FXML
    private Button nestedPowButton;

    @FXML
    private Button powoOfYButton;

    @FXML
    private Button powOf2Button;

    @FXML
    private Button moduloButton;

    @FXML
    private Button factorialButton;

    @FXML
    private Button logOfXButton;

    @FXML
    private Button logXofYButton;

    @FXML
    private Button summationButton;

    @FXML
    private Button ansButton;

    @FXML
    private Button floorButton;

    @FXML
    private Button ceilButton;

    @FXML
    private Button nestedSummationButton;

    @FXML
    private Button equalsButton;

    private Operation currentOperation;

    @FXML
    void _0ButtonClick(ActionEvent event) {
        inputField.appendText("0");
    }

    @FXML
    void _1ButtonClick(ActionEvent event) {
        inputField.appendText("1");
    }

    @FXML
    void _2ButtonClick(ActionEvent event) {
        inputField.appendText("2");
    }

    @FXML
    void _3ButtonClick(ActionEvent event) {
        inputField.appendText("3");
    }

    @FXML
    void _4ButtonClick(ActionEvent event) {
        inputField.appendText("4");
    }

    @FXML
    void _5ButtonClick(ActionEvent event) {
        inputField.appendText("5");
    }

    @FXML
    void _6ButtonClick(ActionEvent event) {
        inputField.appendText("6");
    }

    @FXML
    void _7ButtonClick(ActionEvent event) {
        inputField.appendText("7");
    }

    @FXML
    void _8ButtonClick(ActionEvent event) {
        inputField.appendText("8");
    }

    @FXML
    void _9ButtonClick(ActionEvent event) {
        inputField.appendText("9");
    }

    @FXML
    void acButtonClick(ActionEvent event) {
        enablePointButton();
        inputField.clear();
    }

    @FXML
    void addButtonClick(ActionEvent event) {
        enablePointButton();
        String firstNum = inputField.getText();
        if (firstNum.isEmpty()) {
            return;
        }

        currentOperation = Operation.ADD;

        inputField.appendText(" + ");
    }

    @FXML
    void ansButtonClick(ActionEvent event) {

    }

    @FXML
    void ceilButtonClick(ActionEvent event) {

    }

    @FXML
    void delButtonClick(ActionEvent event) {

    }

    @FXML
    void divideButtonClick(ActionEvent event) {
        enablePointButton();

    }

    @FXML
    void equalsButtonClick(ActionEvent event) {
        enablePointButton();

        switch (currentOperation) {
            case ADD:
                inputField.setText(Double.toString(computeAnswer(Operation.ADD)));
            case SUBTRACT:
            case MULTIPLY:
            case DIVIDE:
        }
    }

    @FXML
    void factorialButtonClick(ActionEvent event) {

    }

    @FXML
    void floorButtonClick(ActionEvent event) {

    }

    @FXML
    void logOfXButtonClick(ActionEvent event) {

    }

    @FXML
    void logXofYButtonClick(ActionEvent event) {

    }

    @FXML
    void moduloButtonClick(ActionEvent event) {

    }

    @FXML
    void multiplyButtonClick(ActionEvent event) {
        enablePointButton();

    }

    @FXML
    void negateButtonClick(ActionEvent event) {
        enablePointButton();

    }

    @FXML
    void nestedPowButtonClick(ActionEvent event) {

    }

    @FXML
    void nestedSummationButtonClick(ActionEvent event) {

    }

    @FXML
    void pointButtonClick(ActionEvent event) {
        disablePointButton();
    }

    @FXML
    void powOf2ButtonClick(ActionEvent event) {

    }

    @FXML
    void powOfYButtonClick(ActionEvent event) {

    }

    @FXML
    void squareRootButtonClick(ActionEvent event) {

    }

    @FXML
    void subtractButtonClick(ActionEvent event) {

    }

    @FXML
    void summationButtonClick(ActionEvent event) {

    }

    @FXML
    void yRootButtonClick(ActionEvent event) {

    }


    public void initialize(URL url, ResourceBundle rb) {



    }

    private void disablePointButton(){
        pointButton.setDisable(true);
    }

    private void enablePointButton(){
        pointButton.setDisable(false);
    }

    private double computeAnswer(Operation operation) {
        switch (operation) {
            case ADD:
                double[] nums = parseInput(Operation.ADD.getSymbol());
                return Math.round((nums[0] + nums[1]) * 100.0) / 100.0;
        }

        return 0;
    }

    private double[] parseInput(String symbol) {
        double[] nums = new double[2];
        String[] values = inputField.getText().split("[" + symbol + "]");
        int length = 0;

        for (int i = 0; i < values.length; i++) {
            values[length] = values[i].trim();
            length++;
        }

        length = 0;

        for (int i = 0; i < 2; i++) {
            nums[length] = Double.parseDouble(values[i]);
            length++;
        }

        return nums;
    }
}

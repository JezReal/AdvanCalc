package java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class calController implements Initializable {

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

    private double firstNum, secondNum;
    private Operation operation;
    private boolean newProcess;

//    TODO: UI
//    add x and y buttons for inputting expressions in summation
//    e.g. lowerLimit: 1, upperLimit: 5, expression: x + 5

//    TODO: functionality
//    modulo, floor, ceiling, square root, nth root, x ^ y, x ^2
//    process:
//    [1]add operation in Operation enum
//    e.g. for square root: SQRT([symbol for square root. refer to internet])
//    [2]handle in respective method defined and in equalsButtonClick() method
//    refer to fxml file to know the associated method with the button
//    [3]find bugs, report, then try to fix

    @FXML
    void _0ButtonClick(ActionEvent event) {
        if (isNewProcess()) {
            clearFields();
            inputField.appendText("0");
            setNewProcess(false);
        } else {
            inputField.appendText("0");
        }
    }

    @FXML
    void _1ButtonClick(ActionEvent event) {

        if (isNewProcess()) {
            clearFields();
            inputField.appendText("1");
            setNewProcess(false);
        } else {
            inputField.appendText("1");
        }

    }

    @FXML
    void _2ButtonClick(ActionEvent event) {
        if (isNewProcess()) {
            clearFields();
            inputField.appendText("2");
            setNewProcess(false);
        } else {
            inputField.appendText("2");
        }
    }

    @FXML
    void _3ButtonClick(ActionEvent event) {
        if (isNewProcess()) {
            clearFields();
            inputField.appendText("3");
            setNewProcess(false);
        } else {
            inputField.appendText("3");
        }
    }

    @FXML
    void _4ButtonClick(ActionEvent event) {

        if (isNewProcess()) {
            clearFields();
            inputField.appendText("4");
            setNewProcess(false);
        } else {
            inputField.appendText("4");
        }
    }

    @FXML
    void _5ButtonClick(ActionEvent event) {
        if (isNewProcess()) {
            clearFields();
            inputField.appendText("5");
            setNewProcess(false);
        } else {
            inputField.appendText("5");
        }
    }

    @FXML
    void _6ButtonClick(ActionEvent event) {
        if (isNewProcess()) {
            clearFields();
            inputField.appendText("6");
            setNewProcess(false);
        } else {
            inputField.appendText("6");
        }
    }

    @FXML
    void _7ButtonClick(ActionEvent event) {
        if (isNewProcess()) {
            clearFields();
            inputField.appendText("7");
            setNewProcess(false);
        } else {
            inputField.appendText("7");
        }
    }

    @FXML
    void _8ButtonClick(ActionEvent event) {
        if (isNewProcess()) {
            clearFields();
            inputField.appendText("8");
            setNewProcess(false);
        } else {
            inputField.appendText("8");
        }
    }

    @FXML
    void _9ButtonClick(ActionEvent event) {
        if (isNewProcess()) {
            clearFields();
            inputField.appendText("9");
            setNewProcess(false);
        } else {
            inputField.appendText("9");
        }
    }

    @FXML
    void acButtonClick(ActionEvent event) {
        clearFields();
    }

    @FXML
    void addButtonClick(ActionEvent event) {
        operation = Operation.ADD;
        processValues();

    }

    @FXML
    void ansButtonClick(ActionEvent event) {

    }

    @FXML
    void ceilButtonClick(ActionEvent event) {
        operation = Operation.CEIL;
        processValues();
    }

    @FXML
    void delButtonClick(ActionEvent event) {
        if (inputField.getText().length() != 0) {
            inputField.setText(inputField.getText().substring(0, inputField.getText().length() - 1));
        }
    }

    @FXML
    void divideButtonClick(ActionEvent event) {

        operation = Operation.DIVIDE;
        processValues();
    }

    @FXML
    void equalsButtonClick(ActionEvent event) {

        if (operation == Operation.NONE) {
            partialAnswerField.setText(inputField.getText());
        } else if (operation == Operation.DIVIDE && inputField.getText().equals("0")) {
            inputField.setText("Cannot divide by zero");
            operation = Operation.NONE;
            partialAnswerField.clear();
            setNewProcess(true);
        } else if (operation == Operation.CEIL) {
            inputField.setText(String.valueOf(computeAnswer()));
            setNewProcess(true);
        } else if (operation == Operation.FLOOR) {
            inputField.setText(String.valueOf(computeAnswer()));
            setNewProcess(true);
        } else {
            try {
                secondNum = Double.parseDouble(inputField.getText());
            } catch (NumberFormatException e) {
                secondNum = 0;
            }
            valuesField.appendText(inputField.getText());
            inputField.setText(String.valueOf(computeAnswer()));
            partialAnswerField.clear();
            setNewProcess(true);
            operation = Operation.NONE;
        }
    }

    @FXML
    void factorialButtonClick(ActionEvent event) {

    }

    @FXML
    void floorButtonClick(ActionEvent event) {
        operation = Operation.FLOOR;
        processValues();
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
        operation = Operation.MULTIPLY;
        processValues();
    }

    @FXML
    void negateButtonClick(ActionEvent event) {

    }

    @FXML
    void nestedPowButtonClick(ActionEvent event) {

    }

    @FXML
    void nestedSummationButtonClick(ActionEvent event) {

    }

    @FXML
    void pointButtonClick(ActionEvent event) {
        inputField.appendText(".");
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
        operation = Operation.SUBTRACT;
        processValues();
    }

    @FXML
    void summationButtonClick(ActionEvent event) {

    }

    @FXML
    void yRootButtonClick(ActionEvent event) {

    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        firstNum = 0;
        secondNum = 0;
        operation = Operation.NONE;
        newProcess = false;

        inputField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.contains(".")) {
                pointButton.setDisable(true);
            } else {
                pointButton.setDisable(false);
            }
        });
    }

    //  This method is responsible for processing the input values for calculation
    private void processValues() {

        if (operation == Operation.CEIL) {
            valuesField.setText(String.format("⌈%s⌉", inputField.getText()));
            firstNum = Double.parseDouble(inputField.getText());
        } else if (operation == Operation.FLOOR) {
            valuesField.setText(String.format("⌈%s⌉", inputField.getText()));
            firstNum = Double.parseDouble(inputField.getText());
        } else {
            firstNum = Double.parseDouble(inputField.getText());
            inputField.appendText(String.format(" %s ", operation.getSymbol()));
            valuesField.setText(inputField.getText());
            inputField.clear();
            partialAnswerField.setText(String.valueOf(firstNum));
        }

    }

    private double computeAnswer() {
        switch (operation) {
            case ADD:
                return firstNum + secondNum;
            case SUBTRACT:
                return firstNum - secondNum;
            case MULTIPLY:
                return firstNum * secondNum;
            case DIVIDE:
                return firstNum / secondNum;
            case CEIL:
                return Math.ceil(firstNum);
            case FLOOR:
                return Math.floor(firstNum);
            case NONE:
                return 0;
        }
        return 0;
    }

    private void setNewProcess(boolean newProcess) {
        this.newProcess = newProcess;
    }

    private boolean isNewProcess() {
        return newProcess;
    }

    private void clearFields() {
        valuesField.clear();
        inputField.clear();
        partialAnswerField.clear();
    }
}

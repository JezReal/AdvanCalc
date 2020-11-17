package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.NumberFormat;
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
    private Button cubeRootButton;

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

    private double firstNum, secondNum, logBase, logValue;
    private Operation operation;
    private boolean newProcess;
    private boolean isBaseSet;

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
        operation = Operation.NONE;
        clearFields();
        firstNum = 0;
        secondNum = 0;
    }

    @FXML
    void addButtonClick(ActionEvent event) {
        operation = Operation.ADD;
        processValues();
    }

    @FXML
    void ansButtonClick(ActionEvent event) {

        if (operation == Operation.LOGX) {
            if (isBaseSet) {
                try {
                    logValue = Double.parseDouble(inputField.getText());
                    valuesField.setText("x: " + logBase + " y: " + logValue);
                    inputField.clear();
                } catch (NumberFormatException e) {
                    logValue = 0;
                }
            } else {
                try {
                    logBase = Double.parseDouble(inputField.getText());
                    valuesField.setText("x: " + logBase + " y: ");
                    inputField.clear();
                } catch (NumberFormatException e) {
                    logBase = 0;
                }
                isBaseSet = true;
            }
        }
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
        } else if (operation == Operation.DIVIDE) {
            if (inputField.getText().equals("0") || inputField.getText().isEmpty()) {
                inputField.setText("Cannot divide by zero");
                operation = Operation.NONE;
                partialAnswerField.clear();
                setNewProcess(true);
            } else {
                try {
                    secondNum = Double.parseDouble(inputField.getText());
                } catch (NumberFormatException ignored) {

                }
                inputField.setText(String.valueOf(computeAnswer()));
                operation = Operation.NONE;
                partialAnswerField.clear();
                setNewProcess(true);
            }
        } else if (operation == Operation.CEIL) {
            inputField.setText(String.valueOf(computeAnswer()));
            setNewProcess(true);
            operation = Operation.NONE;
        } else if (operation == Operation.FLOOR) {
            inputField.setText(String.valueOf(computeAnswer()));
            setNewProcess(true);
            operation = Operation.NONE;
        } else if (operation == Operation.LOG) {
            inputField.setText(String.valueOf(computeAnswer()));
            setNewProcess(true);
            operation = Operation.NONE;
        } else if (operation == Operation.LOGX) {
            inputField.setText(String.valueOf(computeAnswer()));
            isBaseSet = false;
            setNewProcess(true);
            operation = Operation.NONE;
        } else if (operation == Operation.FACT) {
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
        valuesField.setText(inputField.getText() + "!");
        operation = Operation.FACT;
        processValues();
    }

    @FXML
    void floorButtonClick(ActionEvent event) {
        operation = Operation.FLOOR;
        processValues();
    }

    @FXML
    void logOfXButtonClick(ActionEvent event) {
        operation = Operation.LOG;
        processValues();
    }

    @FXML
    void logXofYButtonClick(ActionEvent event) {
        operation = Operation.LOGX;
        valuesField.setText("x: y:");
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
        if (inputField.getText().contains("-")) {
            inputField.setText(inputField.getText().substring(1));
        } else {
            inputField.setText("-" + inputField.getText());
        }
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
    void cubeRootButtonClick(ActionEvent event) {

    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        firstNum = 0;
        secondNum = 0;
        operation = Operation.NONE;
        newProcess = false;
        isBaseSet = false;
        isBaseSet = false;
        logBase = 0;
        logValue = 0;

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
//            initialize firstNum to 0 if user clicks on ceil on operation
//            without entering any input
            try {
                firstNum = Double.parseDouble(inputField.getText());
            } catch (NumberFormatException e) {
                firstNum = 0;
            }

            valuesField.setText(String.format("⌈%s⌉", firstNum));
        } else if (operation == Operation.FLOOR) {
            try {
                firstNum = Double.parseDouble(inputField.getText());
            } catch (NumberFormatException e) {
                firstNum = 0;
            }

            valuesField.setText(String.format("⌊%s⌋", firstNum));
        } else if (operation == Operation.LOG) {
            try {
                firstNum = Double.parseDouble(inputField.getText());
            } catch (NumberFormatException e) {
                firstNum = 0;
            }
            valuesField.setText(String.format("log(%s)", firstNum));

        } else if (operation == Operation.FACT) {
            try {
                firstNum = Double.parseDouble(inputField.getText());
            } catch (NumberFormatException e) {
                firstNum = 0;
            }
        } else {
            try {
                firstNum = Double.parseDouble(inputField.getText());
            } catch (NumberFormatException ignored) {

            }
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
            case LOG:
//                assume logarithm is of base 10 and not of base e
                return Math.round(Math.log10(firstNum) * 100.0) / 100.0;
            case LOGX:
                return Math.round((Math.log(logValue) / Math.log(logBase)) * 100.0) / 100.0;
            case FACT:
//                cast to int because a double will cause an overflow
                return Math.round(getFactorial((int)firstNum) * 100.0) / 100.0;
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

    private static double getFactorial(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        return num * getFactorial(num - 1);
    }
}

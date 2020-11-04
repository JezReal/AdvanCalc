package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
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

    private double firstNum=0, secondNum=0;
    private Operation operation;
    private boolean newProcess=false;

    @FXML
    void _0ButtonClick(ActionEvent event) {
        if(isNewProcess()){
            clearFields();
            inputField.appendText("0");
            setNewProcess(false);
        }
        else{
            inputField.appendText("0");
        }
    }

    @FXML
    void _1ButtonClick(ActionEvent event) {

        if(isNewProcess()){
            clearFields();
            inputField.appendText("1");
            setNewProcess(false);
        }
        else{
            inputField.appendText("1");
        }

    }

    @FXML
    void _2ButtonClick(ActionEvent event) {
        if(isNewProcess()){
            clearFields();
            inputField.appendText("2");
            setNewProcess(false);
        }
        else{
            inputField.appendText("2");
        }
    }

    @FXML
    void _3ButtonClick(ActionEvent event) {
        if(isNewProcess()){
            clearFields();
            inputField.appendText("3");
            setNewProcess(false);
        }
        else{
            inputField.appendText("3");
        }
    }

    @FXML
    void _4ButtonClick(ActionEvent event) {

        if(isNewProcess()){
            clearFields();
            inputField.appendText("4");
            setNewProcess(false);
        }
        else{
            inputField.appendText("4");
        }
    }

    @FXML
    void _5ButtonClick(ActionEvent event) {
        if(isNewProcess()){
            clearFields();
            inputField.appendText("5");
            setNewProcess(false);
        }
        else{
            inputField.appendText("5");
        }
    }

    @FXML
    void _6ButtonClick(ActionEvent event) {
        if(isNewProcess()){
            clearFields();
            inputField.appendText("6");
            setNewProcess(false);
        }
        else{
            inputField.appendText("6");
        }
    }

    @FXML
    void _7ButtonClick(ActionEvent event) {
        if(isNewProcess()){
            clearFields();
            inputField.appendText("7");
            setNewProcess(false);
        }
        else{
            inputField.appendText("7");
        }
    }

    @FXML
    void _8ButtonClick(ActionEvent event) {
        if(isNewProcess()){
            clearFields();
            inputField.appendText("8");
            setNewProcess(false);
        }
        else{
            inputField.appendText("8");
        }
    }

    @FXML
    void _9ButtonClick(ActionEvent event) {
        if(isNewProcess()){
            clearFields();
            inputField.appendText("9");
            setNewProcess(false);
        }
        else{
            inputField.appendText("9");
        }
    }

    @FXML
    void acButtonClick(ActionEvent event) {
        enablePointButton();
        clearFields();
    }

//    TODO: README
//    this code is messy
//    but will be cleaned up once decided on a course to take
//    it serves only to show the basic functionality of the calculator
//    which for now is Addition
//    take note that this implementation only allows for two operators
//    e.g. 1+34 OR 34 * 99
//    AND it does not have error handling
//    suggestions are always welcome btw ;)

    @FXML
    void addButtonClick(ActionEvent event) {
        enablePointButton();
        operation = Operation.ADD;
        processValues();

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
        operation = Operation.DIVIDE;
        processValues();
    }

    @FXML
    void equalsButtonClick(ActionEvent event) {
        enablePointButton();
        secondNum = Double.parseDouble(inputField.getText());
        valuesField.appendText(inputField.getText());
        inputField.setText(String.valueOf(computeAnswer()));
        partialAnswerField.clear();
        setNewProcess(true);
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
        operation = Operation.MULTIPLY;
        processValues();
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
        inputField.appendText(".");
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
        enablePointButton();
        operation = Operation.SUBTRACT;
        processValues();


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

//  This method is responsible for processing the input values for calculation
    private void processValues(){

        firstNum = Double.parseDouble(inputField.getText());
        inputField.appendText(String.format(" %s ",operation.getSymbol()));
        valuesField.setText(inputField.getText());
        inputField.clear();
        partialAnswerField.setText(String.valueOf(firstNum));
    }

    private double parseInput(String input) {
//        split string to a non-digit
//        docs reference: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
        String[] values = input.split("[\\D]");
        return Double.parseDouble(values[0]);
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
        }
        return 0;
    }

    private void setNewProcess(boolean newProcess){
        this.newProcess=newProcess;
    }

    private boolean isNewProcess(){
        return newProcess;
    }

    private void clearFields(){
        valuesField.clear();
        inputField.clear();
        partialAnswerField.clear();
    }
}

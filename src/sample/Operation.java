package sample;

public enum Operation {
    ADD ("+"),
    SUBTRACT ("-"),
    MULTIPLY ("x"),
    DIVIDE ("÷"),
    NONE (" ");

    private final String symbol;

    Operation(String symbol) {
        this.symbol=symbol;
    }

    public String getSymbol(){
        return symbol;
    }



}

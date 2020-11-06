package java;

public enum Operation {
    ADD ("+"),
    SUBTRACT ("-"),
    MULTIPLY ("x"),
    DIVIDE ("÷"),
    CEIL ("⌈ ⌉ "),
    FLOOR ("⌊ ⌋"),
    NONE (" ");

    private final String symbol;

    Operation(String symbol) {
        this.symbol=symbol;
    }

    public String getSymbol(){
        return symbol;
    }



}

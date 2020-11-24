package app;

public enum Operation {
    ADD ("+"),
    SUBTRACT ("-"),
    MULTIPLY ("x"),
    DIVIDE ("÷"),
    CEIL ("⌈ ⌉ "),
    FLOOR ("⌊ ⌋"),
    LOG("log"),
    LOGX("logxy"),
    FACT("!"),
    CBRT("\u221B"),
    SQRT("\u221A"),
    MOD("%"),
    EXP("^"),
    SQR("square"),
    NSTPOW("nested pow"),
    NONE (" ");

    private final String symbol;

    Operation(String symbol) {
        this.symbol=symbol;
    }

    public String getSymbol(){
        return symbol;
    }



}

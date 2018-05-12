//the expression interface which will define other types that will consume the interpreter

public interface Expression {

    String interpret(InterpreterContext ic);
}
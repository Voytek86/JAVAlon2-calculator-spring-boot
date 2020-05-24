package pl.sda.spring.exception;

import pl.sda.spring.operation.Operation;
import pl.sda.spring.operation.OperationType;

public class DivisionByZeroException extends RuntimeException{

    public DivisionByZeroException() {
        super ("Never divide by 0!");
    }
}


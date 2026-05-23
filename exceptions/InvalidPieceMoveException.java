package exceptions;

public class InvalidPieceMoveException extends RuntimeException{
    public InvalidPieceMoveException(String msg) {
        super(msg);
    }
}

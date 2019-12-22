package life.majiang.community.community.exception;

public class CustomizerException extends RuntimeException {
    private String message;

    public CustomizerException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    public CustomizerException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}

package life.majiang.community.community.exception;

public class CustomizerException extends RuntimeException {
    private String message;
    private Integer code;

    public CustomizerException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

}

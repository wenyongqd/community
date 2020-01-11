package life.majiang.community.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"The page may not exist or has expired!"),
    TARGET_PARAM_NOT_FOUND(2002, "please select a question to reply."),
    NO_LOGIN(2003, "please login and try again."),
    SYS_ERROR(2004, "server seems busy, take a rest."),
    TYPE_PARAM_WRONG(2005, "comment type is wrong."),
    COMMENT_NOT_FOUND(2006, "comment doesn't exist."),
    CONTENT_IS_EMPTY(2007,"Input cannot be empty."),
    READ_NOTIFICATION_FAIL(2008,"Body, you're reading other people's replies."),
    NOTIFICATION_NOT_FOUND(2009,"Replies are missing?");



    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

}

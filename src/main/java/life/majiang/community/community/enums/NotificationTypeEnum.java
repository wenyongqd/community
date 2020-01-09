package life.majiang.community.community.enums;

public enum NotificationTypeEnum {
    REPLY_QUESTION(1,"reply your question"),
    REPLY_COMMENT(1,"reply your comment")
    ;
    private int type;
    private String name;

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    NotificationTypeEnum(int status, String name) {
        this.type = status;
        this.name = name;
    }
}

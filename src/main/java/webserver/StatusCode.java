package webserver;

public enum StatusCode {
    OK(200, "OK"),
    CREATED(201, "CREATED"),
    NOT_FOUND(404, "NOT FOUND")
    ;


    private final int codeNum;
    private final String codeMessage;

    StatusCode(int codeNum, String codeMessage) {
        this.codeNum = codeNum;
        this.codeMessage = codeMessage;
    }

    public int getCodeNum() {
        return codeNum;
    }

    public String getCodeMessage() {
        return codeMessage;
    }
}
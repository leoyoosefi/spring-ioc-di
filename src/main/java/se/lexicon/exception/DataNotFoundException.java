package se.lexicon.exception;

public class DataNotFoundException extends Exception {

    private String objectName;

    public DataNotFoundException(String message, String objectName) {
        super(message);
        this.objectName = objectName;
    }

    public String getObjectName() {
        return objectName;
    }


}

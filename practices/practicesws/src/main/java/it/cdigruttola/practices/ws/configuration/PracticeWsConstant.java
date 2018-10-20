package it.cdigruttola.practices.ws.configuration;

public enum PracticeWsConstant {

    ENTITY_NOT_FOUND("it.cdigruttola.practices.ws.EntityNotFoundException.message");

    private String value;

    PracticeWsConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

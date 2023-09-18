package statics;

public enum readerType {
    STUDENT("Học viên"),
    POST_STUDENT("Học viên"),
    TEACHER("Học viên");
    public String value;

    readerType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "readerType{" +
                "value='" + value + '\'' +
                '}';
    }
}

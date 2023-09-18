package statics;

public enum TypeBook {
    NATURAL_SCIENCE("Khoa học tự nhiên"),
    ELEC_TELE("Điện tử viễn thông"),
    LITERATURE_ART("Văn học - Nghệ thuật");
    public String valueTypeBook;

    TypeBook(String valueTypeBook){
        this.valueTypeBook=valueTypeBook;
    }
}

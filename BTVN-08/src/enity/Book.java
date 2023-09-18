package enity;

import statics.TypeBook;

import java.util.Scanner;

public class Book {
    private static int nextIdBook=10000;
    private int idBook;
    private String nameBook;
    private  String author;
    private int publish;
    private TypeBook typeBook;

    public Book(){
        this.idBook=nextIdBook;
        nextIdBook++;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }

    public TypeBook getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(TypeBook typeBook) {
        this.typeBook = typeBook;
    }

    @Override
    public String toString() {
        return "enity.Book{" +
                "idBook='" + idBook + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", publish=" + publish +
                ", typeBook=" + typeBook.valueTypeBook +
                '}';
    }
    public void inputBook (){
        System.out.println("Nhập tên cuốn sách");
        this.setNameBook(new Scanner(System.in).nextLine());
        System.out.println("Nhập tác giả của cuốn sách");
        this.setAuthor(new Scanner(System.in).nextLine());
        System.out.println("Nhập năm xuất bản của cuốn sách");
        this.setPublish(new Scanner(System.in).nextInt());
        System.out.println("Chọn chủ để sách mà bạn muốn thêm vào. ");
        System.out.println("1. Khoa học tụ nhiên");
        System.out.println("2. Văn Học - Nghệ thuật ");
        System.out.println("3. Điện tử viễn thông");
        int enterTypeBook = new Scanner(System.in).nextInt();

        switch (enterTypeBook){
            case 1:
                this.setTypeBook(TypeBook.NATURAL_SCIENCE);
                break;
            case 2:
                this.setTypeBook(TypeBook.LITERATURE_ART);
                break;
            case 3:
                this.setTypeBook(TypeBook.ELEC_TELE);
                break;
        }
    }

}

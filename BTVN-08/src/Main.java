import enity.Reader;
import enity.Book;

import java.util.Scanner;



public class Main {
    public static Reader[] readers = new Reader[100];
    public static
    Book[] books= new Book[100];
    public static void main(String[] args) {
        while (true){
            prinMenu();
            System.out.print(" Bạn hãy chọn những chức năng trên ");
            int funtion = choseFuntion();
            switch (funtion){
                case 1:
                    inputReader();
                case 2:
                   showReader();
                    break;
                case 3:
                    inputInfoBook();
                    break;
                case 4:
                    prinbook();
                    break;
                case 5:
                    BookManagement bookManagement= new BookManagement();
                    System.out.println("Nhập ID của bạn ");
                    do {
                        int id = new Scanner(System.in).nextInt();
                        if (id ==bookManagement.getReader().getId()){
                            break;
                        }
                        System.out.println("ID của bạn đúng , vui long  nhập lại");
                    }while (true);
                    System.out.println("Nhập số lượng đầu sách mà bạn muốn mượn ");
                    int number;
                   do {
                       number = new Scanner(System.in).nextInt();
                       if (number<=5){
                           break;
                       }
                       System.out.println("Bạn chỉ được mượn tối đa 5 đầu sách , vui lòng nhập lại số lượng đầu sách bạn muốn mượn");
                   }while (true);
                    for (int i = 0; i < number; i++) {
                        System.out.println("Nhập tên đầu sách thứ "+(i+1)+" mà bạn muốn mượn");
                        String tenDauSach = new Scanner(System.in).nextLine();
                        System.out.println("Nhập số lượng cuốn sách mà bạn muốn mượn trong đầu sách trên");
                        int temp ;
                        do {
                            temp = new Scanner(System.in).nextInt();
                            if (temp<=3){
                                break;
                            }
                            System.out.println("Mỗi đầu sách bạn chỉ mượn được tối đa 3 cuốn, vui lòng nhập lại số lượng");
                        }while (true);
                    }
                    break;
                case 6:
                    //.....
                    break;
                case 7:
                    //.....
                    break;
                case 8:
                    //.....
                    break;
                case 9:
                    return;


            }
        }


    }

    private static void prinbook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null){
                System.out.println(books[i]);
            }
        }
    }

    private static void inputInfoBook() {
        System.out.println("Bạn có bao nhiêu đầu sách cần thêm mới");
        int newBook = new  Scanner(System.in). nextInt();
        for (int i = 0; i < newBook; i++) {
            System.out.println("Nhập thông tin cho cuốn sách thứ "+(i+1));
            Book book = new Book();
            book.inputBook();
           saveBook(book);


        }
    }

    private static void saveBook(Book book) {
        for (int j = 0; j < books.length; j++) {
            if (books[j]==null){
                books[j]=book;
                break;
            }
        }
    }

    public static void showReader() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i]!=null){
                System.out.println(readers[i]);
            }
        }
    }

    public static void inputReader() {
        System.out.println("Có Bao nhiêu bạn đọc muốn thêm mới ");
        int numberReader = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberReader; i++) {
            System.out.println("nhập thông tin cho bạn đọc thứ "+(i+1));
            Reader reader= new Reader();
            reader.inpuInfor();
            saveReader(reader);
        }
    }

    private static void saveReader(Reader reader) {
        for (int j = 0; j < readers.length; j++) {
            if (readers[j]==null){
                readers[j]=reader;
                break;
            }
        }
    }

    public static int choseFuntion() {
        int funtion;
        do {
            funtion= new Scanner(System.in).nextInt();
            if (funtion>=1&&funtion<=9){
                break;
            }
            System.out.print("Nhập không hợp lệ , vui long nhập lại");
        } while (true);
        return funtion;
    }

    public static void prinMenu() {
        System.out.println("Phần mềm quản lý mượn sách");
        System.out.println("1. Nhập bạn đọc mới ");
        System.out.println("2. In danh sách bạn đọc mới ");
        System.out.println("3. Nhập đầu sách mới ");
        System.out.println("4. In danh sách đầu sách đã có ");
        System.out.println("5. Lập bảng quán lý mượn sách ");
        System.out.println("6. In danh sách mượn sách ");
        System.out.println("7. Sắp xếp danh sách mợn sách ");
        System.out.println("8. Tìm kiếm danh sách muợn sách ");
        System.out.println("9. Thoát ");

    }
}

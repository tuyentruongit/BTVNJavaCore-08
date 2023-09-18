package enity;

import enity.Person;
import statics.readerType;

import java.util.Scanner;

public class Reader extends Person {
    private static int nextID = 10000;

    private int id;
    private readerType readerType;


    public Reader(){
        this.id=nextID;
        nextID++;
    }


    public int getId() {
        return id;
    }

    public statics.readerType getReaderType() {
        return readerType;
    }

    public void setReaderType(readerType readerType) {
        this.readerType = readerType;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "enity.Reader{" +
                "id=" + id +
                ", statics.readerType=" + readerType.value +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
    public void inpuInfor(){
        inputInforPerson();
        System.out.println("Nhập loại bạn đọc, chọn một trong các loại dưới đây");
        System.out.println("1. Sinh viên");
        System.out.println("2. Học viên cao học");
        System.out.println("3. Giảng viên");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setReaderType(readerType.STUDENT);
                break;
            case 2:
                this.setReaderType(readerType.POST_STUDENT);
                break;
            case 3:
                this.setReaderType(readerType.TEACHER);
                break;
        }
    }
}

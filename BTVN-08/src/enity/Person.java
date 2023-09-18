package enity;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


    public void inputInforPerson (){
        System.out.println("Nhập họ và tên");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại");
        this.setPhone(new Scanner(System.in).nextInt());
    }

}

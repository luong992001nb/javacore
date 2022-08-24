package com.vn;

public class Main {
    public static void main(String[] args) {
        StudentSub studentSub = new StudentSub("luong",21,"ha noi",9,9);
        System.out.printf("tên: %s ,tuổi: %d , địa chỉ: %s \n",studentSub.getTen(),studentSub.getTuoi(),studentSub.getDiaChi() );
        Students students =  new StudentSub();
        students.diHoc();
    }
}

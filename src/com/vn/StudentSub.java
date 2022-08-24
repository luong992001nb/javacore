package com.vn;

public class StudentSub extends Students{
    private double diem;
    private double diemTb;



    public StudentSub(){}

    public StudentSub(String ten, int tuoi, String diaChi, double diem, double diemTb) {
        super(ten, tuoi, diaChi);
        this.diem = diem;
        this.diemTb = diemTb;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    public void diHoc(){
        System.out.println("cham chỉ");
    }
}

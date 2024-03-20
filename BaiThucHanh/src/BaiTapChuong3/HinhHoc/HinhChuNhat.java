package BaiTapChuong3.HinhHoc;

public class HinhChuNhat {
    public float chieudai;
    public float chieurong;
    public float chuvi;
    public float dientich;
    public HinhChuNhat(){
        chieudai = 0;
        chieurong = 0;
    }
    public void nhap(float chieudai,float chieurong){
        System.out.println("Chieu dai = "+chieudai+" chieu rong = "+chieurong);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public void tinhtoan(){
        chuvi = 2*(chieudai+chieurong);
        dientich = chieudai*chieurong;
    }
    public void in(){
        System.out.println("Hinh chu nhat co chu vi = "+chuvi+" va dien tich = "+dientich);
    }
}

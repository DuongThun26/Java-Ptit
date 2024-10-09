import java.util.Scanner;
class ThiSinh{
    private String ma, hoTen;
    private double diemToan, diemLy, diemHoa;

    public ThiSinh(String ma, String hoten, float diemToan, float diemLy, float diemHoa) {
        this.ma = ma;
        this.hoTen = hoten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }
    
    public double diemUuTien(){
        double d;
        StringBuilder s = new StringBuilder(ma);
        String x = s.substring(0, 3);
        if(x.equals("KV1")) return 0.5;
        else if(x.equals("KV2")) return 1.0;
        else return 2.5;
    }
    public double tongDiem(){
        return diemToan * 2 + diemLy + diemHoa;
    }
    public String trangThai(){
        double tong = tongDiem() + diemUuTien();
        if(tong >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
}
public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.print(a.getMa() + " " + a.getHoTen() + " ");
        if(a.diemUuTien() % 1 == 0) System.out.print((long)a.diemUuTien() + " ");
        else System.out.print(a.diemUuTien() + " ");
        if(a.tongDiem() % 1 == 0) System.out.print((long)a.tongDiem());
        else System.out.print(a.tongDiem());
        System.out.println(" " + a.trangThai());
    }
}
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7
//public class J04013_BaiToanTuyenSinh {
//    public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           double d = 12.1;
//           long c = 12;
//           System.out.println(d == c);
//    }
//}
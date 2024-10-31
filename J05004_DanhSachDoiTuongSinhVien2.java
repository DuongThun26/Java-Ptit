
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, ngaySinh;
    private float gpa;
    public SinhVien(){
        
    }
    public SinhVien(int ma, String ten, String lop, String ngaySinh, float gpa) {
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public String chuanHoaTen(String s){
        s = s.trim();
        String[] a = s.split("\\s+");
        String re = "";
        for(int i = 0; i < a.length; i++){
            re += Character.toUpperCase(a[i].charAt(0));
            re += a[i].substring(1).toLowerCase();
            if(i != a.length - 1) re += " ";
        }
        return re;
    }
    public String chuanHoa(String s){
        String[] a = s.split("/");
        if(a[0].length() != 2) a[0] = "0" + a[0];
        if(a[1].length() != 2) a[1] = "0" + a[1];
        return a[0] + "/" + a[1] + "/" + a[2];
    }

    @Override
    public String toString() {
        return ma + " " + chuanHoaTen(ten) + " " + lop + " " + chuanHoa(ngaySinh) + " " + String.format("%.2f", gpa);
    }   
    
}
public class J05004_DanhSachDoiTuongSinhVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] ds = new SinhVien[n];
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            ds[i] = a;
        }
        for(int i = 0; i < n; i++){
            System.out.println(ds[i]);
        }
    }
}

//1
//NguyeN    VAn   BiNh
//D20CQCN01-B
//2/12/2002
//3.1
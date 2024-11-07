
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class BangDiem{
    private String ma, ten;
    private double m1, m2, m3, m4, m5, m6, m7, m8, m9, m10;

    public BangDiem(int ma, String ten, float m1, float m2, float m3, float m4, float m5, float m6, float m7, float m8, float m9, float m10) {
        this.ma = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        this.m6 = m6;
        this.m7 = m7;
        this.m8 = m8;
        this.m9 = m9;
        this.m10 = m10;
    }
    public String getMa(){
        return ma;
    }
    public double DiemTB(){
        double diemtb =  (m1 * 2 + m2 * 2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10) / 12.0;
        return Math.round(diemtb * 10) / 10.0;
    }
    public String XepLoai(){
        if(DiemTB() >= 9) return "XUAT SAC";
        else if(DiemTB() >= 8) return "GIOI";
        else if(DiemTB() >= 7) return "KHA";
        else if(DiemTB() >= 5) return "TB";
        else return "YEU";
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + DiemTB() + " " + XepLoai();
    }
}
public class J05018_BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BangDiem[] ds = new BangDiem[n];
        for(int i = 0; i < n; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] s = s2.split("\\s+");
            BangDiem a = new BangDiem(i + 1, s1, Float.parseFloat(s[0]), Float.parseFloat(s[1]), Float.parseFloat(s[2]), Float.parseFloat(s[3]), Float.parseFloat(s[4]), Float.parseFloat(s[5]), Float.parseFloat(s[6]), Float.parseFloat(s[7]), Float.parseFloat(s[8]), Float.parseFloat(s[9]));
            ds[i] = a;
        }
        Arrays.sort(ds, new Comparator <BangDiem>(){
            public int compare(BangDiem a, BangDiem b){
                if(a.DiemTB() == b.DiemTB()){
                    return a.getMa().compareTo(b.getMa());
                }
                else{
                    if(a.DiemTB() > b.DiemTB()) return -1;
                    else return 1;
                }
            }
        });
        for(BangDiem b : ds){
            System.out.println(b);
        }
    }
}



//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0


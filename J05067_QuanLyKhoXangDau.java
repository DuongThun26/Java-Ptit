
import java.util.Scanner;


class Kho{
    private String ma;
    private long soLuong;
    
    public Kho(){
        
    }
    public Kho(String ma, long soLuong){
        this.ma = ma;
        this.soLuong = soLuong;
    }
    public String getMa(){
        return ma.substring(0, 1);
    }
    public String getHangSX(){
        String s = ma.substring(3);
        if(s.compareTo("BP") == 0) return "British Petro";
        else if(s.compareTo("ES") == 0) return "Esso";
        else if(s.compareTo("SH") == 0) return "Shell";
        else if(s.compareTo("CA") == 0) return "Castrol";
        else if(s.compareTo("MO") == 0) return "Mobil";
        else return "Trong Nuoc";
    }
    public long getThue(){
        String z = ma.substring(3);
        if(z.compareTo("TN") == 0) return 0;
        else{
            String s = ma.substring(0, 1);
            if(s.compareTo("X") == 0) return (3 * 1280 * soLuong);
            else if(s.compareTo("D") == 0) return (35 * 112 * soLuong / 10);
            else return (2 * 97 * soLuong);
        }
    }
    public long getDonGia(String s){
        if(s.compareTo("X") == 0) return 128000;
        else if(s.compareTo("D") == 0) return 11200;
        else return 9700;
    }
    public long thanhTien(){
        return getDonGia(getMa()) * soLuong + getThue();
    }
    public String toString(){
        return ma + " " + getHangSX() + " " + getDonGia(getMa()) + " " + getThue() + " " + thanhTien();
    }
    
}
public class J05067_QuanLyKhoXangDau{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Kho[] ds = new Kho[n];
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            ds[i] = new Kho(a[0], Long.parseLong(a[1]));
        }
        for(Kho k : ds){
            System.out.println(k);
        }
    }
}
//3
//N89BP 4500
//D00BP 3500
//X92SH 2600
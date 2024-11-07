
import java.util.ArrayList;
import java.util.Scanner;

class GV1{
    private String ma, ten, mon;

    public GV1(int ma, String ten, String mon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.mon = mon;
    }

    public String getTen() {
        return ten;
    }
    public String getMon(String s){
        String[] a = s.split("\\s+");
        String res = "";
        for(String x : a){
            res += Character.toUpperCase(x.charAt(0));
        }
        return res;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + getMon(mon);
    }
    
}
public class J05027_TimKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <GV1> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            GV1 a = new GV1(i + 1, sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            s = s.toLowerCase();
            for(int i = 0; i < n; i++){
                if(ds.get(i).getTen().toLowerCase().contains(s)){
                    System.out.println(ds.get(i));
                }
            }
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN
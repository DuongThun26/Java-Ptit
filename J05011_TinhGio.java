
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class ThongTin{
    private String ma, ten, gioVao, gioRa;

    public ThongTin(String ma, String ten, String gioVao, String gioRa) {
        this.ma = ma;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
    public int gio(){
        String s1 = gioVao.replace(":", " ");
        String s2 = gioRa.replace(":", " ");
        String a[] = s1.split("\\s+");
        String b[] = s2.split("\\s+");
        int b1 = Integer.parseInt(b[1]);
        int a1 = Integer.parseInt(a[1]);
        int b0 = Integer.parseInt(b[0]);
        int a0 = Integer.parseInt(a[0]);
        return (b0 - a0) * 60 + (b1 - a1);
    }
    public String GioChoi(){
        int h = gio() / 60;
        int m = gio() % 60;
        return h + " gio " + m + " phut";
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + GioChoi();
    }
}
public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThongTin[] ds = new ThongTin[n];
        for(int i = 0; i < n; i++){
            ThongTin a = new ThongTin(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds[i] = a;
        }
        Arrays.sort(ds, new Comparator <ThongTin>(){
            public int compare(ThongTin a, ThongTin b){
                if(a.gio() > b.gio()) return -1;
                else if(a.gio() < b.gio()) return 1;
                return 0;
            }
        });
        for(ThongTin x : ds){
            System.out.println(x);
        }
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00
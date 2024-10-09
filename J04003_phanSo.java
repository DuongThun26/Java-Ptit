/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
class PhanSo{
    private long tuSo, mauSo;
    public PhanSo(long tu, long mau){
        this.tuSo = tu;
        this.mauSo = mau;
    }
    public long gcdd(long a, long b){
        if(b == 0) return a;
        return gcdd(b, a % b);
    }
    public void toiGian(){
        long x = gcdd(tuSo, mauSo);
        mauSo /= x;
        tuSo /= x;
    }
    public String toString(){
        return tuSo + "/" + mauSo;
    }
}
public class J04003_phanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p = new PhanSo(sc.nextLong(), sc.nextLong());
        p.toiGian();
        System.out.println(p.toString());
    }
}

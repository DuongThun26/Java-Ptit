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
    public PhanSo(){
        
    }
    public PhanSo(long x, long y){
        tuSo = x;
        mauSo = y;
    }
    public long gcdd(long a, long b){
        if(b == 0) return a;
        return gcdd(b, a % b);
    }
    public long lcmm(long a, long b){
        return a / gcdd(a, b) * b;
    }
    public static PhanSo tongPhanSo(PhanSo a, PhanSo b){
        long x = a.lcmm(a.mauSo, b.mauSo);
        a.tuSo = a.tuSo * (x / a.mauSo);
        b.tuSo = b.tuSo * (x / b.mauSo);
        PhanSo p = new PhanSo();
        p.tuSo = a.tuSo + b.tuSo;
        p.mauSo = x;
        return p;
    }
    public void Rutgon(){
        long x = gcdd(tuSo, mauSo);
        tuSo /= x;
        mauSo /= x;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
}
public class J04004_tongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo p2 = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo p = new PhanSo();
        p = PhanSo.tongPhanSo(p1, p2);
        p.Rutgon();
        System.out.println(p.toString());
    }
}
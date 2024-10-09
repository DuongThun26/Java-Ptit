/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class J01025_hinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), t = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int y1 = Math.min(y, b), x1 = Math.max(z, c);
        int x2 = Math.min(x, a), y2 = Math.max(t, d);
        int chieuDai = y2 - y1, chieuRong = x1 - x2;
        int v = Math.max(chieuDai, chieuRong);
        System.out.println(v * v);
    }
}

import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
class Rectange{
    double width, height;
    String color;
    public Rectange(){
        width = height = 1;
    }
    public Rectange(double x, double y, String color){
        width = x;
        height = y;
        this.color = chuanHoa(color);
    }
    public String chuanHoa(String s){
        String x = "" + Character.toUpperCase(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            x += Character.toLowerCase(s.charAt(i));
        }
        return x;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double x){
        this.width = x;
    }
    public void serHeight(double y){
        this.height = y;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return chuanHoa(color);
    }
    public double findArea(){
        return (height * width);
    }
    public double findPerimeter(){
        return (2 * (height + width));
    }
}
public class J04002_khaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong(), y = sc.nextLong();
        String s = sc.next();
        Rectange a = new Rectange(x, y, s);
        if(x > 0 && y > 0){
            System.out.println((long)a.findPerimeter() + " " + (long)a.findArea() + " " + a.color);
        }
        else{
            System.out.println("INVALID");
        }
    }
}


import java.util.Scanner;


class Matrix{
    private int n, m;
    private int [][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    
    public Matrix(int n, int m, int [][] a) {
        this.n = n;
        this.m = m;
        this.a = a;
    }
    public void nextMatrix(Scanner sc){
        this.a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix trans(){
        int[][] b = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                b[j][i] = a[i][j];
            }
        }
        return new Matrix(m, n, b);
    }
    public Matrix mul(Matrix b){
        int c[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = 0;
                for(int z = 0; z < m; z++){
                    c[i][j] += this.a[i][z] * b.a[z][j];
                }
            }
        }
        return new Matrix(n, n, c);
    }
    public String toString(){
        String s = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                s = s + ("" + a[i][j]) + " ";
            }
            s += "\n";
        }
        return s;
    }
}
public class J04017_TichMaTranVaChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }

}
//1
//2 2
//1 2
//3 4
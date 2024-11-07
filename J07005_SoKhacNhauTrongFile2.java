import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;
public class J07005_SoKhacNhauTrongFile2 {
    public static int nhiPhan(String s){
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != '0'){
                res += Math.pow(2, s.length() - 1 - i);
            }
        }
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.IN"));
        TreeMap <String, Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(map.containsKey(s)){
                int cnt = map.get(s);
                cnt++;
                map.put(s, cnt);
            }
            else{
                map.put(s, 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println(nhiPhan(key) + " " + value);
        });
    }
}

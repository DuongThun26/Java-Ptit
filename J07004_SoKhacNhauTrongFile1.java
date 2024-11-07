import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap <Integer, Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            int n = Integer.parseInt(s);
            if(map.containsKey(n)){
                int cnt = map.get(n);
                cnt++;
                map.put(n, cnt);
            }
            else{
                map.put(n, 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}

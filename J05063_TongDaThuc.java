
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import static javax.management.Query.value;

class DaThuc{
    private TreeMap <Integer, Integer> map;
    public DaThuc(TreeMap map){
        this.map = map;
    }
    public DaThuc(){
        map = new TreeMap<Integer, Integer>();
    }
    public DaThuc(String s){
        this.map = new TreeMap<Integer, Integer>();
        s = s.replace("+", " ");
        String[] a = s.split("\\s+");
        for(int i = 0; i < a.length; i++){
            String[] b = a[i].split("\\*x\\^");
            map.put(Integer.parseInt(b[1]), Integer.parseInt(b[0]));
        }
    }
    public DaThuc cong(DaThuc c){
        DaThuc re = new DaThuc();
        re.map = new TreeMap<Integer, Integer>(this.map);
        c.map.forEach((key, value) -> re.map.merge(key, value, Integer::sum));       
        return re;
    }

    @Override
    public String toString() {
        Stack<String> st = new Stack<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            String s = "";
            s = s + entry.getValue() + "*x^" + entry.getKey();
            st.push(s);
        }
        String z = "";
        z += st.pop();
        while(!st.empty()){
            z = z + " + " + st.pop();
        }
        return z;
    }
    
}
public class J05063_TongDaThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}

package JavaEdu.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/6/17-18:09
 */
public class str3 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put("1", "Lucy");
        map.put("2", "Lucy");
        map.put("3", "John");
        map.put("4", "Smith");
        map.put("5", "Amanda");
        Set keySet = map.keySet();
        for (Object key : keySet) {
            Object value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String ele1 = (String) obj1;
        String ele2 = (String) obj2;
        return ele2.compareTo(ele1);
    }

}

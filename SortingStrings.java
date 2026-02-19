import java.util.*;

public class SortingStrings {
    
    public static String sortString(String s) {
        char[] c_array = s.toCharArray();   
        Arrays.sort(c_array);               

        return new String(c_array);         
    }

    public static void main(String[] args) {
        
        String s1 = "dcba";
        System.out.println(sortString(s1));   
    }
}

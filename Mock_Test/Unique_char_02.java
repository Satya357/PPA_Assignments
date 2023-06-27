import java.util.HashMap;

public class Unique_char_02 {
    public static int uniqueChar(String str) {
        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (char c : str.toCharArray()) {
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (hashmap.get(str.charAt(i)) == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int resultIndex = uniqueChar(s);
        System.out.println("Unique Non Repeating character found at index : " + resultIndex);
    }
}

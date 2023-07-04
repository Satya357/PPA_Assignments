public class Compress_string_05 {
    public static int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }

        int index = 0;
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++] = chars[i - 1];

                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (int j = 0; j < countStr.length(); j++) {
                        chars[index++] = countStr.charAt(j);
                    }
                }

                count = 1;
            }
        }

        chars[index++] = chars[chars.length - 1];

        if (count > 1) {
            String countStr = String.valueOf(count);
            for (int j = 0; j < countStr.length(); j++) {
                chars[index++] = countStr.charAt(j);
            }
        }

        return index;
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int newLength = compress(chars);

        System.out.println("New Length: " + newLength);
        System.out.print("Modified Array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print("'" + chars[i] + "'");
            if (i != newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class RecursionString {
    public static void main(String[] args) {
        System.out.println(sameString("hallo", "hhhhhlo"));
        String str = "Hello";
        String str2 = "hi";
        System.out.println(str.startsWith("dd"));
        System.out.println(str.substring(3).equals(str2));

    }

    public static boolean sameString(String str2, String str3) {
        if (str2.substring(3).equals(str3.substring(3))) {
            return true;
        } else {
            return false;
        }

    }
}

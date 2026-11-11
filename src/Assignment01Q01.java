public class Assignment01Q01 {
    public static void main(String[] args) {
     for (String str : args) {
        if (!str.isEmpty()&&((int)str.charAt(0) % 5 == 0)) {
            System.out.println(str.charAt(0));
        }
     }
    }
}

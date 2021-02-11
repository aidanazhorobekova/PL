public class NestedNumbersFor {
    public static void main(String[] args) {
        for (int lines = 3; lines > 0; lines --) {
            for (int set = 0; set < 10; set ++) {
                for (int rep = 3; rep > 0; rep --) {
                    System.out.print(set);
                }
            }
            System.out.println("");
        }
    }
}

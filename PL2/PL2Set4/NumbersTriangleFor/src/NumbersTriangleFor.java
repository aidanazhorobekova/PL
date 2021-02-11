public class NumbersTriangleFor {
    public static void main(String[] args) {
        for (int set = 1; set < 8; set ++) {
            for (int lines = set; lines == set; lines ++) {
                for (int rep = 1; rep <= set; rep ++) {
                    System.out.print(set);
                }
                System.out.println("");
            }
        }
    }
}

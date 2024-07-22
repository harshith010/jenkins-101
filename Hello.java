public class Hello {
    public static void main(String[] args) {
        System.out.println("Hii");
        demo.Hars(5, 10);
    }
}


class demo {
    static void Hars(int a, int b) {
        try {
            int c = a + b;
            if (c == 11) {
                Thread.sleep(30);
                System.out.println("============Program success============");
            } else {
                System.out.println("Not matching");
                System.err.println("FAIL");
            }
        } catch (Exception e) {
            System.out.println("Retry");
        }
    }
}

class demo {
    static void Hars(int a, int b) {
        try {
            int c = a + b;
            if (c == 11) {
                Thread.sleep(30);
                System.out.println("============Program success============");
            } else {
                System.out.println("Failure");
            }
        } catch (Exception e) {
            System.out.println("Retry");
        }
    }
}

public class Hello {
    public static void main(String[] args) {
        demo.Hars(6, 5);
    }
}
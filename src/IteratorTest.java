import java.util.*;

public class IteratorTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int count = 0;
        for(int i = 0; i < 15000; i++) {
            count++;
        }
        System.out.println((System.currentTimeMillis() - start) + "ms");
    }
}
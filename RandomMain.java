package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(1); // seed가 같으면 랜덤 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble(); // 0.0~ 1.0
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(7);// 0~ 7까지
        System.out.println("0 to 7 :  = " + randomRange1);

        int randomRange2 = random.nextInt(7) + 1; // 1~7까지 출력
        System.out.println("1 to 7 : = " + randomRange2);
    }
}

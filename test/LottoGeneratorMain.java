package lang.math.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator gen = new LottoGenerator();
        int[] lottoNum = gen.generate();

        System.out.println("로또 번호 :");
        for (int i : lottoNum) {
            System.out.println(i + " ");
        }
    }
}

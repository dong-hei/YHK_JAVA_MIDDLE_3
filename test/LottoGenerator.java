package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random ran = new Random();
    private int[] lottoNumbers;
    private int cnt;

    public int[] generate(){
        lottoNumbers = new int[6];
        cnt = 0;
        
        while (cnt < 6){
            //1부터 45사이 숫자 생성
            int num = ran.nextInt(45) + 1;
            // 중복되지 않는 경우에만 배열에 추가
            if(UniqueNum(num)){
                lottoNumbers[cnt] = num;
                cnt++;
            }
        }
        return lottoNumbers;
    }

    private boolean UniqueNum(int num){
        for (int i = 0; i < cnt; i++) {
            if (lottoNumbers[i] == num){
                return false;
            }
        }
        return true;
    }
}

package chap01_stack;

import java.util.ArrayList;
import java.util.List;


public class app {
        public static List<Integer> solution(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();

            int previous = -1;  // 초기값은 배열에 없을 값으로 설정
            for (int num : arr) {
                if (num != previous) {
                    list.add(num);
                }
                previous = num;
            }

            // ArrayList를 int 배열로 변환


            return list;
        }

        public static void main(String[] args) {
            // 테스트 케이스
            int[] testArray = {1, 1, 3, 3, 0, 1, 1};
            List<Integer> result = solution(testArray);

            // 결과 출력
            System.out.println("결과: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }




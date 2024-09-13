package chap01_stack;

import java.util.ArrayList;
import java.util.List;


public class Solution {
        public static List<Integer> solution(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();

            int previous = -1;
            for (int num : arr) {
                if (num != previous) {
                    list.add(num);
                }
                previous = num;
            }




            return list;
        }

        public static void main(String[] args) {

            int[] testArray = {1, 1, 3, 3, 0, 1, 1};
            List<Integer> result = solution(testArray);


            System.out.println("결과: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }




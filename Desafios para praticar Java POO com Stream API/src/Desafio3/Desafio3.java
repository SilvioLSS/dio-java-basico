package Desafio3;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      
            boolean allPositive = allPositive(numeros);
            System.out.println("Todos os números são positivos? " + allPositive);
            System.out.println(numeros);
        }
        
              
        public static boolean allPositive(List<Integer> list) {
            return list.stream().allMatch(i -> i > 0);
    }
}
package Desafio6;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        boolean hasNumberGreaterThan10 = numeros.stream()
        .anyMatch(numero -> numero > 10);

        if (hasNumberGreaterThan10) {
            System.out.println("A lista contém pelo menos um número maior que 10.");
        } else {
            System.out.println("A lista não contém nenhum número maior que 10.");
        }
        
    }
}

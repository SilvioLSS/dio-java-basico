package Desafio7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        Optional <Integer> secondNumber = numeros.stream()
        .sorted((a, b) -> b - a)
        .skip(1)
        .findFirst();

        System.out.println("O segundo maior número da lista é: " + secondNumber.get());
    }
}

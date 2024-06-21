package Desafio14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio14::verificarPrimo)
                .max(Integer::compareTo);

        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista!");
        }
    }

    // Método para verificar se um número é primo
    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }

        int limite = (int) Math.sqrt(numero);
        for (int i = 3; i <= limite; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

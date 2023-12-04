package com.hackerrank.studies.streams;

import java.util.Arrays;
import java.util.List;

/**
 * List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
 * lista.stream()
 *     .skip(2) // ignora os dois primeiros números
 *     .limit(9) // limita a 9 números
 *     .distinct() // ignora números iguais
 *     .max(Comparator.naturalOrder()); // pega o maior item pela ordem natural
 *     .map(e -> e * 2) // multiplica cada item por 2
 *     .filter(e -> e % 2 == 0) // mantém apenas números pares
 *      .count(); // pega quantos itens restam no stream
 *      .collect(Collectors.toList()); // coleta todos os itens em uma nova lista
 *      .forEach(System.out::print); // imprime todos no console
 */

public class Result {

  /*
   * Complete the 'formacaoDeTime' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts the following parameters:
   *  1. INTEGER_ARRAY pontuacao
   *  2. INTEGER tamanho_do_time
   *  3. INTEGER k
   */


  public static void main(String[] args) {

    // criando uma lista de string
    List<Integer> lista = Arrays.asList(9, 17, 12, 10, 2, 7, 2, 11, 20, 8, 3, 4);
    int tamanho_do_time = 12;
    int k;

    // filtrar pelo valor maximo dos 3 primeiros numeros da lista
    long maximoTresPrimeiros = lista.stream().limit(3).mapToInt(Integer::intValue).max().getAsInt();
    System.out.println(maximoTresPrimeiros);

    // selecionar os tres ultimos numeros da lista
    List<Integer> novaListaPontuacao = lista.subList(9, 11);

    // filtrar pelo valor maximo dos 3 ultimos numeros da lista
    long maximoTresUltimos = novaListaPontuacao.stream().limit(3).mapToInt(Integer::intValue).max().getAsInt();

    // somar os 2 maiores valores encontrados
    System.out.println(maximoTresPrimeiros + maximoTresPrimeiros);


  }

}

    //Integer max2 = pontuacao.stream().limit(3).mapToInt(Integer::intValue).max().getAsInt();




/**
 * my output atencao ao inicio do for ==>>> int = 1
 * Your Output (stdout)
 *
 *
 */


package com.implementingCollections.implementingCollections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        //Método de atualização:
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        //Exibir na ordem alfabética:
        Collections.sort(nomes);
        nomes.set(2, "Wesley");
        System.out.println(nomes);

        //Remover o elemento do indice indicado:
        nomes.remove(4);
        System.out.println(nomes);

        //Remover o elemento em si da lista:
        nomes.remove("Wesley");
        System.out.println(nomes);

        //Retornar para uma variavel o elemento que passarmos:
        String nome = nomes.get(1);
        System.out.println(nome);

        //Retorna o indice que corresponde ao nome Carlos (Quando não encontra o elemento, retorna -1):
        int posicao = nomes.indexOf("Wesley");
        System.out.println(posicao);

        //Retornar o tamanho da lista:
        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();
        System.out.println(tamanho);

        //Retorna se o elemento existe ou não na lista
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        //Navegar por cada elemento:
        for (String nomeDoItem : nomes) {
            System.out.println("---> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        //retorna um booleano true ou false
        while (iterator.hasNext()) {
            //se existir mais um elemento retornará true
            System.out.println("----> " +iterator.next());
        }

        //Limpar a lista:
        nomes.clear();

        //Retorna se a lista está ou não vazia:
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);


    }
}

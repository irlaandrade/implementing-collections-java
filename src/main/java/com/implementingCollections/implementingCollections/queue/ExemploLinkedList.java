package com.implementingCollections.implementingCollections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //Retorna e remove o primeiro elemento da fila
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        //filaBanco.clear();

        //Retorna o primeiro elemento da fila, mas não o remove, e retorna null se a fila estiver vazia
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        //Retorna o primeiro elemento da fila, não o remove, mas se a fila estiver vazia retorna uma exception
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()) {
            System.out.println("---> " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        //filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

        //É adicionado no final da fila
        filaBanco.add("Wesley");
        System.out.println(filaBanco);

    }
}

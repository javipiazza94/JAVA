package com.main.test;
import java.util.ArrayList;

public class MangaTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        
        System.out.println("Lista inicial: " + list);
        
        // Agregar elementos al final
        list.add("Item 5");
        System.out.println("lista depues de añadir un item: " + list);
        
        // Agregar elementos en una posición específica
        list.add(2, "Item 0");
        System.out.println("Lista depues de añadir un item en un lugar especifico: " + list);
        
        // Obtener elementos en una posición específica
        String item = list.get(3);
        System.out.println("item en la posicion 3: " + item);
        
        // Reemplazar elementos en una posición específica
        list.set(3, "New Item");
        System.out.println("lista despuesde reemplazar un elemento: " + list);
        
        // Eliminar elementos en una posición específica
        list.remove(3);
        System.out.println("lista despues de borrr un elemento: " + list);
        
        // Tamaño de la lista
        int size = list.size();
        System.out.println("tamaño de lista: " + size);
        
        // Verificar si la lista está vacía
        boolean isEmpty = list.isEmpty();
        System.out.println("Esta la lista vacia? " + isEmpty);
        
        // Buscar elementos en la lista
        boolean contains = list.contains("Item 1");
        System.out.println("contiene el item1? " + contains);
        
        // Obtener la posición de un elemento
        int index = list.indexOf("Item 2");
        System.out.println("Index del Item 2': " + index);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaheap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author stive
 */
public class Heap {

    void insertInHeap(ArrayList<Integer> heap, int x) {
        //int n = heap.size() + 1;
        heap.add(x);
        siftUp(heap);
    }

    void siftUp(ArrayList<Integer> heap) {
        int s = heap.size() - 1;
        while (s > 1) {
            int f = s / 2;
            if (heap.get(f) < heap.get(s)) {
                return;
            }
            //swap(heap.get(p), heap.get(h));
            int aux = heap.get(f);
            heap.set(f, heap.get(s));
            heap.set(s, aux);
            s = f;
        }
        //return;
    }

    private void swap(int p, int h) {
        int aux = p;
        p = h;
        h = aux;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Heap heap = new Heap();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        heap.insertInHeap(l, 1);
        heap.insertInHeap(l, 3);
        heap.insertInHeap(l, 4);
        heap.insertInHeap(l, 5);
        heap.insertInHeap(l, 17);
        heap.insertInHeap(l, 20);
        heap.insertInHeap(l, 25);
        heap.insertInHeap(l, 8);
        heap.insertInHeap(l, 10);
        heap.insertInHeap(l, 18);
        heap.insertInHeap(l, 22);
        heap.insertInHeap(l, 30);
        heap.insertInHeap(l, 55);
        heap.insertInHeap(l, 2);

        for (Integer lista : l) {
            System.out.println("El valor es " + lista);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaheap;

import java.util.ArrayList;

/**
 *
 * @author stive
 */
public class Heap {

    void insertInHeap(ArrayList<Integer> heap, int x) {
        heap.add(x);
        siftUp(heap);
    }

//S = Son F = Father
//if you want change to maxheap, change > to < 
    void siftUp(ArrayList<Integer> heap) {
        int s = heap.size() - 1;
        while (s > 1) {
            int f = s / 2;
            if (heap.get(f) < heap.get(s)) {
                return;
            }
            int aux = heap.get(f);
            heap.set(f, heap.get(s));
            heap.set(s, aux);
            //swap(heap, f, s);
            s = f;
        }

    }

    private void swap(ArrayList<Integer> heap, int f, int s) {
        int aux = heap.get(f);
        heap.set(f, heap.get(s));
        heap.set(s, aux);
    }

    int deleteOfHeap(ArrayList<Integer> heap) {
        int res = heap.get(1);
        int x = heap.size() - 1;
        heap.set(1, heap.get(x));
        heap.remove(x);
        siftDown(heap);
        return res;
    }

    public void siftDown(ArrayList<Integer> heap) {
        int f = 1;
        int n = heap.size() - 1;
        while (f <= n / 2) {
            int leftS = f * 2;
            if (leftS + 1 <= n && heap.get(leftS + 1) < heap.get(leftS)) {
                leftS++;
            }
            if (heap.get(f) < heap.get(leftS)) {
                return;
            }
            swap(heap, f, leftS);
            f = leftS;
        }
    }

    public void heapSort(int[] A) {
        ArrayList<Integer> b = new ArrayList<>();
        b.add(0);
        for (int i = 0; i < A.length; i++) {
            insertInHeap(b, A[i]);
        }
        System.out.println("\nMINHEAP");
        for (int i = 1; i < b.size(); i++) {
            System.out.print(b.get(i) + "-");
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = deleteOfHeap(b);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Heap heap = new Heap();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        //PRIMER EJEMPLO 
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

        System.out.println("PRIMER EJEMPLO");
        System.out.println("MinHeap:");
        for (int i = 1; i < l.size(); i++) {
            System.out.print(l.get(i) + "-");
        }

        System.out.println("\nSORT");
        int n = 0;
        int[] array = new int[14];
        while (n <= 13) {
            array[n] = heap.deleteOfHeap(l);
            System.out.print(array[n] + "-");
            n++;
        }
        
        int[] ar = new int[14];
        //add elements
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100);
        }
        System.out.println("\nSEGUNDO EJEMPLO");
        //show my array
        System.out.println("SHOW ARRAY");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "-");
        }
        heap.heapSort(ar);
        
        System.out.println("\nSORT ARRAY");
        for(int i = 0; i<ar.length; i++){
            System.out.print(ar[i]+ "-");
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author stive
 */
public class HeapNode {
        
    private int element;
    private HeapNode left;
    private HeapNode rigth;

    public HeapNode(int element, HeapNode left, HeapNode rigth) {
        this.element = element;
        this.left = left;
        this.rigth = rigth;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public HeapNode getLeft() {
        return left;
    }

    public void setLeft(HeapNode left) {
        this.left = left;
    }

    public HeapNode getRigth() {
        return rigth;
    }

    public void setRigth(HeapNode rigth) {
        this.rigth = rigth;
    }
    
    
}

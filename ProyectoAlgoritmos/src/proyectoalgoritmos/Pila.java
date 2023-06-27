/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;
/**
 *
 * @author Jose
 */
public class Pila {
    private int idx;
    private String[] data;

    public Pila(int tamano) {
        idx = 0;
        data = new String[tamano];
    }

    public void push(String c) {        
        data[idx] = c;
        System.out.println(" Se ingresó ");
        idx++;
    }

    public String pop() {
        //Requiere: la pila no esté vacía
        idx--;
        System.out.println(" Se retiró ");
        return data[idx];
    }

    public boolean full() {
        return idx == data.length;
    }

    public boolean empty() {
        return idx == 0;
    }
}

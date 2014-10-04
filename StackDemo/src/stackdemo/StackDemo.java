package stackdemo;

import java.util.*;
import javax.swing.JOptionPane;

public class StackDemo {

    public static void main(String[] args) {
        Stack st = new Stack();

        int valasz, valasz2;
        String kerdes, kerdes2;

        kerdes = JOptionPane.showInputDialog("Hány elemet akar a stackbe?");
        valasz = Integer.parseInt(kerdes);

        for (int i = 1; i < valasz + 1; i++) {
            kerdes2 = JOptionPane.showInputDialog("Mi legyen az " + i + ". elem a stackben?");
            valasz2 = Integer.parseInt(kerdes2);
            st.add(valasz2);
        }
        System.out.println("Stack: " + st);
        System.out.println();

        System.out.println("Legutolsó kidob: " + st.pop());
        System.out.println("Stack kidobás után fordítva: " + st);
    }
}


/*
ha nem lenne beépített stack valahogy így néznéne ki:
   private int maxSize;
   private long[] stackArray;
   private int top;

   public MyStack(int s) {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }

    public void push(long j) {
       stackArray[++top] = j;
    }
    public long pop() {
       return stackArray[top--];
    }
    public long peek() {
       return stackArray[top];
    }

*/

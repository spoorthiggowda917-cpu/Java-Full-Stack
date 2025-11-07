package com.tnsif.collection;

import java.util.ArrayList;
import java.util.List;
import com.tnsif.scanner.School;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Static binding
        ArrayList<Object> a1 = new ArrayList<Object>();
        a1.add(10);
        a1.add(new School());
        a1.add(22.22f);
        a1.add("Gayathri");
        System.out.println(a1);

        a1.remove(1);
        System.out.println(a1);

        a1.add(1, 100);
        System.out.println(a1);

        // Dynamic Binding
        List<Object> l = new ArrayList<Object>();
        l.addAll(a1);
        System.out.println(l);
/*Here, List is an interface in Java.
 ArrayList is a class that implements the List interface.
 ➡️ So we are creating an ArrayList object, but referencing it using the List interface.
 ✅ This is called Dynamic Binding (or Runtime Polymorphism) —
 the object type (ArrayList) is decided at runtime,
 but the reference type (List) is known at compile time.*/
        // By using Generics
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(100);
        System.out.println(l1);
    }
}
/*Dynamic Binding (List<Object>)
→ Java doesn’t know what kind of data you’ll put.
→ You can mix integers, strings, floats, etc.

Generics (List<Integer>)
→ Java knows the list is only for integers.
→ You can’t add anything else (like strings).*/

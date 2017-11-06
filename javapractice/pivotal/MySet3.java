/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.pivotal;

/**
 *
 * @author Ankit Mohla
 */
import java.util.Arrays;

public final class MySet3
{

    private int[] set;
    private int size;
    private int capacity;

    public MySet3(int c)
    {
        capacity = c;
        set = new int[capacity];
        size = 0;
    }

    public boolean contains(int value) {
        for(int setItem : set) {
            if(setItem == value) {
                return true;
            }
         }
         return false;
    }

    public void add(int x) {
        if (contains(x))
            return;
        if (size >= capacity) {
            capacity *= 2;
            set = Arrays.copyOf(set, capacity);
        }
        set[size++] = x;
    }

    public boolean remove(int x)
    {
        boolean remove = false;
        for(int i = 0; i < capacity; i++)
        {
            if(x == set[i])
            {
                set[i] = set[size -1];
                size--;
                remove =  true;
            }
            if(isEmpty())
            {
               remove =  false;
            }
        }
        return remove;
    }

    public void clear()
    {
        set = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int[] toArray()
    {
        return Arrays.copyOf(set, capacity);
    }
}
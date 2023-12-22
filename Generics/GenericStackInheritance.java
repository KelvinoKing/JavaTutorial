/**
 * (Implement GenericStack using inheritance) In Listing 19.1, GenericStack is
 * implemented using composition. Define a new stack class that extends ArrayList
 */

import java.util.ArrayList;
public class GenericStackInheritance<E> extends ArrayList<E>{
    
    public int getSize(){
        return size();
    }

    public E peek(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        return (get(getSize() - 1));
    }

    public void push(E o){
        add(o);
    }

    public E pop(){
        if(isEmpty()){
            throw new java.util.EmptyStackException();
        }

        E o = get(getSize() - 1);
        remove(get(getSize() - 1));
        return o;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
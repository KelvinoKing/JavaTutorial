import java.util.ArrayList;

public class ArrayListGenericStack<E>{

    ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        return (list.get(getSize() - 1));
    }

    public E pop(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        E o = list.get(getSize() - 1);
        list.remove(list.get(getSize() - 1));
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return list.toString();
    }
}
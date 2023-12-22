public class GenericStack<E> {
   private static final int DEFAULTCAPACITY = 10;
   private Object[] list; 
   private int size = 0;

   public GenericStack(){
    list = new Object[DEFAULTCAPACITY];
    size = 0;
   }

    public int getSize(){
        return size;
    }
    @SuppressWarnings("unchecked")
    public E peek(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }

        return (E) list[size - 1];
    }
    public void push(E o){
        ensureCapacity();
        list[size++] = o;
    }
    @SuppressWarnings("unchecked")
    public E pop(){
        if (isEmpty()){
            throw new java.util.EmptyStackException();
        }
        E o = (E) list[--size];
        list[size] = null;
        return o;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void ensureCapacity(){
        if (size == list.length){
            int newCapacity = list.length * 2;
            list = java.util.Arrays.copyOf(list, newCapacity);
        }
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("Stack: ");
        for (int i = 0; i <  size; i++){
            result.append(list[i]).append(" ");
        }
        return result.toString();
    }
}
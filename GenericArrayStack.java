public class GenericArrayStack<E> implements Stack<E> {
   
    private E[] elems; 
    private int top;
    @SuppressWarnings( "unchecked" )

   // Constructor
    public GenericArrayStack( int capacity ) {
        
    // ADD YOU CODE HERE
        elems = (E[]) new Object[ capacity ];
        top = 0;
    }

    // Returns true if this ArrayStack is empty
    public boolean isEmpty() {
         
        return top == 0;


    }

    public void push( E elem ) {
        
        elems[ top ] = elem;
        top++;

    }
    public E pop() {
        
        E saved;

        top--;
        saved = elems[ top ];
        elems[ top ] = null;

        return saved;

    }

    public E peek() {
       
        return elems[top-1];

    }
}

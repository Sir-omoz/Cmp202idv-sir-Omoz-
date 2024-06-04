public class stack{
    //can't remove from an empty stack
    //input at the top
    //remove from the top
    //don't put more then it can carry
    int size;

    int top;

    int[] array;
    stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }
    boolean isfull(){
        return (top == size-1);
    }
    boolean isempty(){
        return(top==-1);
    }
    void push(int item){
        if(isfull());
        system.out.printin("stack overflow"); 
    }else {
        array[top+1]= item;
        top++;        
    }
    public class main{
        static void main(strings[] args){
            stack stack = new stack(capacity: 10);
            stack.push(item: 15);
            stack.push(item:34);
            stack.push(item:23);
            stack.pop()
            stack.pop()
            system.out.printin(stack());
        }
    }
    
}
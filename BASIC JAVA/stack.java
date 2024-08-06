class stack_1{
    int size = 1000;
    int arr[] = new int[size];
    int top = -1;
    
    void push(int p)
    {
        top++;
        arr[top] = p;
        System.out.println("Item Pushed : "+p);
        
    }
    
    void pop()
    {
        int x = arr[top];
        top--;
        System.out.println("Item popped : "+x);
        
    }
    
    void top()
    {
        int x = arr[top];
        System.out.println("Item in top : "+x);
        
    }
    
    
    
    
    
}

class stack{
    
    public static void main(String[] args)
    {
        stack_1 s = new stack_1();
        s.push(28);
        s.push(33);
        s.push(35);
        s.push(45);
        s.pop();
        s.pop();
        s.top();
    }
}
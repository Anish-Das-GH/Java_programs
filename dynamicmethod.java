
class Apple 
{ 
    void display() 
    { 
        System.out.println("Inside Apple's display method"); 
    } 
} 
  
class Banana extends Apple 
{ 
    void display()   
    { 
        System.out.println("Inside Banana's display method"); 
    } 
} 
  
class Cherry extends Apple 
{ 
    void display()   
    { 
        System.out.println("Inside Cherry's display method"); 
    } 
} 
  
class dynamicmethod
{ 
    public static void main(String args[]) 
    {  
        Apple a  = new Apple();   
        Banana b = new Banana(); 
        Cherry c = new Cherry();  
  
        Apple ref;    
           
        ref = a;   
        ref.display();   
        
        ref = b;   
        ref.display();  
  
        ref = c; 
        ref.display();  
    } 
} 
class Methods
{
    Methods()    //constructor method
    {
        System.out.println("Construction Methods is called");
    }
    public static void main(String[ ]args)             //main method 
    {
     staticMethod();
     Method obj = new Methods();
     obj.nonStaticMethod();
    }
    static void staticMethod()                       //static method
    {
        System.out.println("Static method can be called");
    }
    nonStaticMethod()
    {
        
    }
}
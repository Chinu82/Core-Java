class Test {
    static int a = 10;  //static variable
    int b = 20;         //non static variable
    void same(){
        System.out.println("with same class : ");

        Test te = new Test();   //Object creation
        //static
        System.out.println("static = "+a);     //directly (we have to declare)
        System.out.println("static = "+Test.a);     //class name(we have to declare)
        System.out.println("static = "+te.a);   //object name

        //non static
        System.out.println("static = "+b);     //directly (It is because of same area (non static method))
        //System.out.println("non static = "+Test.b);     //error
        System.out.println("non static = "+te.b);   //object name
    }
}
class Demo
{
    public static void main(String[] args) {
        Test te = new Test();   //Object creation

        te.same();
        System.out.println("with different class : ");
        //static
        System.out.println("static = "+Test.a);     //class name(we have to declare)
        System.out.println("static = "+te.a);   //object name
        //non-static
        //System.out.println("non static = "+Test.b);     //class name
        System.out.println("non static = "+te.b);   //object name   (we have to declare)
    }
}
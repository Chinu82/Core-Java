class Test {
    void m1(int x){
        int a = 10;
        int b;
        // System.out.println(Test.a);
        // System.out.println(Test.b);  //Error
        Test t = new Test();
        // System.out.println(t.a); // Error
        System.out.println(a);
        // System.out.println(b); //variable be might not have been initialised
    }
    Test()
    {
        int b = 20;
        //System.out.println(a);//error
        System.out.println(b);
    }
    static
    {
        int c = 30;
        System.out.println(c);
    }
    void varLogic(int x){
        int y = 10;
        int z;
        x= 111;
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);  //Error Variable might not have initialised
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1(0);
        t.varLogic(102);

    }
}

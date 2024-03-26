class Test {
    public static void main(String[] args) {
        int a = 10;             //primitive type
        System.out.println(a);  //10

        //Boxing or, Wrapping
        Integer b = new Integer(a);
        System.out.println(b);
        //Unboxing or, Un Wrapping
        int c = b.intValue();
        System.out.println(c);
        //Auto Boxing
        Integer d = c;
        System.out.println(d);
        //Auto Unboxing
        int e = d;
        System.out.println(e);
    }
}

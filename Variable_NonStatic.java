class Nonstatic {
    String name;
    int x =200;
    int y; 
    double manas;
    void m1(){
        System.out.println(x);
        Nonstatic ns = new Nonstatic();
        System.out.println(ns.x);
        System.out.println(name);
        System.out.println(y);
        System.out.println(manas);

    }
    public static void main(String[] args) {
        // System.out.println(x);   //Error
        Nonstatic ns = new Nonstatic();
        ns.m1();
    }
}

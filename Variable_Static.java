class Static {
    static String name;
    static int x =200;
    static int y; 
    static double manas;
    void m1(){
        System.out.println(x);
        System.out.println(Static.x);
        Static ns = new Static();
        System.out.println(ns.x);
        System.out.println(Static.name);
        System.out.println(ns.y);
        System.out.println(manas);

    }
    public static void main(String[] args) {
        // System.out.println(x);   //Error
        Static ns = new Static();
        ns.m1();
    }
}

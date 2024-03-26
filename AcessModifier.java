// From 12 modifiers 4 modifiers are known as AccessModifiers in Java
/*
    public
    protected
    default
    private
 */
class AccessModifiers{
    public static int a = 10;
    protected static int b = 20;
    static int c = 30;          //Default modifiers
    private int d = 40;
    public static void main(String[] args) {
        System.out.println("Access Modifiers in Java : "+AccessModifiers.a);
        System.out.println("variable of public modifiers int java : "+AccessModifiers.b);
        System.out.println("variable of protected modifiers int java : "+AccessModifiers.c);
//      System.out.println("variable of default modifiers int java : "+AccessModifiers.d);
    }
}

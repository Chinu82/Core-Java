class DefaultValue{
    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;
}
public class DataType{
    public static void main(String[] args) {
        //Default value :
        System.out.println("Default value of variable Byte type"+DefaultValue.a);
        System.out.println("Default value of variable of Short Type = "+DefaultValue.b);
        System.out.println("Default value of variable of Int Type = "+DefaultValue.c);
        System.out.println("Default value of variable of Long Type = "+DefaultValue.d);
        System.out.println("Default value of variable of Float Type = "+DefaultValue.e);
        System.out.println("Default value of variable of Double Type = "+DefaultValue.f);
        System.out.println("Default value of variable of Char Type = "+DefaultValue.g+"signle character with null");
        System.out.println("Default value of variable of Boolean Type = "+DefaultValue.h);

        // Range of all variable
        System.out.println("Range of value of variable Byte type from : "+Byte.MAX_VALUE+" to "+Byte.MIN_VALUE);
        System.out.println("Range of value of variable Short type from : "+Short.MAX_VALUE+" to "+Short.MIN_VALUE);
        System.out.println("Range of value of variable Integer type from : "+Integer.MAX_VALUE+" to "+Integer.MIN_VALUE);
        System.out.println("Range of value of variable Long type from : "+Long.MAX_VALUE+" to "+Long.MIN_VALUE);
        System.out.println("Range of value of variable Float type from : "+Float.MAX_VALUE+" to "+Float.MIN_VALUE);
        System.out.println("Range of value of variable Double type from : "+Double.MAX_VALUE+" to "+Double.MIN_VALUE);
        System.out.println("Range of value of variable Character type from : "+Character.MAX_VALUE+" to "+Character.MIN_VALUE);
//      System.out.println("Range of value of variable Boolean type from : "+Boolean.MAX_VALUE+" to "+Boolean.MIN_VALUE);

        //size of variable
        System.out.println("Size of value of variable Byte type from : "+Byte.SIZE+" Bites");
        System.out.println("Size of value of variable Short type from : "+Short.SIZE+" Bites");
        System.out.println("Size of value of variable Integer type from : "+Integer.SIZE+" Bites");
        System.out.println("Size of value of variable Long type from : "+Long.SIZE+" Bites");
        System.out.println("Size of value of variable Float type from : "+Float.SIZE+" Bites");
        System.out.println("Size of value of variable Double type from : "+Double.SIZE+" Bites");
        System.out.println("Size of value of variable Character type from : "+Character.SIZE+" Bites");
        // System.out.println("Size of value of variable Boolean type from : "+Boolean.SIZE+" Bites");Decided by jvm
    }
}
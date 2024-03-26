import java.util.Scanner;

class IncrementDecrement {
    int m = 10;
    int n;
    void increment()
    {
        System.out.println("Increment Operator method");
        m++;
        System.out.println("m = "+m);
        ++m;
        System.out.println("m = "+m);
        n = m++;
        System.out.println("m = "+m+"n = "+n);
        n = ++m;
        System.out.println("m = "+m+"n = "+n);
    }
    void decrement()
    {
        System.out.println("Decrement Operator method");
        m--;
        System.out.println("m = "+m);
        --m;
        System.out.println("m = "+m);
        n = m--;
        System.out.println("m = "+m+"n = "+n);
        n = --m;
        System.out.println("m = "+m+"n = "+n);
    }
    void combination()
    {
        n = m++ + ++m - ++m - m++ - --m - m--;
        System.out.println("m = "+m+" n = "+n);
    }
}
class Arithmatic{

}
class StringConcatanation{

}
class Relational{

}
class Equality{

}
class InstanceOf{

}
class Operator{
    public static void main(String[] args) {
        System.out.println("Operation Loading ... ");

        //User Input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("\n1 for Increment Operator");
        System.out.println("\n2 for Arithmatic Operator");
        System.out.println("\n3 for String Concatatnation Operator");
        System.out.println("\n4 for Relational Operator");
        System.out.println("\n5 for Equality Operator");
        System.out.println("\n6 for Instance Of Operator");
        if (num==1) {
            IncrementDecrement id = new IncrementDecrement();
            id.increment();
            id.decrement();
            id.combination();
        }
        else
        if (num == 2) {
            Arithmatic ar = new Arithmatic();
        }
    }
}
//Take user input during running
class CommandLine{
    public static void main(String[] x) {
        System.out.println("Wel-Come TO : "+x[0]+" Website");
        int n1 = Integer.parseInt(x[1]);
        int n2 = Integer.parseInt(x[2]);
        System.out.println("Your numbers = "+n1+" "+n2);
        System.out.println("Sum are = "+(n1+n2));
    }
}

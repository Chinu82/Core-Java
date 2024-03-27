class StudentRole {
    String king;
    String queen;
    String villion;
    private StudentRole(){
        System.out.println("I am Student Role Constructor.");
    }
    static StudentRole callStudentRole(){
        StudentRole sr = new StudentRole();
        return sr;
    }
}
class Student{
    public static void main(String[] args) {
        System.out.println("Factory method is processing ");
        StudentRole sroll = StudentRole.callStudentRole();
        sroll.king = "Anup";
        sroll.queen = "Anupi";
        sroll.villion = "Anupiani";
        System.out.println("The Rolls of Students are :- ");
        System.out.println("King role : "+sroll.king);
        System.out.println("Queen role : "+sroll.queen);
        System.out.println("Villian role : "+sroll.villion);
    }
}
package HW18;

public class TeacherTester {
    public static void main(String[] args) {

        ChemistryTeacher chemistry=new ChemistryTeacher();
        chemistry.name="Meghan";
        chemistry.age=40;
        chemistry.strict=true;
        chemistry.polite();
        chemistry.introduce();


        PianoTeacher piano=new PianoTeacher();
        piano.name="Chelsea";
        piano.age=35;
        piano.strict=false;
        piano.teach();
        piano.introduce();

        MathTeacher math=new MathTeacher();
        math.name="Anthony";
        math.age=45;
        math.strict=true;
        math.friendly();
        math.introduce();
    }
}

public class Course {
    Teacher teacher;
    String  name;
    String code;
    String prefix;
    int note;
    int sozluNotu;


    Course(String name, String code, String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=0;
        this.sozluNotu=0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacher();
        }
        else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }


}

public class Student {
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulExamNote(int note1,int note2, int note3) {
        if (note1>=0 && note1<=100){
            this.course1.note=note1;
        }
        if (note2>=0 && note2<=100){
            this.course2.note=note2;
        }
        if (note3>=0 && note3<=100){
            this.course3.note=note3;
        }


    }

    void sozluNotuGir(int sozlunotu1,int sozlunotu2,int sozlunotu3){
        if(sozlunotu1>=0 && sozlunotu1<=100){
            this.course1.sozluNotu=sozlunotu1;
        }
        if(sozlunotu2>=0 && sozlunotu2<=100){
            this.course2.sozluNotu=sozlunotu2;
        }
        if(sozlunotu3>=0 && sozlunotu3<=100){
            this.course3.sozluNotu=sozlunotu3;
        }
    }

    void isPass() {
        printNote();
        this.avarage=((this.course1.note*0.80)+(this.course1.sozluNotu*0.20)+(this.course2.note*0.80)+(this.course2.sozluNotu*0.20)+(this.course3.note*0.80)+(this.course3.sozluNotu*0.20))/3.0;
        System.out.println("Ortalama:"+this.avarage);
        if (this.avarage>=55){
            System.out.println("Sınıfı geçti");
        }
        else{
            System.out.println("Sınıfta kaldı");
        }
        System.out.println("==============");

    }

    void printNote() {
        System.out.println(this.course1.name+" notu:"+((this.course1.note*0.80)+(this.course1.sozluNotu*0.20)));
        System.out.println(this.course2.name+" notu:"+((this.course2.note*0.80)+(this.course2.sozluNotu*0.20)));
        System.out.println(this.course3.name+" notu:"+((this.course3.note*0.80)+(this.course3.sozluNotu*0.20)));
    }


}

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name=name;
        this.stuNo=stuNo;
        this.avarage=0.0;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.isPass=false;

    }
    void addBulkExamNote(int note1, int note2,int note3, int sNote1, int sNote2, int sNote3){
        if (note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if (note2>=0 && note2<=100){
            this.c2.note=note2;
        }
        if (note3>=0 && note3<=100){
            this.c3.note=note3;
        }
        if (sNote1>=0 && sNote1<=100){
            this.c1.sNote=note1;
        }
        if (sNote2>=0 && sNote2<=100){
            this.c2.sNote=note2;
        }
        if (sNote3>=0 && sNote3<=100){
            this.c3.sNote=note3;
        }

    }

    void isPass(){
        System.out.println("=====================");
        this.avarage = ((this.c1.note*0.8+this.c1.sNote*0.2 )+(this.c2.note*0.8+this.c2.sNote*0.2) + (this.c3.note*0.8+this.c3.sNote*0.2))/3.0;
        if (this.avarage>55){
        System.out.println("Sınıfı geçtiniz .");
        }else {
            System.out.println("Sınıfta Kaldınız  .");
        }
        printNote();
    }
    void printNote(){
        System.out.println(c1.name + "Notu: " + c1.note+"\nSözlü Notu :"+this.c1.sNote);
        System.out.println(c2.name + "Notu: " + c2.note+"\nSözlü Notu :"+this.c2.sNote);
        System.out.println(c3.name + "Notu: " + c3.note+"\nSözlü Notu :"+this.c3.sNote);
        System.out.println("Ortalamanız :"+this.avarage);
    }
}

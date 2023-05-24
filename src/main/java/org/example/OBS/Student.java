package org.example.OBS;

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
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3,int sozlu1,int sozlu2, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) this.course1.note = note1;
        if (note2 >= 0 && note2 <= 100) this.course2.note = note2;
        if (note3 >= 0 && note3 <= 100) this.course3.note = note3;
        if (sozlu1 >= 0 && sozlu1 <= 100) this.course1.sozlu = sozlu1;
        if (sozlu2 >= 0 && sozlu2 <= 100) this.course2.sozlu = sozlu2;
        if (sozlu3 >= 0 && sozlu3 <= 100) this.course3.sozlu = sozlu3;

    }

    void printNote(){

        System.out.println(this.course1.name+" Notu:"+this.course1.note);
        System.out.println(this.course2.name+" Notu:"+this.course2.note);
        System.out.println(this.course3.name+" Notu:"+this.course3.note);
        System.out.println(this.course1.name+" Sözlü Notu:"+this.course1.sozlu);
        System.out.println(this.course2.name+" Sözlü Notu:"+this.course2.sozlu);
        System.out.println(this.course3.name+" Sözlü Notu:"+this.course3.sozlu);
        System.out.println("Ortalamanız: "+this.avarage);
    }

    void isPass(){
        System.out.println("============================================");
        this.avarage=(0.8*this.course1.note+0.2*this.course1.sozlu+0.8*this.course2.note+0.2*this.course2.sozlu+0.8*this.course3.note+0.2*this.course3.sozlu)/3.0;
        if (this.avarage>55){
            System.out.println("Sınıfı Başarılı Şekilde Geçtiniz :))))");
            this.isPass=true;
        }else {
            System.out.println("Sınıfta Kaldınız :(((((");
            this.isPass=false;
        }
        printNote();
    }

}

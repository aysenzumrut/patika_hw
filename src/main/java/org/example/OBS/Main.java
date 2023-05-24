package org.example.OBS;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Betül","TRH","555");
        Teacher t2=new Teacher("Yağmur","BYLJ","333");
        Teacher t3=new Teacher("Emin","FZK","222");

        Course tarih=new Course("Tarih","101","TRH",t1);
        Course biyoloji=new Course("Biyoloji","101","BYLJ",t2);
        Course fizik=new Course("Fizik","101","FZK",t3);

        //tarih.printTeacher();
        tarih.addTeacher(t1);
        biyoloji.addTeacher(t2);


        Student s1=new Student("Ayşen Sönmez","123","4",tarih,fizik,biyoloji);
        Student s2=new Student("Alp Koray","124","4",tarih,fizik,biyoloji);



        s2.addBulkExamNote(30,75,80,55,60,45);
        s2.isPass();

        s1.addBulkExamNote(10,20,30,70,40,30);
        s2.isPass();


    }
}

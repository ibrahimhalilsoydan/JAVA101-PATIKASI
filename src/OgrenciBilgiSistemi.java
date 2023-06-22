public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1= new Teacher("İbrahim soydan", "11", "FLSF");
        Teacher t2= new Teacher("Merve yıldız","22","FZK");
        Teacher t3= new Teacher("Ali katar","33","KIM");



        Course felsefe= new Course("Felsefe","101","FLSF");
        felsefe.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course kimya= new Course("Kimya", "103","KIM");
        kimya.addTeacher(t3);



        Student s1= new Student("fatma kara","123","12b",fizik,kimya,felsefe);
        s1.addBulkExamNote(100,80,60,80,60,70);
        //s1.printNote();
        s1.isPass();

        Student s2 = new Student("Ayşe dal","222","12a",fizik,kimya,felsefe);
        s2.addBulkExamNote(55,65,90,60,90,70);
        s2.isPass();
    }
}
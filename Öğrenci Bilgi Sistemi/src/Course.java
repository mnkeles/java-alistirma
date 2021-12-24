public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNotu=0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
    public void katsayilar(String name){
        if(name=="Matematik")
         System.out.println("Matematik Katsayıları--> Sınav=0.3,Sözlü=0.7");
        else if(name =="Fizik")
        System.out.println("Fizik Katsayıları--> Sınav=0.6,Sözlü=0.4");
        else if(name =="Kimya") {
            System.out.println("Kimya Katsayıları--> Sınav=0.5,Sözlü=0.5");
            System.out.println("=========================");
        }

    }
}
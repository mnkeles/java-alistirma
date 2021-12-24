public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    public void sozluNotu(int matSozlu,int fizikSozlu,int kimyaSozlu){
        if (matSozlu >= 0 && matSozlu <= 100) {
            this.mat.sozluNotu = matSozlu;
        }

        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            this.fizik.sozluNotu = fizikSozlu;
        }

        if (kimyaSozlu >= 0 && kimyaSozlu <= 100) {
            this.kimya.sozluNotu = kimyaSozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        }
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }


    public void calcAvarage() {
        this.avarage = (((this.fizik.note*0.6)+(this.fizik.sozluNotu*0.4)) + ((this.kimya.note*0.5)+(this.kimya.sozluNotu*0.5))
                + ((this.mat.note*0.3)+(this.mat.sozluNotu*0.7))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu :"+this.mat.sozluNotu);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu :"+this.fizik.sozluNotu);
        System.out.println("Kimya Sınav Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu :"+this.kimya.sozluNotu);

    }
    public void katsayi(String name){
        System.out.println("Matematik Katsayıları--> Sınav=0.3,Sözlü=0.7");
        System.out.println("Fizik Katsayıları--> Sınav=0.6,Sözlü=0.4");
        System.out.println("Kimya Katsayıları--> Sınav=0.5,Sözlü=0.5");
        System.out.println("=========================");

    }

}

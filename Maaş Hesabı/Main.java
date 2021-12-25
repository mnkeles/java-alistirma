public class Main {
    public static void main(String[] args){
        Employee p1=new Employee("P1",2000,45,1985);
        System.out.println("Tax-->"+p1.tax());
        System.out.println("Bonus-->"+p1.bonus());
        System.out.println("Raise Salary-->"+p1.raiseSalary());
        System.out.println("Toplam Maaş-->"+(+p1.raiseSalary()+ p1.salary));

    }
}

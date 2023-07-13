package Odev04;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        if(hireYear >= 1985 && hireYear <= 2021)
            this.hireYear = hireYear;
        else
            this.hireYear = 2021;
    }

    public double tax(){
        double tax;
        if(this.salary >= 1000){
            tax = this.salary * 0.03;
            return tax;
        }else{
            return 0;
        }
    }

    public double bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }

        return 0;
    }

    public double raiseSalary(){
        int yearWorked = 2021 - this.hireYear;
        double increment;
        if(yearWorked < 9){
            increment = this.salary * 0.05;
            return increment;
        }else if(yearWorked > 9 && yearWorked < 20){
            increment = this.salary * 0.10;
            return increment;
        }else{
            increment = this.salary * 0.15;
            return increment;
        }
    }

    public void print(){
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary();
        double salaryBT = this.salary + bonus - tax;
        double total = this.salary + raiseSalary;

        System.out.println(
                "Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi: " + tax + "\n" +
                "Bonus: " + bonus + "\n" +
                "Maaş Artışı: " + raiseSalary + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + salaryBT + "\n" +
                "Toplam Maaş: " + total
        );
    }

    
}

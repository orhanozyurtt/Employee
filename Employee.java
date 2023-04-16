public class Employee {
    String name;//çalışan adı
    double salary; // çalışanın maaşı
    double workHours; // haftalık çalışma saati
    int hireYear; //işe başlama yılı
    double rawSalary;

    Employee(String name, double salary , double workHours , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void pritWorker(){
        System.out.println("isim \t: " + this.name);
        System.out.println("maaş \t: " + this.salary);
        System.out.println("haftalık çalışma saati \t: " + this.workHours);
        System.out.println("İşe başlangıç yılı  \t: " + this.hireYear);

    }

    void run(){
        tax();
        bonus();
        raiseSalary();
        pritWorker();

    }

    void tax(){
        double vergi;
        if(this.salary <= 1000){
            vergi = 0;
            System.out.println( " vergi : " + vergi);
        } else if (this.salary > 1000) {
            vergi = (this.salary * 3 ) / 100 ;
            this.salary -= vergi;
            System.out.println( "vergi : " + vergi);
        }
    }
    void bonus(){
        int saat = 0,plus;
        if(this.workHours > 40){
            saat += (this.workHours -40);
            if(saat >0){
                plus = (saat * 30);
                this.salary += plus;
            }

        }
    }

    void raiseSalary(){
        int yearNow = 2021,total=0;

        this.rawSalary = this.salary;
        if(yearNow < this.hireYear){
            total = this.hireYear - yearNow;
           // System.out.println("çalışma süresi : " + total);
        }else {
            total = yearNow - this.hireYear;
            //System.out.println("çalışma süresi : "+ total);
        }

        if(total < 10){
            this.salary = (salary * 5)/100 + salary;
          //  System.out.println("zam"+this.salary);

        } else if (total >= 9 && total <20  ) {
            this.salary = (salary * 10) / 100 +salary;
          //  System.out.println("zam"+this.salary);
        } else if (total>19) {

            this.salary = (salary * 15) / 100 + salary;
            //System.out.println("zam : "+this.salary);

        }
    }


}

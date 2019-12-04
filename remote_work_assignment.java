// 1. Answers to Self-Check Questions

// BJP4 Self-Check 9.3: subclassSyntax
//
// Which of the following is the correct syntax to indicate that class A is a subclass of B?
//
// public class A extends B {


// BJP4 Self-Check 9.10: inheritanceVariableSyntax
//
// Which of the following are legal statements?
//
// Vehicle v = new SUV();
// Car c = new SUV();
// Vehicle v = new Car();
// SUV s = new SUV();

// BJP4 Self-Check 9.8: CarTruck
//
// Consider the following two classes [..] What is the output from the following statements?
// 
// System.out.println(mycar);          vroom
// mycar.m1();                         car 1
// mycar.m2();                         car 2
// System.out.println(mytruck);        vroom
// mytruck.m1();                       truck 1
// mytruck.m2();                       car 2


// 2. Solutions to Exercises

// BJP4 Exercise 8.11: transactionFeeBankAccount

public boolean transactionFee(double fee) {
        
    double totalFee = fee * this.transactions * (this.transactions + 1) / 2;

    if (this.balance > totalFee) {
        this.balance -= totalFee;
        return true;
    }
    
    balance = 0;
    return false;
}

// BJP4 Exercise 9.3: HarvardLawyer

public class HarvardLawyer extends Lawyer {
    
    public double getSalary() {
        return super.getSalary() * 1.2;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm() {

        String formname = super.getVacationForm();
        String forms = "";
        int i;
        
        for (i = 0; i < 4; i++) {
            forms += formname;
        }
        
        return forms;
    }
}

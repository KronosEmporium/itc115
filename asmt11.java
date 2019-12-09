//*******************************************************************
//
//  Assignment 11
//
// Creates two classes, Janitor and HarvardLawyer which extend the
// pre-existing classes Employee and Lawyer respectively. Janitors
// get half the hours and vacation days and $10K less in salary and
// have the unique function clean(), Harvard Lawyers receive 20% more
// salary, 3 extra vacation days, and must fill out four pink forms
// to apply for vacation. EmployeeMain5 class tests these classes.
//
// By: Crosby Allison
// Date: 11/07/2019
//*******************************************************************

class Janitor extends Employee {
    
    public int getHours() {
        return super.getHours() * 2;
    }
    
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
    
    public void clean() {
        System.out.println("Workin' for the man.");
    }
}

class HarvardLawyer extends Lawyer {
    
    public double getSalary() {
        return super.getSalary() * 1.2;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm() {

        String formname = super.getVacationForm();
        String forms = "";
        int i;
        
        for (i = 0; i < 4; i++) {
            forms += formname;
        }
        
        return forms;
    }
}

public class EmployeeMain5 {
    
    public static void main (String[] args) {
        
        System.out.println("Janitor:");
        Janitor employee5 = new Janitor();
        employee5.applyForVacation();
        employee5.getHours();
        employee5.getSalary();
        employee5.getVacationDays();
        employee5.clean();
        
        System.out.println();

        System.out.println("Harvard Lawyer:");
        HarvardLawyer employee6 = new HarvardLawyer();
        employee6.applyForVacation();
        employee6.getHours();
        employee6.getSalary();
        employee6.getVacationDays();
        employee6.sue();
    }
}

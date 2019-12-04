//*******************************************************************
//
//  Assignment 10
//
// Creates a base class of Ticket which has methods and variables
// inherited by several ticket types. 
//
//By: Crosby Allison
//Date: 11/07/2019
//*******************************************************************

class Ticket {
    
    // Initialize Ticket class private variables
    private int ticketId;
    private double ticketPrice;
    
    // Getters and setters for Ticket
    public int getTicketId() {
        return this.ticketId;
    }
    
    public void setTicketId(int newId) {
        this.ticketId = newId;
    }
    
    public double getTicketPrice() {
        return this.ticketPrice;
    }
    
    public void setTicketPrice(double newPrice) {
        this.ticketPrice = newPrice;
    }
    
    // Print newline of Ticket member's variables
    public String printTicketInfo() {
        return String.format("Number: %d, Price: %.2f", this.getTicketId(), this.getTicketPrice() );
    }
}

// Class for walk-up tickets
class WalkUpTicket extends Ticket {
    
    public double getTicketPrice() {
        return 50.0;
    }
}

// Class for tickets bought in advance
class AdvanceTicket extends Ticket {
    
    // New variable set at instantiation to check amount of days purchased in advance
    private double ticketPrice;
    private int daysInAdvance;
    
    // If purchased 10 or more days ago, $30, otherwise $40
    public double getTicketPrice() {
        return (this.daysInAdvance > 9) ? 30.0 : 40.0;
    }
    
    // Getters and setters for daysInAdvance
    public int getDaysInAdvance() {
        return this.daysInAdvance;
    }
    
    public void setDaysInAdvance(int days) {
        this.daysInAdvance = days;
    }
}

class StudentAdvanceTicket extends AdvanceTicket {
    
    // Same amount of time as normal advance tickets, but students' tickets are 50% less expensive
    public double getTicketPrice() {
        return super.getTicketPrice() / 2;
    }
    
    // Concatenate ID reminder to students' ticket info
    public String printTicketInfo() {
        return super.printTicketInfo() + " (ID required)";
    }
}

// Test class
public class Test {
    
    public static void main (String[] args) {
        
        // Example walkup ticket
        WalkUpTicket wut = new WalkUpTicket();
        wut.setTicketId(1);
        System.out.println( wut.printTicketInfo() );
        
        // Example advance ticket
        AdvanceTicket at = new AdvanceTicket();
        at.setTicketId(2);
        at.setDaysInAdvance(11);
        System.out.println( at.printTicketInfo() );
        
        // Example student advance ticket
        StudentAdvanceTicket sat = new StudentAdvanceTicket();
        sat.setTicketId(3);
        sat.setDaysInAdvance(3);
        System.out.println( sat.printTicketInfo() );
    }
}

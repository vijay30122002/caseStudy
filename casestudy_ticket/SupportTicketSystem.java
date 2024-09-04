package com.evergent.corejava.casestudy_ticket;


import java.util.ArrayDeque;
import java.util.Scanner;
public class SupportTicketSystem {
    ArrayDeque<String> ticketQueue = new ArrayDeque<>();
    // Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }
    // Method to process (remove) the next ticket in the queue
    public void processNextTicket() {
        if (!ticketQueue.isEmpty()) {
            String ticket = ticketQueue.poll(); // Remove and get the head of the queue
            System.out.println("Processed ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }
    // Method to peek at the next ticket without removing it
    public void peekNextTicket() {
        if (!ticketQueue.isEmpty()) {
            String ticket = ticketQueue.peek(); // Get the head of the queue without removing it
            System.out.println("Next ticket to process: " + ticket);
        } else {
            System.out.println("No tickets to peek at.");
        }
    }
    // Method to display all tickets in the queue
    public void displayQueue() {
        System.out.println("Current ticket queue: " + ticketQueue);
    }
    // Main method for user interaction
    public static void main(String[] args) {
        SupportTicketSystem system = new SupportTicketSystem();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nSupport Ticket System Menu:");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Peek Next Ticket");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Please choose an option (1-5): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()
            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String ticket = sc.nextLine(); // Read the ticket description from user input
                    system.addTicket(ticket);
                    break;
                case 2:
                    system.processNextTicket();
                    break;
                case 3:
                    system.peekNextTicket();
                    break;
                case 4:
                    system.displayQueue();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 5.");
            }
        }
    }
}

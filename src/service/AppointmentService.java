package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {

        // 3 normal appointments
        appointments.add("Consultation - Math");
        appointments.add("Consultation - Physics");
        appointments.add("Consultation - Programming");

        // urgent at beginning
        appointments.addFirst("URGENT: Scholarship Issue");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            String removed = appointments.removeLast();
            System.out.println("Cancelled: " + removed);
        } else {
            System.out.println("No appointments to cancel.");
        }
    }

    public void showFirstAndLast() {
        if (!appointments.isEmpty()) {
            System.out.println("First appointment: " + appointments.getFirst());
            System.out.println("Last appointment: " + appointments.getLast());
        } else {
            System.out.println("No appointments available.");
        }
    }

    public void printAppointments() {
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {

        issues.add(new Issue("Exam Conflict", 2));
        issues.add(new Issue("Lost Documents", 3));
        issues.add(new Issue("Academic Probation", 1));
        issues.add(new Issue("Course Registration Error", 4));
        issues.add(new Issue("Scholarship Suspension", 2));
    }

    public void showMostUrgent() {

        if (!issues.isEmpty()) {
            System.out.println("Most Urgent Issue: " + issues.peek());
        } else {
            System.out.println("No issues available.");
        }
    }

    public void resolveIssues() {

        if (!issues.isEmpty()) {
            System.out.println("Resolved: " + issues.poll());
        }

        if (!issues.isEmpty()) {
            System.out.println("Resolved: " + issues.poll());
        }
    }

    public void printRemainingIssues() {

        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
    }
}
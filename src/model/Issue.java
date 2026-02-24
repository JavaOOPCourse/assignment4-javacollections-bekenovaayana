package model;

public class Issue implements Comparable<Issue> {

    // fields
    private String description;
    private int urgencyLevel; // 1 = most urgent

    // constructor
    public Issue(String description, int urgencyLevel) {
        this.description = description;
        this.urgencyLevel = urgencyLevel;
    }

    // compareTo
    @Override
    public int compareTo(Issue other) {
        return Integer.compare(this.urgencyLevel, other.urgencyLevel);
    }

    // toString
    @Override
    public String toString() {
        return "Issue: " + description + " | Urgency Level: " + urgencyLevel;
    }

    // getters (если вдруг понадобятся)
    public String getDescription() {
        return description;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }
}
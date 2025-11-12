package main.java;

public class Request {
    private String type;
    private String description;
    private int priority;

    public Request(String type, String description, int priority) {
        this.type = type;
        this.description = description;
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}

package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

class Task {
    private String taskId;
    private String studentId;
    private String description;
    private List<String> attachments;
    private String feedback;
    private boolean reviewed;

    public Task(String taskId, String studentId, String description) {
        this.taskId = taskId;
        this.studentId = studentId;
        this.description = description;
        this.attachments = new ArrayList<>();
        this.feedback = "";
        this.reviewed = false;
    }

    public void addAttachment(String attachment) {
        attachments.add(attachment);
    }

    public void receiveFeedback(String feedback) {
        this.feedback = feedback;
        this.reviewed = true;
    }

    public void displayTaskDetails() {
        System.out.println("Task ID: " + taskId);
        System.out.println("Student ID: " + studentId);
        System.out.println("Description: " + description);
        System.out.println("Attachments: " + attachments);
        System.out.println("Feedback: " + feedback);
        System.out.println("Reviewed: " + reviewed);
    }

    public String getTaskId() {
        return taskId;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public String getDescription() {
        return description;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public String getFeedback() {
        return feedback;
    }
}

public class OnTrack {
    public static void main(String[] args) {
        Task task = new Task("T001", "S001", "Submit essay for English literature");

        task.addAttachment("Essay.pdf");

        task.receiveFeedback("Good effort. Work on improving grammar and organization.");

        task.displayTaskDetails();
    }
}


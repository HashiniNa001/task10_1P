package sit707_tasks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class OnTrackTest {

    @Test
    public void testTaskSubmission() {
        Task task = new Task("T001", "S001", "Submit essay for English literature");
        task.addAttachment("Essay.pdf");
        assertFalse(task.isReviewed());
    }

    @Test
    public void testReceiveFeedback() {
        Task task = new Task("T001", "S001", "Submit essay for English literature");
        task.receiveFeedback("Good effort. Work on improving grammar and organization.");
        assertTrue(task.isReviewed());
        assertEquals("Good effort. Work on improving grammar and organization.", task.getFeedback());
    }

    @Test
    public void testDisplayTaskDetails() {
        Task task = new Task("T001", "S001", "Submit essay for English literature");
        task.addAttachment("Essay.pdf");
        task.receiveFeedback("Good effort. Work on improving grammar and organization.");

        String expectedDetails = "Task ID: T001\n" +
                "Student ID: S001\n" +
                "Description: Submit essay for English literature\n" +
                "Attachments: [Essay.pdf]\n" +
                "Feedback: Good effort. Work on improving grammar and organization.\n" +
                "Reviewed: true\n";

        assertEquals(expectedDetails, getTaskDetails(task));
    }

    private String getTaskDetails(Task task) {
        return String.format("Task ID: %s\nStudent ID: %s\nDescription: %s\nAttachments: %s\nFeedback: %s\nReviewed: %s\n",
                task.getTaskId(), task.getStudentId(), task.getDescription(), task.getAttachments(), task.getFeedback(), task.isReviewed());
    }
}

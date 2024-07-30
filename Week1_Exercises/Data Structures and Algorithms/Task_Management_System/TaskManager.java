public class TaskManager {
    private Node head;
    private Node tail;

    public TaskManager() {
        head = null;
        tail = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTaskId() == taskId) {
                return current.getTask();
            }
            current = current.getNext();
        }
        return null; // Task not found
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getTask());
            current = current.getNext();
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            return;
        }

        if (head.getTask().getTaskId() == taskId) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node current = head;
        while (current.getNext() != null && current.getNext().getTask().getTaskId() != taskId) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            if (current.getNext() == tail) {
                tail = current;
            }
            current.setNext(current.getNext().getNext());
        }
    }
}

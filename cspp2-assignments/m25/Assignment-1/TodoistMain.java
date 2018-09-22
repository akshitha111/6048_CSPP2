import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
    private String title;
    private String assignedTo;
    private int timeToComplete;
    private boolean important = true;
    private boolean urgent = true;
    private String status;
    public Task(String t, String at, int tc, boolean imp, boolean ur, String s) {
        this.title = t;
        this.assignedTo = at;
        this.timeToComplete = tc;
        this.important = imp;
        this.urgent = ur;
        this.status = s;
        /*if(title == null) {
            throw new Exception("Title not provided");
        }
        if(timeToComplete < 0) {
            throw new Exception("Invalid timeToComplete" + (timeToComplete));
        }
    }*/
}

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String t) {
        this.title = t;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }
    public void setAssignedTo(String at) {
        this.assignedTo = at;
    }
    public int getTimeToComplete() {
        return this.timeToComplete;
    }
    public void setTimeToComplete(int tc) {
        this.timeToComplete = tc;
    }
    public boolean getImportant() {
        return this.important;
                
    }
    public void setImportant(boolean imp) {
        
        this.important = imp;
    }
    public boolean getUrgent() {
        return this.urgent;
    }
    public void setUrgent(boolean ur) {
        this.urgent = ur;
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String s) {
        if(s == null){
            this.status = "Invalid Status";
            return;
        }
        this.status = s;
    }
    
    public String toString() {
        String str = "";
        if(important && urgent) {
         str += title + ", " + assignedTo + ", " + timeToComplete + ", " + "Important" + ", " + "Urgent" + ", " + status;
    }
    else {
        str += title + ", " + assignedTo + ", " + timeToComplete + ", " + "Not Important" + ", " + "Not Urgent" + ", " + status;
    } return str;
    }

}

class Todoist {
    private Task[] task;
    private int size;
    private Task tasks;
    Todoist() {
        task = new Task[100];
        size = 0;
    }
    public void addTask(Task t) {
        task[size++] = t;
    }
    /*public Task getNextTask(String name) {
        Task[] arr = new Task[count];
        for (Task task : arr) {
            if(arr[i].getAssignedTo().equals(name) && arr[i].getStatus().equals("todo") && arr[i].getImportant() == true && arr[i].getUrgent() == true) {
                arr.testAddTask(task);
            }
         else(arr[i].getAssignedTo().equals(name) && arr[i].getStatus().equals("todo") && arr[i].getImportant() == true && arr[i].getUrgent() == true) {
            arr.testAddTask(task);
        }
    }return arr;
        
    }*/

    public int totalTime4Completion() {
        //tasks = new Task();
        return tasks.getTimeToComplete();

    }
    public Task[] getNextTask(String n) {
        return task;
    }
    public Task[] getNextTask(String n, int a) {
        return task;
    }


    public String toString() {
        String str = "";
        for(int i = 0; i < task.length; i++) {
            str += task[i].getTitle() + task[i].getAssignedTo() + task[i].getTimeToComplete() + task[i].getImportant() + task[i].getUrgent() + task[i].getStatus();

        }
        return str;
    }
    
}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                case "get-next":
                    System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    int n = Integer.parseInt(tokens[2]);
                    Task[] tasks = todo.getNextTask(tokens[1], n);
                    System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    System.out.println(todo.totalTime4Completion());
                break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}

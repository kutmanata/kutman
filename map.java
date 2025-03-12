import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Task implements Comparable<Task> {
    private final String taskName;
    private final int priority;
    private final int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Task other) {
        if (this.priority == other.priority) {
            return Integer.compare(this.duration, other.duration);
        }
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}

class TaskScheduler {
    private final List<Task> scheduledTasks;
    private final List<Task> pendingTasks;
    private Task processingTask;

    public TaskScheduler() {
        this.scheduledTasks = new LinkedList<>();
        this.pendingTasks = new LinkedList<>();
        this.processingTask = null;
    }

    public void addTask(Task task) {
        scheduledTasks.add(task);
        scheduledTasks.sort(null);
        System.out.println("Task added: " + task);
    }

    public void processNextTask() {
        if (processingTask != null) {
            System.out.println("Already processing: " + processingTask);
            return;
        }

        if (!scheduledTasks.isEmpty()) {
            processingTask = scheduledTasks.remove(0);
            System.out.println("Processing Task: " + processingTask);
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void completeCurrentTask() {
        if (processingTask == null) {
            System.out.println("No task is currently being processed.");
            return;
        }
        System.out.println("Completed Task: " + processingTask);
        processingTask = null;

        if (!scheduledTasks.isEmpty() || !pendingTasks.isEmpty()) {
            moveFromPendingToScheduled();
            processNextTask();
        }
    }

    public void delayTask(String taskName) {
        if (processingTask != null && processingTask.getTaskName().equals(taskName)) {
            pendingTasks.add(processingTask);
            System.out.println("Delaying Task: " + processingTask);
            processingTask = null;
            return;
        }

        for (Iterator<Task> iterator = scheduledTasks.iterator(); iterator.hasNext(); ) {
            Task task = iterator.next();
            if (task.getTaskName().equals(taskName)) {
                iterator.remove();
                pendingTasks.add(task);
                System.out.println("Delaying Task: " + task);
                return;
            }
        }

        System.out.println("Task '" + taskName + "' not found.");
    }

    public void moveFromPendingToScheduled() {
        if (!pendingTasks.isEmpty()) {
            Task task = pendingTasks.remove(0);
            scheduledTasks.add(task);
            scheduledTasks.sort(null);
            System.out.println("Moved from pending to scheduled: " + task);
        }
    }

    public void showAllTasks() {
        System.out.println("\nScheduled Tasks:");
        if (scheduledTasks.isEmpty()) {
            System.out.println("No scheduled tasks");
        } else {
            int i = 1;
            for (Task task : scheduledTasks) {
                System.out.println(i++ + ". " + task);
            }
        }

        System.out.println("\nPending Tasks:");
        if (pendingTasks.isEmpty()) {
            System.out.println("No pending tasks");
        } else {
            int i = 1;
            for (Task task : pendingTasks) {
                System.out.println(i++ + ". " + task);
            }
        }

        if (processingTask != null) {
            System.out.println("\nCurrently Processing: " + processingTask);
        }
    }
}

class KeyValue {
    public static <K, V> void printKeyValue(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}

class ToOneList {
    public static <E> List<E> toOne(List<E> first, List<E> second) {
        List<E> result = new ArrayList<>(first.size() + second.size());

        int maxSize = Math.max(first.size(), second.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < first.size()) result.add(first.get(i));
            if (i < second.size()) result.add(second.get(i));
        }

        return result;
    }
}

public class map {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);

        List<Integer> mergedList = ToOneList.toOne(list1, list2);
        System.out.println("Merged List: " + mergedList);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("alym", 100);
        scores.put("elya", 60);
        scores.put("ulan", 89);
        KeyValue.printKeyValue(scores);

        System.out.println();

        Map<Integer, String> idNames = new TreeMap<>();
        idNames.put(101, "aza");
        idNames.put(103, "bek");
        idNames.put(102, "nurti");
        KeyValue.printKeyValue(idNames);

        System.out.println("\n------");
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new Task("Code Review", 3, 20));
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(new Task("Database Backup", 2, 30));
        scheduler.addTask(new Task("Deploy New Feature", 5, 50));
        scheduler.addTask(new Task("Bug Fixing", 4, 25));

        scheduler.showAllTasks();

        scheduler.processNextTask();

        scheduler.delayTask("Code Review");

        scheduler.showAllTasks();

        scheduler.completeCurrentTask();
        scheduler.processNextTask();

        scheduler.showAllTasks();
    }
}

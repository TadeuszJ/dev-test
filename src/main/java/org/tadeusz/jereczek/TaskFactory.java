package org.tadeusz.jereczek;

public class TaskFactory {
    public Task getTask(String taskNumber) {
        if ("1".equals(taskNumber)) {
            return new Task1();
        } else if ("2".equals(taskNumber)) {
            return new Task2();
        } else if ("3".equals(taskNumber)) {
            return new Task3();
        } else {
            return null;
        }
    }
}

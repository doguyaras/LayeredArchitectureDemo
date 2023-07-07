package core.logging;

import entities.Courses;

public class DatabaseLogger implements IBaseLogger{
    @Override
    public void log(String data) {
        System.out.println("Logged to database: "+data);
    }
}

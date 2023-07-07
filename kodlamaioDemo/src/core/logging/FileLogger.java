package core.logging;

import entities.Courses;

public class FileLogger implements IBaseLogger{
    @Override
    public void log(String data) {
        System.out.println("Logged to file: "+data);
    }
}

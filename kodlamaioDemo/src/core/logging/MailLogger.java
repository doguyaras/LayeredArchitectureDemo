package core.logging;

import entities.Courses;

public class MailLogger implements IBaseLogger{
    @Override
    public void log(String data) {
        System.out.println("Logged to mail: "+data);
    }
}

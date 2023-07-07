package business;

import core.logging.IBaseLogger;
import dataAccess.ICoursesDao;
import entities.Courses;

import java.util.List;

public class CoursesManager {

    private ICoursesDao coursesDao;
    private IBaseLogger[] loggers;
    private List<Courses> coursesList;

    public CoursesManager(ICoursesDao coursesDao,IBaseLogger[] loggers,List<Courses> coursesList){
        this.coursesDao = coursesDao;
        this.loggers = loggers;
        this.coursesList = coursesList;
    }

    public void add(Courses courses) throws Exception {
        if (courses.getCoursePrice() < 0) {
            throw new Exception("Course price cannot be less than 0!");
        }

            for (Courses checkCourses : coursesList) {
                if (courses.getCourseName().equals(checkCourses.getCourseName())) {
                throw new Exception("Course name cannot be the same!");
            }
        }

        coursesDao.add(courses);
        coursesList.add(courses);

        for (IBaseLogger logger : loggers) {
            logger.log(courses.getCourseName());
        }
    }


    }


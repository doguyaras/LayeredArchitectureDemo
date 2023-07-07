import business.CategoriesManager;
import business.CoursesManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.IBaseLogger;
import core.logging.MailLogger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entities.Categories;
import entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Courses course1 = new Courses(1,"Java",10);
        Courses course2 = new Courses(2,"C#",200);
        Courses course3 = new Courses(3,"Html&Css",300);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(course1);
        coursesList.add(course2);



        IBaseLogger[] loggers = {new FileLogger(),new DatabaseLogger(),new MailLogger()};

        CoursesManager coursesManager = new CoursesManager(new HibernateDao(),loggers,coursesList);
        coursesManager.add(course3);

        System.out.println("-------------------------------------");

        Categories categories1 = new Categories("Back-end");
        Categories categories2 = new Categories("Mobile");
        Categories categories3 = new Categories("Front-end");

        List<Categories> categories = new ArrayList<>();
        categories.add(categories1);
        categories.add(categories2);



        CategoriesManager categoriesManager = new CategoriesManager(new JdbcDao(),loggers,categories);
        categoriesManager.add(categories3);





    }
}
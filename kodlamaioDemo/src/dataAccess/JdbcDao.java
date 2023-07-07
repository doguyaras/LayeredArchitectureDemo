package dataAccess;

import entities.Categories;
import entities.Courses;

public class JdbcDao implements ICategoriesDao,ICoursesDao{
    @Override
    public void add(Categories categories) {
        System.out.println("Added to database with Jdbc.");

    }

    @Override
    public void add(Courses courses) {
        System.out.println("Added to database with Jdbc.");

    }
}

package dataAccess;

import entities.Categories;
import entities.Courses;

public class HibernateDao implements ICategoriesDao,ICoursesDao{
    @Override
    public void add(Categories categories) {
        System.out.println("Added to database with Hibernate.");
    }

    @Override
    public void add(Courses courses) {
        System.out.println("Added to database with Hibernate.");
    }
}

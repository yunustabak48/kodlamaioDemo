package business;

import java.util.Arrays;

import core.logging.Logger;
import dataAccsess.CourseDao;
import dataAccsess.HibarnateCourseDao;
import entities.Course;

public class CourseManager {

	String[] courseNames = { "a", "b", "c", "d", "e" };
	String[] categoryNames = { "a", "b", "c", "d", "e" };
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Ürün fiyatı 0'dan kücük olamaz");

		}
		if (Arrays.asList(courseNames).contains(course.getName())) {
			throw new Exception("Ürün adı tekrar edemez");
		}
		if (Arrays.asList(courseNames).contains(course.getCategory())) {
			throw new Exception("Kategori adı tekrar edemez");
		}
		courseDao.add(course);
		for (Logger log : loggers) {
			log.logadd(course.getName());
		}
	}

}

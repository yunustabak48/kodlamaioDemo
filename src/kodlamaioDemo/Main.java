package kodlamaioDemo;

import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccsess.HibarnateCourseDao;
import dataAccsess.JdbcCourseDao;
import entities.Course;

public class Main {

	 public static void main(String[] args) throws Exception {
	        Course course = new Course(1, "pyhton", "Eğitim kampı", 0);
	        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
	        CourseManager courseManager = new CourseManager(new HibarnateCourseDao(), loggers);
	        courseManager.add(course);
		
		

	}

}

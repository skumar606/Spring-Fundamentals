package com.anthology.movierecommendersystem2;

import com.anthology.movierecommendersystem2.lesson1.CollaborativeFilter;
import com.anthology.movierecommendersystem2.lesson1.ContentBasedFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystem2Application {

	public static void main(String[] args) {

		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystem2Application.class, args);

		// Retrieve singleton bean from application context thrice
		ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf3= appContext.getBean(ContentBasedFilter.class);

		// Retrieve prototype bean from application context thrice
		CollaborativeFilter cf1 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf2 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf3 = appContext.getBean(CollaborativeFilter.class);


		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);

		System.out.println(cf1);
		System.out.println(cf2);
		System.out.println(cf3);
	}

}

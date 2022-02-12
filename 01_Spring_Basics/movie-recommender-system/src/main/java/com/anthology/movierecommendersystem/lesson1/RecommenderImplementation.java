package com.anthology.movierecommendersystem.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    // dependency injection using constructor
    @Autowired
    public RecommenderImplementation(@Qualifier("contentBasedFilter") Filter filter) {
        this.filter = filter;
    }

//  // dependency injection using setter method
//    @Autowired
//    @Qualifier("contentBasedFilter")
//    public void setFilter(Filter filter) {
//        this.filter = filter;
//    }

    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}

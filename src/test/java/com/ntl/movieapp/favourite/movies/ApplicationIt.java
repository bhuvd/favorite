package com.ntl.movieapp.favourite.movies;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ntl.movieapp.favourite.movies.Controller.FavControllerTest;
import com.ntl.movieapp.favourite.movies.model.FavouritesTest;
import com.ntl.movieapp.favourite.movies.service.FavServiceTest;





public class ApplicationIt {

//	@Test
//	public void contextLoads() {
//		//assertThat(controller).isNotNull();
//	}
	
	@Test
    public void main()
    {   
        Application.main(new String[] {});
    }

}

package com.nar.mockitodemo.service;

import com.nar.mockitodemo.dao.MDao;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestMServiceImplConfiguration {

    @Bean
    @Primary
    public MDao mDao() {
        return Mockito.mock(MDao.class);
    }
}

package com.nar.mockitodemo.service;

import com.nar.mockitodemo.MockitoDemoApplication;
import com.nar.mockitodemo.dao.MDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMServiceImpl {
    @Autowired
    private MService mService;

    @Autowired
    private MDao mDao;

    @Test
    public void testMservice(){
        Mockito.when(mDao.getnNameById(1)).thenReturn("nar123");

        String name = mService.getNameByIdService(1);

        Assert.assertEquals(name , "nar123");
    }


}

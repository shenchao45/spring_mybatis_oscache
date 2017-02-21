package com.shenchao.test;

import com.shenchao.service.TestAopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Author:shenchao
 * Date:2017/1/17 16:27
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-service.xml","classpath:applicationContext-tx.xml","classpath:applicationContext-dao.xml"})
public class ApplictionTest {
    @Autowired
    @Qualifier("testAop")
    private TestAopService testAopService;
    @Test
    public void test() {
       testAopService.check();
    }
}

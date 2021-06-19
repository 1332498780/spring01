package spring01;

import cn.hzy.demo.service.ServiceA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-jdbc.xml"})
public class TranscationTest {

    @Autowired
    private ServiceA serviceA;

    @Test
    public void testA(){
        serviceA.b();
    }

}

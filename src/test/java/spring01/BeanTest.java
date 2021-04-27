package spring01;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hzy.demo.model.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-config.xml"})
public class BeanTest {

	@Resource
	private Student stu;
	
	@Test
	public void testPropert() {
		System.out.println(stu.getIdCard());
	}
}

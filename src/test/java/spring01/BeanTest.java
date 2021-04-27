package spring01;

import java.io.IOException;
import java.util.Scanner;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hzy.demo.model.MyResource;
import cn.hzy.demo.model.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-config.xml"})
public class BeanTest {

	@Resource
	private Student stu;
	
	@Autowired
	private MyResource myResource;
	
	@Test
	public void propertTest() {
		System.out.println(stu.getIdCard());
	}
	
	@Test
	public void resourceTest() throws IOException {
//		
		if(myResource.getResource()!=null) {
			System.out.println("yes");
//			System.out.println(myResource.getResource().length);
			for(org.springframework.core.io.Resource r:myResource.getResource()) {
				Scanner scanner = new Scanner(r.getInputStream());
				while(scanner.hasNext()) {
					System.out.println(scanner.next());
				}
				System.out.println();
			}
		}else{
			System.out.println("no");
		}

	}
}

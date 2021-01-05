package mapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import slq.mapper.StudentMapper;
import slq.pojo.Student;
import slq.service.StudentService;

public class TestService {
    @Test
    public void trttt(){
        ApplicationContext c = new ClassPathXmlApplicationContext("spring-service.xml");
//        StudentService s = c.getBean("studentService",StudentService.class);
        StudentService s = c.getBean(StudentService.class);
        System.out.println(s);
        System.out.println(s.getStudent(2));
        Student ss=new Student();
        ss.setName("asd");
        s.add(ss);
    }
}

package slq.mapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
    @Test
    public void trttt(){
        ApplicationContext c = new ClassPathXmlApplicationContext("spring-dao.xml");
        StudentMapper s = c.getBean(StudentMapper.class);
        System.out.println(s);
        System.out.println(s.getOne(2));
    }
}

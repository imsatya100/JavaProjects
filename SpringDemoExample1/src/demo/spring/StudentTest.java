package demo.spring;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class StudentTest {

	public static void main(String[] args) {
		/*Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		*/
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) factory.getBean("student");
		System.out.println(student);
	}

}

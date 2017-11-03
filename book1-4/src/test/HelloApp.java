package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import di.MessageBean;

public class HelloApp {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/conf/beans.xml"));
		MessageBean bean = (MessageBean)factory.getBean("proxy");
		
		bean.sayHello();

	}

}

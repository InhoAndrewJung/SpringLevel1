package log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//log4j�� �߰�...
//log���Ͽ� ����ϱ� ���ؼ��� Log��ü�� ���� �Ѵ�
/*
 * log�� �޼����� ������ �ִ�.
 * trace>debug>>>>>info*>warn>error>fatal
 * 
 * �޼����� �ַܼ� �ⷰ | ���Ϸ� ���
 * 
 * log4j.properties ������ �ʿ�
 * ������ġ�� �߿�!! -> server>WEB-INF>classes!!!�� �ִ´� ��Ŭ���������� srcǮ���� �ִ´�
 * log4j.jar ���̺귯���� WEB-INF>lib�� �ִ´�
 */
public class LogService {
	private Log log = LogFactory.getLog(getClass());
	
	public void testLogging() {
		log.trace("trace...message");//��������
		log.debug("debug...message");//�������� �޼����� ���....�ǹ̾��� -> info�� ���
		log.info("info...message");//������
		log.warn("warn...message");//
		log.error("error...message");
		log.fatal("fatal...message");
	}
}
package log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//log4j를 추가...
//log파일에 출력하기 위해서는 Log객체를 얻어내야 한다
/*
 * log의 메세지는 레벨이 있다.
 * trace>debug>>>>>info*>warn>error>fatal
 * 
 * 메세지를 콘솔로 출럭 | 파일로 출력
 * 
 * log4j.properties 파일이 필요
 * 저장위치가 중요!! -> server>WEB-INF>classes!!!에 넣는다 이클립스에서는 src풀더에 넣는다
 * log4j.jar 라이브러리는 WEB-INF>lib에 넣는다
 */
public class LogService {
	private Log log = LogFactory.getLog(getClass());
	
	public void testLogging() {
		log.trace("trace...message");//쓸데없음
		log.debug("debug...message");//디테일한 메세지를 출력....의미없다 -> info면 충분
		log.info("info...message");//충분충분
		log.warn("warn...message");//
		log.error("error...message");
		log.fatal("fatal...message");
	}
}

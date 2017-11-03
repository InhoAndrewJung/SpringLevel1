package api5;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * DataSource를 가져야한다.
 */
public class DaoImpl implements Dao{
	@Autowired
	private String DataSource;//주입통로
	

	public String getDataSource() {
		return DataSource;
	}



	public void register() {
		//시간이 5초 걸린다고 한다.
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		System.out.println("Connection 연결 및 회원 가입 성공!!");
	}

}

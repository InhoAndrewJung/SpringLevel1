package solv1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * �����Ͻ� ������ ����ִ� Target Ŭ����
 * �ٽ����� ������ ���̿� �μ����� ���ɻ�( Cross cutting Concern)�� ��������� ����־
 * OOP�� ������ �帮�� �Ѵ�.
 */
public class MemberService {
	
	//�����Ͻ� ����...
	
	public void register() {
		//�����Ͻ�����
		System.out.println("ȸ������ ��ϵǾ����ϴ�.");
	}
	
	public void findMemberById(String id) {
		//�����Ͻ�����
		System.out.println(id+"ȸ���� �˻�.");
	}
}

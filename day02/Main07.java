package day02_t;
/*
* �������̽� (interface)
	- ��ü�� ������� ������ Ÿ��
	- �������̽��� ���� ��ü��� ��� �����ϹǷ� � ��ü�� ����ϴ��Ŀ�
	���� ���� ����� ���ϰ��� �ٸ� �� �ִ�.
	��, ���� �ڵ� ���鿡���� �ڵ� ������� ���� ����� ���ϰ��� 
	�پ�ȭ �� �� �ִٴ� ���� ����.

* ����
	public interface �������̽��� {.....}
	: public - �ٸ� ��Ű�������� ���� ����.
* ����
	Ŭ����(������, ���� , �޼���)
	����� �޼��常 ����.
	
* ��� ����
	[public static final] Ÿ�� ������ = ��;
	
* ���� �������̽� ���� ����
	public class Ŭ������ implements �������̽�A, �������̽�B, ... {
		// �ݵ�� �������̽����� �޼��� �����ؾ���.
	}
*/
// RemoteControl - Television - Audio
public class Main07 {
	public static void main(String[] args) {
		// �������̽� ����;
		RemoteControl rc;
		// ���� = ������ü����;
		rc = new Television();
		rc = new Audio();
		
		
		RemoteControl rc2 = null;
		rc2 = new Television();
		rc2.turnOn();
		rc2.setVolume(100);
		rc2.setVolume(5);
		rc2.turnOff();
		System.out.println("====");
		
		rc2 = new Audio();
		rc2.turnOn();
		rc2.turnOff();
	}
}
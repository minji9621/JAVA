package day02_t;

public abstract class Phone {
	// ����
	String user;
	
	// ������
	// new �� ������ �� ���⶧����
	// �ڽ� ��ü���� super() �̿��ؼ� �����ؾ� ��.
	// �ݵ�� ������ �־���Ѵ�.
	Phone(String user){
		this.user = user;
	}
	
	// �޼���
	void tutnOn() {
		System.out.println("������ �մϴ�.");
	}
	void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}







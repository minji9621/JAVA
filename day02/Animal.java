package day02_t;
// �߻� Ŭ����
public abstract class Animal {
	String kind;
	
	void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	// �߻� �޼��� - �������� ���� {} ����.
	abstract void sound();
}
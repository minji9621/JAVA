package day02_t;
/*
* �߻� (abstract)
	- ��ü������ ���� Ŭ���� : �̿ϼ� Ŭ����
	- ��ü���� �Ұ�
	- ���-> ��ü Ŭ���� -> ��ü ����
	- �ڼ� ��ü���� �����˴� Ư���� �����ؼ� ������ Ŭ����
	- �߻� Ŭ����-���� / ��ü Ŭ����-�ڼ�
	- ��ü Ŭ������ �߻� Ŭ������ ��� ����/�޼��带 ��� �ް�
	�߰����� Ư���� ���� �� �ִ�.
	
	- ����
	public abstract class Ŭ������{
		// ����, �޼���
	}
*/
// Phone - SmartPhone
public class Main05 {
	public static void main(String[] args) {
//		Phone phone = new Phone();
		
		SmartPhone sPhone = new SmartPhone("java");
		
		sPhone.tutnOn();
		sPhone.internerSearch();	// �ڼ��� ��
		sPhone.turnOff();
	}
}















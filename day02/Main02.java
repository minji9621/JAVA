package day02_t;
/*
	�θ� Ÿ������ �ڵ� ��ȯ�� �� �Ŀ���
	�θ� Ŭ�������� ����� ������ �޼��常 ���� ����.
	������ �ڽ� ��ü�� ���������� 
	���� ������ ���(����,�޼���)�� �θ� Ŭ������ ����̴�.
	
	�̶�, �ڼ��� �������̵� �ߴٸ� 
	�������̵� �� �޼��尡 ȣ�� ��.
*/
// Parent - Child
public class Main02 {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// �ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();// �������̵� �� �޼��� ȣ��
		
//		parent.method3();// ȣ�� �Ұ���
	}
}
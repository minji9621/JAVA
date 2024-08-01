package day02_t;
/*
* instanceof 
	- � ��ü�� � Ŭ������ �ν��Ͻ�(��ü)���� Ȯ���� �� ���.
	- instanceof �� �������� ���ʿ� ��ü, �����ʿ� Ÿ���� �´�.
	- ������ ��ü�� �������� Ÿ������ ���� �Ǿ��ٸ� true
	�ƴϸ� false ����.
	
	- �Ű����� Ÿ���� �����Ҷ� �ַ� ���.
	- �޼��� ������ ���� Ÿ�Ժ�ȯ�� �ʿ��� ���
	�Ű����� � ��ü���� instanceof �����ڷ� Ȯ���ϰ�
	�����ϰ� Ÿ�Ժ�ȯ�� �ؾ��Ѵ�.
	- Ȯ���� ������ ��� ClassCastException ���ܰ� �߻� �� �� �ִ�.
*/
// Parent3 - Child3
public class Main04 {
	// �޼��� 1,2 ��� Parent3 Ÿ���� �Ű��� ����
	public static void method1(Parent3 parent3) {
		if( parent3 instanceof Child3 ) {// Child3 Ÿ������ ��ȯ�� �������� Ȯ��
			Child3 child3 = (Child3) parent3;
			System.out.println("method1- Child3 ���� ��ȯ ����");
		} else {
			System.out.println("method1- Child3 ���� ��ȯ ����");
		}
	}
	
	public static void method2(Parent3 parent3) {
		Child3 child3 = (Child3) parent3;
		System.out.println("method2-Child3 ���� ��Ȳ ����");
	}
	
	public static void main(String[] args) {
		Parent3 parentA = new Child3();
		
		// Child3 ��ü�� �Ű������� ����.
		method1(parentA);
		method2(parentA);
		
		Parent3 parentB = new Parent3();
		// Parent3 ��ü�� �Ű������� ����.
		method1(parentB);
		method2(parentB);	// ���� �߻�
	}
}
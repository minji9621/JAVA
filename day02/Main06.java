package day02_t;
/*
* �߻� �޼���
	- �޼����� ���� �����ϰ� ���� ������ �޶�� �� ��� ���.
	- �߻� �޼���� �߻� Ŭ���������� ���� ����
	- �޼����� ����θ� �ְ� ������ ��, ���� ������ {}�� ���� ��.
	- ��� �޴� �ڽ� Ŭ������ �ݵ�� �߻�޼��带 �������̵�(������) �ؾ� ��.
*/
public class Main06 {
	public static void animalSound( Animal animal ) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		// sound() �޼��带 ȣ���ϴ� ���
		// Cat Dog ��ü ���� �� ȣ��
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound();
		dog.sound();
		System.out.println("======");
		
		// ������ Ÿ�� ��ȯ
		// �θ� ������ �ڽ��� ��ü ����
		Animal animal = null;
		animal = new Cat();	// �ڵ� Ÿ�Ժ�ȯ
		animal.sound();
		
		animal = new Dog();
		animal.sound();
		System.out.println("======");
		
		// �Ű������� �ڵ� Ÿ�� ��ȯ
		// ���� ������ �Ű������� Ȱ��
		animalSound(new Cat());
		animalSound(new Dog());
	}
	
}
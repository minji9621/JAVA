package day02_t;

public class Cat extends Animal {

	Cat(){
		this.kind = "������";
	}
	
	// �ݵ�� �߻� �޼��带 �������̵� �ؾ���.
	@Override
	void sound() {
		System.out.println("�߿�");
	}
}
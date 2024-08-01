package day02_t;

public class Television implements RemoteControl {
	// private: ���� Ŭ���� �������� ���� ����
	private int volume;
	
	// �߻� �޼��� ����
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	// �������̽��� ����� �̿��Ͽ� volume ���� ����
	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ������ : "+ this.volume);
	}
}











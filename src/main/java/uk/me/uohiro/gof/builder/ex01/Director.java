package uk.me.uohiro.gof.builder.ex01;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("�����璋�ɂ�����");
		builder.makeItems(new String[] {
			"���͂悤�������܂��B",
			"����ɂ��́B"
		});
		builder.makeString("���");
		builder.makeItems(new String[] {
			"����΂�́B",
			"���₷�݂Ȃ����B",
			"���悤�Ȃ�B"
		});

		builder.close();
	}
}
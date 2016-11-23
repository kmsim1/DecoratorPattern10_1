/*
 *  ���� ǥ�� ��� �߰� Ŭ����
 */
public class LaneDecorator extends DisplayDecorator {
	
	//���� ǥ�� Ŭ������ ����
	public LaneDecorator(Display decorateddisplay) {
		super(decorateddisplay);
	}

	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("���� ǥ��");
	}
}

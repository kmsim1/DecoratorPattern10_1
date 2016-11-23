
public class TrafficDecorator extends DisplayDecorator {
	public TrafficDecorator(Display decorateddisplay) {
		super(decorateddisplay);
	}

	public void draw() {
		super.draw();
		drawTraffic();
	}
	
	private void drawTraffic() {
		System.out.println("���� ���� ǥ��");
	}
}


public class CrossingDecorator extends DisplayDecorator {
	public CrossingDecorator(Display decorateddisplay) {
		super(decorateddisplay);
	}
	
	public void draw() {
		super.draw();
		drawCrossing();
	}
	
	public void drawCrossing() {
		System.out.println("������ ǥ��");
	}
	
}

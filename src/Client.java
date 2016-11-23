
public class Client {
	public static void main(String[] args) {
//		Display road = new RoadDisplay();
//		road.draw(); // �⺻ ���θ� ǥ��
//
//		Display roadWithLane = new LaneDecorator(new RoadDisplay());
//		roadWithLane.draw(); // �⺻���� + ����ǥ��
//
//		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
//		roadWithTraffic.draw(); // �⺻���� + Traffic ǥ��
		
		// �⺻ ���� ǥ��
		Display d1 = new RoadDisplay();
		d1.draw();
		System.out.println("");
		
		// �⺻ ���� ǥ�� + ���� ǥ��
		Display d2 = new LaneDecorator(new RoadDisplay());
		d2.draw();
		System.out.println("");
		
		// �⺻ ����ǥ�� + ���� ǥ�� + �������� ǥ��
		Display d3 = new TrafficDecorator(d2);
		d3.draw();
		System.out.println();
		
		// �⺻ ����ǥ�� + ����ǥ�� + ��������ǥ�� + ������ ǥ��
		Display d4 = new CrossingDecorator(d3);
		d4.draw();
	}
}
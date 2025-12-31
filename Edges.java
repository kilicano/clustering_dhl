
public class Edges {

	private double weight;
	private int shipment;
	private double volume;
	private double distance;
	private Nodes tail; //originating node
	private Nodes head; //destination node
	
	public Edges( double distance, Nodes tail, Nodes head, double weight, int shipment, double volume){
		this.distance = distance;
		this.tail = tail;
		this.head = head;
		this.weight = weight;
		this.shipment = shipment;
		this.volume = volume;
	}
	
	public double getDistance(){
		return distance;
	}
	
	public Nodes getTail(){
		return tail;
	}
	
	public Nodes getHead(){
		return head;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void setWeight(double weigh){
		this.weight = weigh;
	}
	
	public int getShipment(){
		return shipment;
	}
	
	public void setShipment(int unit){
		this.shipment = unit;
	}
	
	public double getVolume(){
		return volume;
	}
	
	public void setVolume(double vol){
		this.volume = vol;
	}
}

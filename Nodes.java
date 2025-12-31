
public class Nodes {
	
	private boolean origin;
	private boolean cluster;
	private double latitude;
	private double longitude;
	
	//public Nodes(boolean origin, boolean cluster, double latitude, double longitude){
	public Nodes(double latitude, double longitude){
		this.origin = origin;
		this.cluster = cluster;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLat(){
		return latitude;
	}
	
	public double getLong(){
		return longitude;
	}
}

import java.io.*;
import java.util.*;

public class Solver {

	public static void main(String[] args){
		String filename1 = "UniqueArcsPeriod.txt";
		String filename2 = "OriginAGPeriod.txt";
		
		try {
			Network graph = new Network(filename1,filename2);
			
			graph.printEdges();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
}

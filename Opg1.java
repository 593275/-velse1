import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface Opg1 {
	
	
	
	int getAntallNoder();
	
	int getAntallKanter();
	
	List<String> alleNoder();
	
	boolean erNaboer(String u, String v);
	
	boolean leggTilNode(String w);
	
	boolean leggTilKant(String u, String v);
	
	boolean leggTilKanter(String w, String[] naboer);
	
	boolean fjern(String u, String v);
	
	List<String> getNaboer(String w);
	

}

class Nabomatrise implements Opg1 {
	
	private int n; 
	private int m; 
	private boolean [][] matrise;
	private String [] navnPaaNoder;
	
	public Nabomatrise(int n, String [] navnPaaNoder) {
		
		m = 0;
        boolean[][]matrise = new boolean[n][n];
        this.navnPaaNoder = navnPaaNoder;
        n=navnPaaNoder.length;
	}

	@Override
	public int getAntallNoder() {
		
		return n;
	}

	@Override
	public int getAntallKanter() {
		
		return m;
	}

	@Override
	public List<String> alleNoder() {
		
		LinkedList <String> List = new LinkedList<String>();
		
		for (int i = 0; i < n; i++) {
			
			List.add(navnPaaNoder[i]);
		}
		
			return List;
	
	
	}

	@Override
	public boolean erNaboer(String u, String v) {
		
			 int indexU = -1;
			 int indexV = -1;
			 
			 for(int i = 0; 0 < n; i++) { 
				 if(navnPaaNoder.equals(u)) {
					 
					 indexU = i;
					 break;
				 }
			 }
			 
			 for(int i = 0; 0 < n; i++) {
				 if(navnPaaNoder.equals(v)) {
					
					 indexV = i;
					 break;
			 }
			 } 
			 
			 if(indexU == indexV +1 || indexU == indexV-1) {
				 
				 return true;
				 
			 }else {
				 
				 return false;
			 }
	}
	
	@Override
	public boolean leggTilNode(String w) {
		
		boolean check = true;
		
		if( Arrays.asList(navnPaaNoder).contains(w)) {
			
			check = false;
			
			
		}else if  (!Arrays.asList(navnPaaNoder).contains(w)) {
			
			
			n++;
			navnPaaNoder[navnPaaNoder.length-1] = w;
			
		}
		
		return check;
		
	}
	

	@Override
	public boolean leggTilKant(String u, String v) {
		
		 int indexU = -1;
		 int indexV = -1;
		 
		 for(int i = 0; 0 < n; i++) { 
			 if(navnPaaNoder.equals(u)) {
				 
				 indexU = i;
				 break;
			 }
		 }
		 
		 for(int i = 0; 0 < n; i++) {
			 if(navnPaaNoder.equals(v)) {
				
				 indexV = i;
				 break;
		 }
			 
		 } 
		 
		 if(matrise [indexU][indexV] != true) {
			 
		 
		 matrise [indexU][indexV] = true;
		 
		 return true;
		
		 }else {
		 
	return false;
		
		 }
	}

	@Override
	public boolean leggTilKanter(String w, String[] naboer) {
		
		int index = 0;
		LinkedList <Integer> listeNaboer = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; i < n; j++) {
				if(matrise [i][j] == true) {
					
					return true;
					
				}else {
					
					 for(int x = 0; x < n; x++) { 
						 if(navnPaaNoder.equals(w)) {
							 
							 index = i;
							 break;
						 }
						 
						 
					 }
					 
					 
					 for(int y = 0; y < naboer.length; y++) {
						 for(int a = 0; a < n; n ++) {
							 
						 if(naboer[y].equals(navnPaaNoder[n])){
							 
							 listeNaboer.add(n);
						 }
					 }
					 
					 }
					 for(int antall = 0; antall < listeNaboer.size(); antall++) {
						 
					 matrise[i][listeNaboer.get(antall)] = true;
					 
					
					 }
				}
				
			}
		}
		
		return false;
	}

	@Override
	public boolean fjern(String u, String v) {
		
		 int indexU = -1;
		 int indexV = -1;
		 
		 for(int i = 0; 0 < n; i++) { 
			 if(navnPaaNoder.equals(u)) {
				 
				 indexU = i;
				 break;
			 }
		 }
		 
		 for(int i = 0; 0 < n; i++) {
			 if(navnPaaNoder.equals(v)) {
				
				 indexV = i;
				 break;
		 }
		 } 
		 
		 if(matrise [indexU][indexV] = true) {
			 
			 matrise [indexU][indexV] = false;
			 
			 return true;
			 
		 }else {
			 
			 return false;
			 
		 }
		
		
	}

	@Override
	public List<String> getNaboer(String w) {
		
		int index = -1;
		
		LinkedList<String> Naboer = new LinkedList<String>();
		
		for(int i = 0; 0 < n; i++) {
			 if(navnPaaNoder.equals(w)) {
				
				 index = i;
				 break;
		 }
		 } 
		
		
		for(int j = 0; j < navnPaaNoder.length; j++ ) {
		if(matrise [index][j] = true) {
			
			Naboer.add(navnPaaNoder[j]);
		}
				
		}
		return Naboer;
		
		
	}

	
	
	
}

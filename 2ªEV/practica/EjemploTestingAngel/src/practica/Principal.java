package practica;

import java.util.Arrays;

public class Principal {
	
	public static float add(float n1, float n2) {
		return n1+n2;
	}
	
	public static char getFirstCharacterInUpperCase(String text) {
		if(text == null) return 0;
		if(text.equals("")) return 0;
		
			char firstCharacter = text.charAt(0);
			return Character.toUpperCase(firstCharacter);
	}
	
	public static float sum(float[] numberList) {
		if(numberList == null) return 0;
		float acum = 0;
		for(int i=0; i<numberList.length;i++) {
			acum=acum + numberList[i];
		}
		return acum;
		
	}
	
	public static int getLargestValue(int[] numberList) {
		//  [4,2,7,1]
		if(numberList == null) return 0;
		if(numberList.length == 0) return 0;
		
		int largest =numberList[0];
		for(int i=0; i<numberList.length; i++) {
			if(numberList[i] > largest) {
				largest = numberList[i];
			}
		}
		
		return largest;
	}
	
	public static void main(String[] args) {
		
	}

}

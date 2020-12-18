package finaltext;

public class min {
public min() {
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	public int minimum(int[] list){
        int index;
        int min =0;
        for (index = 0; index < list.length-1; index++){
            if (list[index] < min) {
            	min = list[index];
            }
        }
        return min;
    }

	
}

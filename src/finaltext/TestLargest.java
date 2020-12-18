package finaltext;

public class TestLargest  {
	private int maxValue;
	@SuppressWarnings("unused")
	private int minValue;
	public void testPositive(){
		Largest max = new Largest();
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        Largest temp1 = new Largest();
        setMaxValue(temp1.largest(arr));
        System.out.println("Max: " + max.largest(arr));
        
    }
	public int getMaxValue() {
		return maxValue;
	}
private void setMaxValue(int maxValue) {
		// TODO Auto-generated method stub
	this.maxValue = maxValue;
	}

@SuppressWarnings("unused")
private void testNegative() {
	min Minimum = new min();
	int[] arr = new int[5];
    arr[0] = -8;
    arr[1] = -9;
    arr[2] = -7;
    arr[3] = -5;
    arr[4] = -2;
    min temp2 = new min();
    setMinValue(temp2.minimum(arr));
    System.out.println("Max: "+ Minimum.minimum(arr));
}
private void setMinValue(int minValue) {
	// TODO Auto-generated method stub
	this.minValue = minValue;
}

}
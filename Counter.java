public class Counter {

	private int tally = 0;
	private int startValue = 0;

	Counter(int value){
		startValue = value;
		tally = value;
	}

	public void count(){
		tally += 1;
	}

	public void reset(){
		tally = startValue;
	}

	public int getCount(){
		return tally;
	}
}

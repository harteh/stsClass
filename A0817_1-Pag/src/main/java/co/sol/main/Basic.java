package co.sol.main;

import lombok.Getter;
import lombok.Setter;

import lombok.ToString;

@Getter
@Setter
@ToString
public class Basic {
	
	private int pageNum;
	private int amount;

	
	public Basic(int pNum, int amount) {
		super();
		this.pageNum = pNum;
		this.amount = amount;
	}

	public Basic() {
		this(1, 5);
	}

}

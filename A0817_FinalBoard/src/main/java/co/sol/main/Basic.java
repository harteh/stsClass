package co.sol.main;

import org.springframework.test.context.TestConstructor;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString

public class Basic {
	
	private int pageNum;
	private int amount;
	
	public Basic(int p, int a) {
		super();
		pageNum=p;
		amount=a;
	}
	public Basic() {
		this(1,10);
	}
	

}

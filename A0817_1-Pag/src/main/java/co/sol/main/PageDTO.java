package co.sol.main;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageDTO {
	
	private int start, end;
	private boolean prev, next;
	
	private int total;
	private Basic ba;
	
	public PageDTO(Basic ba, int t) {
		this.ba=ba;
		this.total = t;
		
//		this.end = (int)(Math.ceil(ba.getPNum()/10.0)) *10;		//10
//		this.start = this.end-9;
		this.end = (int)(Math.ceil(ba.getPNum()/3.0)) *3;		//10
		this.start = this.end-2;
		
		this.prev = this.start > 1;
		
		int eend = (int)(Math.ceil((total*1.0)/ ba.getAmount()));	//가장 끝 번호
		
		this.end = eend<= end ? eend:end;
		
		this.next = this.end < eend;
	}

}

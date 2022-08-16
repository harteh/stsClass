package co.sol.main;

import java.sql.Date;

import lombok.Data;

@Data
public class BVO {
	
	private Long bnum;
	private String title;
	private String content;
	private String writer;
	private Date redate;
	private Date updatedate;

}

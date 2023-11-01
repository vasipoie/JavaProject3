package vo;

import java.math.BigDecimal;

public class FreeBoard {
	BigDecimal board_no;
	String board_name;
	String board_writer;
	String board_date;
	String board_content;
	
	public BigDecimal getBoard_no() {
		return board_no;
	}
	public void setBoard_no(BigDecimal board_no) {
		this.board_no = board_no;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	
	@Override
	public String toString() {
		return board_no + "\t"+ board_name +"\t"+ board_writer+ "\t"+ board_date +"\t"+ board_content;
	}
	
	
	
}

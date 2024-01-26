package vo;

public class FreeBoardVo {
	//vo 코드 조각 오라클에서 만든 후 복 붙 , getter setter, tostring 
	private int board_no;
	private String title;
	private String content;
	private int mem_no;
	private String reg_date;
	private String delyn;
	private int cnt;
	
	//실제 디비 x 데이터 가져오기 위해 추가
	private String mem_name;
	
	
	
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public int getboard_no() {
		return board_no;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "FreeBoardVo [board_no=" + board_no + ", title=" + title + ", content=" + content + ", mem_no=" + mem_no
				+ ", reg_date=" + reg_date + ", delyn=" + delyn + ", cnt=" + cnt + ", mem_name=" + mem_name + "]";
	}
	
	

}
 
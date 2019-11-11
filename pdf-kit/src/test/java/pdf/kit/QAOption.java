package pdf.kit;

import pdf.kit.util.RandomUtils;

public class QAOption {
	String idx;// A B C D
	String desc;// 选项描述

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public QAOption getOption() throws Exception{
		QAOption opt = new QAOption();
		opt.setDesc(RandomUtils.createWord());
		//opt.setIdx(RandomUtils.getNum(1, 4));
		return opt;
	}

}

package pdf.kit;

import java.util.ArrayList;
import java.util.List;

import pdf.kit.util.RandomUtils;

public class QA {
	String idx;
	String qCotent;// 问题描述
	String qAnswer;// 问题答案
	List<QAOption> opts;// 问题选项

	public String getqCotent() {
		return qCotent;
	}

	public void setqCotent(String qCotent) {
		this.qCotent = qCotent;
	}

	public String getqAnswer() {
		return qAnswer;
	}

	public void setqAnswer(String qAnswer) {
		this.qAnswer = qAnswer;
	}

	public List<QAOption> getOpts() {
		return opts;
	}

	public void setOpts(List<QAOption> opts) {
		this.opts = opts;
	}
	
	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}
	static List<String> opts1 = new ArrayList<String>();
	public static List<QA> getQASAuto() throws Exception{
		opts1.add("A");opts1.add("B");opts1.add("C");opts1.add("D");
		List<QA> data = new ArrayList<QA>();
		for(int i=1;i<30;i++){
			QA q1 = new QA();
			int ans = RandomUtils.getNum(0, 3);
			q1.setIdx(String.valueOf(i));
			q1.setqAnswer(opts1.get(ans));
			q1.setqCotent(RandomUtils.createWord());
			q1.setOpts(genOpts());
			data.add(q1);
		}
		return data;
	}
	
	public static List<QAOption> genOpts() throws Exception {
		List<QAOption> opts = new ArrayList<QAOption>();
		for(int i=1;i<=4;i++){
			QAOption option3 = new QAOption();
			option3.setDesc(RandomUtils.createWord());
			//int ans = RandomUtils.getNum(0, 3);
			option3.setIdx(opts1.get(i-1));
			opts.add(option3);
		}
		return opts;
	}

	
	
	public static List<QA> getQAS(){
		List<QA> data = new ArrayList<QA>();
		List<QAOption> opts = new ArrayList<QAOption>();
		QAOption option = new QAOption();
		option.setDesc("哈哈1");
		option.setIdx("A");
		opts.add(option);
		QAOption option1 = new QAOption();
		option1.setDesc("哈哈2");
		option1.setIdx("B");
		opts.add(option1);
		QAOption option2 = new QAOption();
		option2.setDesc("哈哈3");
		option2.setIdx("C");
		opts.add(option2);
		QAOption option3 = new QAOption();
		option3.setDesc("哈哈4");
		option3.setIdx("D");
		opts.add(option3);
		
		QA q1 = new QA();
		q1.setIdx("1");
		q1.setqAnswer("A");
		q1.setqCotent("问题描述1");
		q1.setOpts(opts);
		QA q2 = new QA();
		q2.setIdx("2");
		q2.setqAnswer("B");
		q2.setqCotent("问题描述2");
		q2.setOpts(opts);
		data.add(q1);
		data.add(q2);
		return data;
	}
}

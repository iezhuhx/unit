package pdf.kit;

import java.util.HashMap;
import java.util.Map;

import pdf.kit.component.PDFKit;
import pdf.kit.util.RandomUtils;

public class QAUtils {
	 public static void main(String[] args) throws Exception {
	
	     //散点图
	     String templatePath="D:\\chenyb\\myproject\\finally\\pdf-kit\\src\\test\\resources\\templates";
	     Map<String,Object> data = new HashMap<String, Object>();
	     data.put("qas", QA.getQASAuto());
	     data.put("clientName", RandomUtils.createWord());
	     String path= createPDF(templatePath,data,"qa.ftl");
	     System.out.println("path:"+path);
	}
	 
	 public  static String createPDF(String templatePath,Object data, String fileName){
	        //pdf保存路径
	        try {
	            //设置自定义PDF页眉页脚工具类
	            //PDFHeaderFooter headerFooter=new PDFHeaderFooter();
	            PDFKit kit=new PDFKit();
	            /* kit.setHeaderFooterBuilder(headerFooter);*/
	            //设置输出路径
	            kit.setSaveFilePath("d:/data/pdf/qa.pdf");
	            String saveFilePath=kit.exportToFile(fileName,data);
	            return  saveFilePath;
	        } catch (Exception e) {
	        	e.printStackTrace();
	            //log.error("PDF生成失败{}", ExceptionUtils.getFullStackTrace(e));
	            return null;
	        }

	    }
}

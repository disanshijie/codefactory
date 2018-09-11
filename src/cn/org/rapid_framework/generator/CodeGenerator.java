package cn.org.rapid_framework.generator;

import cn.org.rapid_framework.generator.Generator.GeneratorModel;
import cn.org.rapid_framework.generator.GeneratorFacade;

public class CodeGenerator {
	
	public static void main(String[] args) throws Exception {
		
		//createProject();
		
		addProjectMethod();
	}
	/*
	 * 新建一个项目
	 */
	public static void createProject() throws Exception {
		//模板路径
		String templatePath = "C:/Users/admin/git/codefactory/template/demo";
		GeneratorFacade g = new GeneratorFacade();
		g.getGenerator().addTemplateRootDir(templatePath);
		// 删除生成器的输出目录
		//g.deleteOutRootDir();
		// 通过数据库表生成文件
		g.generateByTable("tb_user");

		// 自动搜索数据库中的所有表并生成文件,template为模板的根目录
		// g.generateByAllTable();
		// 按table名字删除文件
		// g.deleteByTable("table_name", "template");
	}
	
	
	public static void addProjectMethod() throws Exception {
		
		//模板路径
		String templatePath = "C:\\Users\\admin\\git\\codefactory\\template\\mytemplate\\";
		GeneratorFacade g = new GeneratorFacade();
		g.getGenerator().addTemplateRootDir(templatePath);
		// 删除生成器的输出目录
		//g.deleteOutRootDir();
		
		// 自定义生成的参数
		GeneratorModel gm=new GeneratorModel();
		//gm.filePathModel.put(key, value);
		gm.templateModel.put("methodName", "addArticleAll");
		
		g.generateBy(gm);
		
	}
	
}

package cn.org.rapid_framework.generator;

import cn.org.rapid_framework.generator.GeneratorFacade;

public class CodeGenerator {
	
	public static void main(String[] args) throws Exception {
		//ģ��·��
		String templatePath = "F:/0-code-space/coderFactory/WebRoot/template";
		GeneratorFacade g = new GeneratorFacade();
		g.getGenerator().addTemplateRootDir(templatePath);
		// ɾ�������������Ŀ¼
		//g.deleteOutRootDir();
		// ͨ�����ݿ�������ļ�
		g.generateByTable("ngcs_yst");

		// �Զ��������ݿ��е����б������ļ�,templateΪģ��ĸ�Ŀ¼
		// g.generateByAllTable();
		// ��table����ɾ���ļ�
		// g.deleteByTable("table_name", "template");
	}
}

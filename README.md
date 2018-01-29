# codefactory
支持自定义模板生成代码, 弱业务下解放体力劳动

Spring SpringMVC Mybatis 模板代码生成


使用: 

1.配置 generator.xml:basepackage, namespace, outRoot,  jdbc_username, jdbc_password, jdbc_url(默认MySQL库), outRoot输出路径

2.CodeGenerator类 g.generateByTable("table表名","table表名"); 支持批量和单表 

3.main方法运行CodeGenerator类, 在配置的outRoot输出路径找到生成代码, 复制到对应项目包下. 页面${page.list}获取绑定值.
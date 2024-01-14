package com.xueqing;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Mainmain {
    public static void main(String[] args) {
        //创建对象————使其 根据数据库的表反向生成的代码
        AutoGenerator autoGenerator = new AutoGenerator();

        //对象的数据源————需要的数据对象的来源（数据库的配置）
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://gz-cynosdbmysql-grp-08gze52t.sql.tencentcdb.com:25200/db1");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("Zkd123456");
        autoGenerator.setDataSource(dataSourceConfig);

        //对象的路径--全局配置————指，上面生成的数据库代码存放的路径
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");
        globalConfig.setAuthor("admin");//写代码的人
        globalConfig.setOpen(false);//是否需要打开该路径的文件

        //对象的Service类——去掉Service的I————例如生成StudentService类,而不是StudentIService
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);

        //对象的包配置————自动创建对应的包，并且将上面生成的代码放入到对应的包中
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.xueqing");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setController("controller");
        autoGenerator.setPackageInfo(packageConfig);

        //对象的策略配置————数据库的表以及字段的处理
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("class","course","stu","tb_user","teacher");//数据库中的表
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//将下划线转成驼峰写法
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true); //是否添加Lombok的注解
        autoGenerator.setStrategy(strategyConfig);

        //对象的启动
        autoGenerator.execute();
    }
}

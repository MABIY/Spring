# spring
spring mvc set up step by step

##项目环境
       1.开发机器 --> ubuntu16.04

       2.idea 2016

       3.mysql  5.6

       4.Apache Maven 3.3.9

       5.springfox-swagger-ui

##说明
  数据库sql 在项目root 目录 data/dataBase 下

  ###MyBatis Generator With Maven  使用说明
        spring-infrastructure module 下的 resources/META-INF/mybatis-generator-configuration.xml  下把需要生成的table 写入
        生成的目录在
        数据库对应对象             /home/liuhua/project/spring/spring-domain/src/main/java/com/chinal/lh/domain/data
        DAO Interface 对象       spring/spring-infrastructure/src/main/java/com/chinal/lh/infrastructure/mapper
        DAO 对应的xml              spring/spring-infrastructure/src/main/resources/META-INF/mybatis


    ###swagger 登陆后访问　http://localhost:8080/swagger-ui.html








#### springboot热部署配置
    1.在pom.xml中增加配置
        <!--热部署配置-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
        </dependency>
    2.修改idea设置setting-->Build...-->Compile
        勾选Build project auto...
    3.Shift+Ctrl+Alt+/,选择Registry
        勾选compile.automake.allow.when.app.running
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

#### springboot中application.yml中常用key
    # QUARTZ SCHEDULER (QuartzProperties)
    spring.quartz.jdbc.initialize-schema=embedded # Database schema initialization mode.
    spring.quartz.jdbc.schema=classpath:org/quartz/impl/jdbcjobstore/tables_@@platform@@.sql # Path to the SQL file to use to initialize the database schema.
    
    spring.quartz.job-store-type=memory # Quartz job store type.
    spring.quartz.properties.*= # Additional Quartz Scheduler properties.
    
    # ----------------------------------------
    # WEB PROPERTIES
    # ----------------------------------------
    
    # EMBEDDED SERVER CONFIGURATION (ServerProperties)
    server.port=8080 # Server HTTP port.
    server.servlet.context-path= # Context path of the application.
    server.servlet.path=/ # Path of the main dispatcher servlet.
    
    # HTTP encoding (HttpEncodingProperties)
    spring.http.encoding.charset=UTF-8 # Charset of HTTP requests and responses. Added to the "Content-Type" header if not set explicitly.
    
    # JACKSON (JacksonProperties)
    spring.jackson.date-format= # Date format string or a fully-qualified date format class name. For instance, `yyyy-MM-dd HH:mm:ss`.
    
    # SPRING MVC (WebMvcProperties)
    spring.mvc.servlet.load-on-startup=-1 # Load on startup priority of the dispatcher servlet.
    spring.mvc.static-path-pattern=/** # Path pattern used for static resources.
    spring.mvc.view.prefix= # Spring MVC view prefix.
    spring.mvc.view.suffix= # Spring MVC view suffix.
    
    # DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
    spring.datasource.driver-class-name= # Fully qualified name of the JDBC driver. Auto-detected based on the URL by default.
    spring.datasource.password= # Login password of the database.
    spring.datasource.url= # JDBC URL of the database.
    spring.datasource.username= # Login username of the database.
    
    # JEST (Elasticsearch HTTP client) (JestProperties)
    spring.elasticsearch.jest.password= # Login password.
    spring.elasticsearch.jest.proxy.host= # Proxy host the HTTP client should use.
    spring.elasticsearch.jest.proxy.port= # Proxy port the HTTP client should use.
    spring.elasticsearch.jest.read-timeout=3s # Read timeout.
    spring.elasticsearch.jest.username= # Login username.
    
#### 解决idea在springboot注入时报错,但实际不影响的问题
    Setting-->Editor-->Inspections-->Spring-->Spring Core-->Code-->Autowiring for Bean Class 将Error改成warning
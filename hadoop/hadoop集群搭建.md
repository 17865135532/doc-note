##  1.准备Linux环境  
至少3台centos  
##  2.安装JDK		
##  3.安装hadoop2.4.1
	先上传hadoop的安装包到服务器上去/home/hadoop/
####  3.1配置hadoop
    修改/home/dev_environment/hadoop/hadoop-2.6.4/etc/  
    第一个：hadoop-env.sh
    vim hadoop-env.sh
    #第27行
    export JAVA_HOME=/home/dev_environment/java/java7/jdk1.7.0_45
		
	第二个：core-site.xml
		<!-- 指定HADOOP所使用的文件系统schema（URI），HDFS的老大（NameNode）的地址 -->
		<property>
			<name>fs.defaultFS</name>
			<value>hdfs://192.168.137.102:9000</value>
		</property>
		<!-- 指定hadoop运行时产生文件的存储目录 -->
		<property>
			<name>hadoop.tmp.dir</name>
			<value>/home/dev_environment/hadoop/hdpdata</value>
        </property>
		
	第三个：hdfs-site.xml   
		<!-- 指定HDFS副本的数量 -->
		<property>
			<name>dfs.replication</name>
			<value>1</value>
		</property>
		<property>
			<name>dfs.secondary.http.address</name>
			<value>192.168.137.102:50090</value>
		</property>

	第四个：mapred-site.xml (mv mapred-site.xml.template mapred-site.xml)
		mv mapred-site.xml.template mapred-site.xml
		vim mapred-site.xml
		<!-- 指定mr运行在yarn上 -->
		<property>
			<name>mapreduce.framework.name</name>
			<value>yarn</value>
		</property>
		
	第五个：yarn-site.xml
		<!-- 指定YARN的老大（ResourceManager）的地址 -->
		<property>
			<name>yarn.resourcemanager.hostname</name>
			<value>192.168.137.102</value>
		</property>
		<!-- reducer获取数据的方式 -->
		<property>
			<name>yarn.nodemanager.aux-services</name>
			<value>mapreduce_shuffle</value>
		</property>
     	
####  3.2将hadoop添加到环境变量
	
	vim /etc/proflie
		export JAVA_HOME=/usr/java/jdk1.7.0_65
		export HADOOP_HOME=/itcast/hadoop-2.4.1
		export PATH=$PATH:$JAVA_HOME/bin:$HADOOP_HOME/bin:$HADOOP_HOME/sbin

	source /etc/profile
	
####  3.3格式化namenode（是对namenode进行初始化）
    hdfs namenode -format (hadoop namenode -format)
		
####  3.4启动hadoop
    先启动HDFS
    sbin/start-dfs.sh
    
    再启动YARN
    sbin/start-yarn.sh
		
####  3.5验证是否启动成功
    使用jps命令验证
    27408 NameNode
    28218 Jps
    27643 SecondaryNameNode
    28066 NodeManager
    27803 ResourceManager
    27512 DataNode

    http://192.168.1.101:50070 （HDFS管理界面）
    http://192.168.1.101:8088 （MR管理界面）
		
##  4.配置ssh免登陆
	
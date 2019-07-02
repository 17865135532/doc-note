#安装jenkins步骤
1.运行命令（端口为8888，可以修改为其他）  
    java –jar Jenkins.war --httpPort=8888  
2.浏览器中输入http://localhost:8888/jenkins/进行访问  
#取消登陆验证
替换 /root/.jenkins/config.xml文件,其中jdk需要根据世纪情况修改  

3.原理
https://blog.csdn.net/zxd1435513775/article/details/80618640  

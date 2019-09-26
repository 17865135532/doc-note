####安装jenkins步骤
1.运行命令（端口为8888，可以修改为其他,nohup表示后台启动）  
    nohup java –jar Jenkins.war --httpPort=8888  
2.浏览器中输入http://localhost:8888/jenkins/进行访问  
####取消登陆验证（避免页面空白）
替换 /root/.jenkins/config.xml文件,其中jdk需要根据实际情况修改  
3.在浏览器中输入http://localhost:8888进行访问，即可使用
4.原理
https://blog.csdn.net/zxd1435513775/article/details/80618640  
5.解决权限问题
https://www.cnblogs.com/GXQi/p/10101172.html
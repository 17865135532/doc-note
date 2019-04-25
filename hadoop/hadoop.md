##  hdfs常用操作命令
1.删除文件夹  hdfs dfs -rm -r -f /XXX  
2.新建文件夹  hdfs dfs -mkdir /XXX  
3.上传文件到某个目录  hdfs dfs -put xxx.jpg /XXX  
4.查看文件内容  hdfs dfs -cat /XXX/xxx.jpg  
5.查看目录下所有文件  hdfs dfs -ls /XXX  

##  切换namenode命令
hdfs haadmin -failover nn1 nn2

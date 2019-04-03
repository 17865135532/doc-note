#  zookeeper集群搭建
1.在zookeeper的conf目录下新建zoo.cfg,并添加如下配置
tickTime=2000  
initLimit=10  
syncLimit=5  
dataDir=/home/zookeeper/zkdata  
dataLogDir=/home/zookeeper/zklog  
clientPort=2181  
server.1=192.168.137.101:2888:3888  
server.2=192.168.137.102:2888:3888  
server.3=192.168.137.103:2888:3888  
2.在dataDir目录下新建myid文件，添加server.x后面的x

#  zookeeper集群启动脚本
for i in 192.168.137.101 192.168.137.102 192.168.137.103  
do  
ssh $i "source /etc/profile;/home/zookeeper/zookeeper-3.4.13/bin/zkServer.sh start"  
done  


#### centos6.x上通过安装redis
    1.上传redis-5.0.5.tar.gz到/root目录
    2.解压
        cd /root
        tar -zxvf redis-5.0.5.tar.gz
    3.安装依赖环境
        yum install gcc- c++
        yum install -y tcl
    4.编译
        cd /root/redis-5.0.5
        make
    5.安装(指定bin目录,默认到/usr/local/bin目录下了,为了不让文件分散,需要指定)
        make install PREFIX=/root/redis-5.0.5
    6.修改端口和后台启动
        vim /root/redis-5.0.5/redis.conf
        修改:
        port 6388
        daemonize yes
        pidfile /var/run/redis.pid
    
    7.配置开机启动(内容见redis文本)
        vim /etc/init.d/redis
    8.启动停止redis
        service redis start
        service redis stop
    9.配置开机启动
        chkconfig redis on 
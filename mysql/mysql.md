#### centos6.x上通过yum安装mysql
    1.卸载自带mysql
        rpm -qa | grep mysql
        rpm -e --nodeps mysql-libs-5.1.71-1.el6.x86_64
    2.查看yum自带的mysql
        yum list | grep mysql
    3.安装mysql
        yum install -y mysql-server mysql mysql-devel
    4.启动mysql
        service mysqld start
    5.配置开机启动
        chkconfig mysqld on
    6.为root用户设置密码
        mysqladmin -u root password '123456'
    7.开启远程访问
        mysql -uroot -p123456
        GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY '123456' WITH GRANT OPTION;
        flush privileges;
        
#### mysql存储过程
    `DROP PROCEDURE IF EXISTS proc_initData;--如果存在此存储过程则删掉
    DELIMITER $
    CREATE PROCEDURE proc_initData()
    BEGIN
        DECLARE i INT DEFAULT 1;
        WHILE i<=10000 DO
            INSERT INTO data(user_id) VALUES(i);
            SET i = i+1;
        END WHILE;
    END $
    CALL proc_initData();`
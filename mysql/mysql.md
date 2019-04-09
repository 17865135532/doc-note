#  mysql开启远程访问
-- 创建用户、密码及权限范围 第一个 roo t为用户名 @后为适用的主机，‘%’表示所有电脑都可以访问连接，第二个 root 为密码  
mysql> GRANT ALL PRIVILEGES ON *.* TO 'root'@'192.168.0.2' IDENTIFIED BY 'root' WITH GRANT OPTION;                 
Query OK, 0 rows affected (1.57 sec)

-- 立即生效
mysql> flush privileges;
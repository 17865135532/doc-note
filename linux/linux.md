##  ssh登录 
ssh登陆  
如果本地端是Linux  
ssh root@192.168.1.1  
其中root表示的是登录用户名，192.168.1.1为主机的IP地址，当然也可以使用主机名、域名来指代IP地址。  
ssh 192.168.1.1  
则会以当前客户端的用户名进行登录。  

##  配置主机之间的免密ssh登陆
假如 A  要登陆  B  
在A上操作：  
%%首先生成密钥对  
ssh-keygen   (提示时，直接回车即可)  
%%再将A自己的公钥拷贝并追加到B的授权列表文件authorized_keys中  
ssh-copy-id   B  

##  修改centos的IP地址
1.vim /etc/sysconfig/network-scripts/ifcfg-ens33  
TYPE=Ethernet  
PROXY_METHOD=none  
BROWSER_ONLY=no  
**_BOOTPROTO=static_**  
DEFROUTE=yes  
IPV4_FAILURE_FATAL=no  
IPV6INIT=yes  
IPV6_AUTOCONF=yes  
IPV6_DEFROUTE=yes  
IPV6_FAILURE_FATAL=no  
IPV6_ADDR_GEN_MODE=stable-privacy  
NAME=ens33  
UUID=2b885cc0-c0f0-4a90-bb81-61352c5162a7  
DEVICE=ens33  
**_ONBOOT=yes  
HWADDR=00:0C:29:D5:31:78  
IPADDR=192.168.137.101  
NETMASK=255.255.255.0_**  
2.service network restart  

####  修改主机名
1.vim /etc/hostname  
2.reboot  

##  修改centos开机默认root账户  
使用root账户进入系统后，打开'/etc/gdm/custom.conf'文件，在[daemon]下添加两行：  
AutomaticLoginEnable=True  
AutomaticLogin=root  

##  文件跟踪命令
tail -f 文件名 根据文件唯一inode跟踪  
tail -F 文件名 根据文件名跟踪,用于滚动的日志记录  

##  后台服务管理
service network status   查看指定服务的状态  
service network stop     停止指定服务  
service network start    启动指定服务  
service network restart  重启指定服务  
service --status-all  查看系统中所有的后台服务  

##  系统启动级别管理
vi  /etc/inittab  
Default runlevel. The runlevels used are:  
0 - halt (Do NOT set initdefault to this)  
1 - Single user mode  
2 - Multiuser, without NFS (The same as 3, if you do not have networking)  
3 - Full multiuser mode  
4 - unused  
5 - X11  
6 - reboot (Do NOT set initdefault to this)  
id:3:initdefault:  

##  查看centos版本
cat /etc/redhat-release  

##  centos7关闭防火墙
1.firewall-cmd --state  查看防火墙状态  
2.systemctl stop firewalld.service  停止防火墙  
3.systemctl disable firewalld.service 禁止防火墙开机启动  

##  centos6关闭防火墙
1.service iptables status  查看防火墙状态  
2.service iptables stop  停止防火墙  
3.chkconfig iptables off  禁止防火墙开机启动  

##  解压缩命令
tar -zcvf my.tar aaa/  压缩  
tar -zxvf my.tar.gz  解压  

##  循环压缩文件夹脚本(参数j可以让zip包不包含文件夹)
`#!/bin/bash  
for file in *  
do  
    zip -rj $file.zip $file  
done`

##  centos自带jdk卸载
1.rpm -qa|grep java  
2.rpm -e --nodeps xxx  

##  centos安装jdk
1.解压安装包  
tar -zxvf jdk-7u45-linux-x64.tar.gz -C apps/  
2.修改环境变量  
vi /etc/profile  
在文件最后添加  
export JAVA_HOME=/root/apps/jdk1.7.0_45  
export PATH=$PATH:$JAVA_HOME/bin  
3.重新加载环境变量  
source /etc/profile  

##  scp命令
scp [参数] [原路径] [目标路径]  
两台机器IP分别为：A.104.238.161.75，B.43.224.34.73。  
在A服务器上操作，将B服务器上/home/lk/目录下所有的文件全部复制到本地的/root目录下，  
命令为：scp -r root@43.224.34.73:/home/lk /root
在A服务器上将/root/lk目录下所有的文件传输到B的/home/lk/cpfile目录下，  
命令为：scp -r /root/lk root@43.224.34.73:/home/lk/cpfile  

##  创建快捷键（最后一个参数是快捷键）
ln -s /xxx/xxx /xxx 必须都是绝对路径  

##  linux修改磁盘挂载目录
1.df  -h    查看分区情况及盘符名称  
2.mkdir  /data  
3.umount /home  
4.mount /dev/sdb3 /data  
5.vi /etc/fstab  编辑/etc/fstab里面的/home为/data  

##  解决字体缺失的问题
1.复制字体到/usr/share/fonts目录下  
2.执行命令mkfontscale  
3.执行命令mkfontdir  

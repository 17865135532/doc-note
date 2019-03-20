#  ssh登录
ssh登陆  
如果本地端是Linux  
ssh root@192.168.1.1  
其中root表示的是登录用户名，192.168.1.1为主机的IP地址，当然也可以使用主机名、域名来指代IP地址。  
ssh 192.168.1.1  
则会以当前客户端的用户名进行登录。  

#  配置主机之间的免密ssh登陆
假如 A  要登陆  B  
在A上操作：  
%%首先生成密钥对  
ssh-keygen   (提示时，直接回车即可)  
%%再将A自己的公钥拷贝并追加到B的授权列表文件authorized_keys中  
ssh-copy-id   B  

#  修改centos的IP地址
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

#  修改centos开机默认root账户  
使用root账户进入系统后，打开'/etc/gdm/custom.conf'文件，在[daemon]下添加两行：  
AutomaticLoginEnable=True  
AutomaticLogin=root  

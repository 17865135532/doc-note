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


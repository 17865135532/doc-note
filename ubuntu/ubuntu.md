##  ubuntu查看已安装软件
两种方法  
1.apt list --installed  
2.dpkg -l  

##  安装vmware后问题解决方法
1.apt-get install gcc    
2.apt-get install libcanberra*  
3.vmware-modconfig --console --install-all  

##  解决root用户部分软件启动不了的问题
1.which chromium-browser  
2.vim /usr/bin/chromium-browser  
3.输入/geteuid，输入i进入输入模式，将geteuid改成getppid  

##  实现合盖子不休眠
hibernate(休眠)、suspend(睡眠)、poweroff(关机)  
HandlePowerKey ：按下电源键后的行为  
HandleSleepKey ：按下挂起键后的行为  
HandleHibernateKey： 按下休眠键后的行为  
HandleLidSwitch： 合上笔记本盖后的行为  
1.vim /etc/systemd/logind.conf  
2.修改#HandleLidSwitch=suspend为HandleLidSwitch=ignore
3.sudo shutdown -r now  

##  开启Ubuntu系统root账户的声音
1.vim /root/.profile
2.在最后新增一行：pulseaudio --start --log-target=syslog
3.reboot

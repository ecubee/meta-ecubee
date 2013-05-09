#!/bin/sh

if [ "$1" = "" ]; then
	echo "Usage: ecubee-configure.sh <bart|gertjan|martijn>".
	exit 1
fi

if [ "$1" = "bart" -o "$1" = "gertjan" -o "$1" = "martijn" ]; then
	echo "Configuring $1"
	cp /etc/ecubee/interfaces /etc/network/interfaces
	rm -f /usr/bin/ecubee
	ln -s /usr/bin/ecubee-$1 /usr/bin/ecubee
	rm -f /etc/hostname
	ln -s /etc/ecubee/hostname-$1 /etc/hostname
#	mv /etc/pam.d/common-session /etc/pam.d/common-session.backup
#	head -n -1 /etc/pam.d/common-session.backup > /etc/pam.d/common-session
	rm -f /etc/modules-load.d/hipd.conf
	rm -f /etc/modules-load.d/rfcomm.conf
	rm -f /etc/dropbear/dropbear_rsa_host_key
	/usr/sbin/update-modules
	/usr/sbin/update-rc.d -f alsa-state remove
	/bin/systemctl enable avahi-daemon
	/bin/systemctl enable x.service
	/bin/systemctl enable ecubee.service
	ln -s /dev/null /lib/systemd/system/display-manager.service
	/usr/bin/git config --global http.sslVerify false
	echo "Configuring $1 done"
	exit 0
fi

echo "Invalid option"
exit 1




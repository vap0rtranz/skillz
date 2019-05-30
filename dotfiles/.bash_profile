#
# ~/.bash_profile
#

[[ -f ~/.bashrc ]] && . ~/.bashrc

export JAVA_TOOL_OPTIONS="${JAVA_TOOL_OPTIONS} -Xms512m -Xmx2048m"
export CHROOT=$HOME/dev/chroot
export PATH=$PATH:/home/justin/.local/bin

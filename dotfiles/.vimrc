" excellent doc here: https://dougblack.io/words/a-good-vimrc.html#wrap
filetype plugin on
filetype indent on " load filetype-specific indent files
colorscheme slate  "Changes the color scheme. See /usr/share/vim/vim*/colors/ for options.
syntax on "Enables syntax highlighting for programming languages
set number "Enables line numbering
set cursorline " highlight by underline current line
set ruler
set showmatch "Highlights matching brackets in programming languages
set smartindent  "Automatically indents lines after opening a bracket in programming languages
set backspace=2  "This makes the backspace key function like it does in other programs.
set tabstop=4 " number of spaces to display for tabs in VIEWing
set softtabstop=4  " number of spaces in tab when EDITing
set wildmenu " visual autocomplete for command menu
set hlsearch " highlight matches
set foldenable "Lets you fold (hide/roll-up) sections of code
set foldnestmax=10 " N number of nested fold max
set foldmethod=indent " method to trigger folding
set backup
set backupdir=~/.vim-tmp,~/.tmp,~/tmp,/var/tmp,/tmp
set backupskip=/tmp/*,/private/tmp/*
set directory=~/.vim-tmp,~/.tmp,~/tmp,/var/tmp,/tmp
set writebackup

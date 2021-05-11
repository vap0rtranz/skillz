set nocompatible              " be iMproved, required
filetype indent on " load filetype-specific indent files
colorscheme slate  "Changes the color scheme. See /usr/share/vim/vim*/colors/ for options.
syntax on "Enables syntax highlighting for programming languages
" for YAML editing
autocmd FileType yaml setlocal ai ts=2 sw=2 et
set number "Enables line numbering
set cursorline " highlight by underline current line
set cursorcolumn " highlight cursor with vertical bar
set ruler
set expandtab
set showmatch "Highlights matching brackets in programming languages
" set smartindent  "Automatically indents lines after opening a bracket in programming languages
set backspace=2  "This makes the backspace key function like it does in other programs.
set tabstop=2 " number of spaces to display for tabs in VIEWing
set softtabstop=2  " number of spaces in tab when EDITing
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

let SessionLoad = 1
if &cp | set nocp | endif
let s:cpo_save=&cpo
set cpo&vim
smap 	 i<BS>	
map <NL> j
map  k
nnoremap p p'[v']=
nnoremap P P'[v']=
nmap   <PageDown>
nmap ,f [I:let nr = input("Which one: ")|exe "normal " . nr ."[\t"
map ,w :x
map ,q :q!
map ,s :w
vnoremap < <gv
vnoremap > >gv 
nmap K <Plug>ManPageView
vmap [% [%m'gv``
nmap \cv <Plug>VCSVimDiff
nmap \cu <Plug>VCSUpdate
nmap \cU <Plug>VCSUnlock
nmap \cs <Plug>VCSStatus
nmap \cr <Plug>VCSReview
nmap \cq <Plug>VCSRevert
nmap \cl <Plug>VCSLog
nmap \cL <Plug>VCSLock
nmap \cg <Plug>VCSGotoOriginal
nmap \cd <Plug>VCSDiff
nmap \cc <Plug>VCSCommit
nmap \cG <Plug>VCSClearAndGotoOriginal
nmap \cn <Plug>VCSAnnotate
nmap \ca <Plug>VCSAdd
vmap ]% ]%m'gv``
vmap a% [%v]%
nmap gx <Plug>NetrwBrowseX
nmap gf :new %:p:h/<cfile>
nmap <silent> <F8> :TlistToggle
nnoremap <silent> <Plug>NetrwBrowseX :call netrw#NetBrowseX(expand("<cWORD>"),0)
nnoremap <silent> <Plug>SVNInfo :SVNInfo
nnoremap <silent> <Plug>CVSWatchRemove :CVSWatch remove
nnoremap <silent> <Plug>CVSWatchOn :CVSWatch on
nnoremap <silent> <Plug>CVSWatchOff :CVSWatch off
nnoremap <silent> <Plug>CVSWatchAdd :CVSWatch add
nnoremap <silent> <Plug>CVSWatchers :CVSWatchers
nnoremap <silent> <Plug>CVSUnedit :CVSUnedit
nnoremap <silent> <Plug>CVSEditors :CVSEditors
nnoremap <silent> <Plug>CVSEdit :CVSEdit
nnoremap <silent> <Plug>VCSVimDiff :VCSVimDiff
nnoremap <silent> <Plug>VCSUpdate :VCSUpdate
nnoremap <silent> <Plug>VCSUnlock :VCSUnlock
nnoremap <silent> <Plug>VCSStatus :VCSStatus
nnoremap <silent> <Plug>VCSReview :VCSReview
nnoremap <silent> <Plug>VCSRevert :VCSRevert
nnoremap <silent> <Plug>VCSLog :VCSLog
nnoremap <silent> <Plug>VCSLock :VCSLock
nnoremap <silent> <Plug>VCSClearAndGotoOriginal :VCSGotoOriginal!
nnoremap <silent> <Plug>VCSGotoOriginal :VCSGotoOriginal
nnoremap <silent> <Plug>VCSDiff :VCSDiff
nnoremap <silent> <Plug>VCSCommit :VCSCommit
nnoremap <silent> <Plug>VCSAnnotate :VCSAnnotate
nnoremap <silent> <Plug>VCSAdd :VCSAdd
nmap <silent> <F7> :NERDTreeToggle
nmap <silent> <F6> :set number!
imap  <Plug>Jumper
imap  
inoremap 	 =MyTabOrCompletion()
inoremap " ""i
imap ( ()i
imap [ []i
imap { {oo}v2k=ji
let &cpo=s:cpo_save
unlet s:cpo_save
set autowrite
set backspace=indent,eol,start
set completeopt=menu,longest,preview
set expandtab
set fileencodings=ucs-bom,utf-8,default,latin1
set helplang=en
set history=100
set hlsearch
set incsearch
set laststatus=2
set matchtime=2
set modelines=0
set nrformats=octal,hex,alpha
set pastetoggle=<F10>
set ruler
set scrolloff=3
set shiftround
set shiftwidth=4
set showcmd
set showmatch
set tabstop=4
set updatecount=50
set viminfo='20,\"50,:20,%,n~/.viminfo
set wildmenu
set wildmode=list:longest,full
set window=0
let s:so_save = &so | let s:siso_save = &siso | set so=0 siso=0
let v:this_session=expand("<sfile>:p")
silent only
cd ~/
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
set shortmess=aoO
badd +0 .vimrc
args .vimrc
edit .vimrc
set splitbelow splitright
set nosplitbelow
set nosplitright
wincmd t
set winheight=1 winwidth=1
argglobal
noremap <buffer> <silent> [" :call search('\%(^\s*".*\n\)\%(^\s*"\)\@!', "bW")
noremap <buffer> <silent> [] m':call search('^\s*endf*\%[unction]\>', "bW")
noremap <buffer> <silent> [[ m':call search('^\s*fu\%[nction]\>', "bW")
noremap <buffer> <silent> ]" :call search('^\(\s*".*\n\)\@<!\(\s*"\)', "W")
noremap <buffer> <silent> ][ m':call search('^\s*endf*\%[unction]\>', "W")
noremap <buffer> <silent> ]] m':call search('^\s*fu\%[nction]\>', "W")
setlocal noautoindent
setlocal autoread
setlocal nobinary
setlocal bufhidden=
setlocal buflisted
setlocal buftype=
setlocal nocindent
setlocal cinkeys=0{,0},0),:,0#,!^F,o,O,e
setlocal cinoptions=
setlocal cinwords=if,else,while,do,for,switch
setlocal comments=sO:\"\ -,mO:\"\ \ ,eO:\"\",:\"
setlocal commentstring=\"%s
setlocal complete=.,w,b,u,t,i
setlocal completefunc=
setlocal nocopyindent
setlocal nocursorcolumn
setlocal nocursorline
setlocal define=
setlocal dictionary=
setlocal nodiff
setlocal equalprg=
setlocal errorformat=
setlocal expandtab
if &filetype != 'vim'
setlocal filetype=vim
endif
setlocal foldcolumn=0
setlocal foldenable
setlocal foldexpr=0
setlocal foldignore=#
setlocal foldlevel=0
setlocal foldmarker={{{,}}}
setlocal foldmethod=manual
setlocal foldminlines=1
setlocal foldnestmax=20
setlocal foldtext=foldtext()
setlocal formatexpr=
setlocal formatoptions=croql
setlocal formatlistpat=^\\s*\\d\\+[\\]:.)}\\t\ ]\\s*
setlocal grepprg=
setlocal iminsert=0
setlocal imsearch=0
setlocal include=
setlocal includeexpr=
setlocal indentexpr=GetVimIndent()
setlocal indentkeys=0{,0},:,0#,!^F,o,O,e,=end,=else,=cat,=fina,=END,0\\
setlocal noinfercase
setlocal iskeyword=@,48-57,_,192-255
setlocal keywordprg=
setlocal nolinebreak
setlocal nolisp
setlocal nolist
setlocal makeprg=
setlocal matchpairs=(:),{:},[:]
setlocal modeline
setlocal modifiable
setlocal nrformats=octal,hex,alpha
setlocal nonumber
setlocal numberwidth=4
setlocal omnifunc=
setlocal path=
setlocal nopreserveindent
setlocal nopreviewwindow
setlocal quoteescape=\\
setlocal noreadonly
setlocal noscrollbind
setlocal shiftwidth=4
setlocal noshortname
setlocal nosmartindent
setlocal softtabstop=0
setlocal nospell
setlocal spellcapcheck=[.?!]\\_[\\])'\"\	\ ]\\+
setlocal spellfile=
setlocal spelllang=en
setlocal statusline=
setlocal suffixesadd=
setlocal swapfile
setlocal synmaxcol=3000
if &syntax != 'vim'
setlocal syntax=vim
endif
setlocal tabstop=4
setlocal tags=
setlocal textwidth=78
setlocal thesaurus=
setlocal nowinfixheight
setlocal nowinfixwidth
setlocal wrap
setlocal wrapmargin=0
silent! normal! zE
let s:l = 172 - ((41 * winheight(0) + 26) / 53)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
172
normal! 0
tabnext 1
if exists('s:wipebuf')
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20 shortmess=filnxtToO
let s:sx = expand("<sfile>:p:r")."x.vim"
if file_readable(s:sx)
  exe "source " . s:sx
endif
let &so = s:so_save | let &siso = s:siso_save
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :

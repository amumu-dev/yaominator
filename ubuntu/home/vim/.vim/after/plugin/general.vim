"
" General things that should be done at the very end, to override plugin
" settings
"

" Function to do <Tab> or completion, based on context {{{
function MyTabOrCompletion()
	let col = col('.')-1
	if !col || getline('.')[col-1] !~ '\k'
		return "\<tab>"
	else
		return "\<C-N>"
	endif
endfunction
" }}}

"function MyTabOrCompletion()
""check if at beginning of line or after a space 
"    if strpart( getline('.'), 0, col('.')-1 ) =~ '^\s*$'
"      return "\<Tab>"
"    else
"        "do we have omni completion available 
"       if &omnifunc != ''
"        "use omni-completion 1. priority 
"          return "\<C-X>\<C-O>"
"       elseif &dictionary != ''
"        " no omni completion, try dictionary completio 
"          return “\<C-K>”
"       else
"        "use omni completion or dictionary completion 
"        "use known-word completion 
"          return "\<C-N>"
"      endif
"    endif
"endfunction


"
" Map CTRL-B to snippetsEmu and use <Tab> for our smart completion
if exists('loaded_snippet')
	imap <C-B> <Plug>Jumper
endif
inoremap <Tab> <C-R>=MyTabOrCompletion()<CR>

"
" Customize taglist settings
if exists('loaded_taglist')
	let Tlist_Ctags_Cmd = "/usr/local/bin/ctags"
	let Tlist_Inc_Winwidth = 1
	let Tlist_Exit_OnlyWindow = 1
	let Tlist_File_Fold_Auto_Close = 1
	let Tlist_Enable_Fold_Column = 0
	let tlist_php_settings = 'php;c:class;d:constant;f:function'

	" map <F8> to toggle taglist window
	nmap <silent> <F8> :TlistToggle<CR>
endif

" Set CVS executable for VCSCommand plugin
if exists('loaded_VCSCommand')
	let VCSCommandCVSExec="cvs"
endif

" vim: set fdm=marker:

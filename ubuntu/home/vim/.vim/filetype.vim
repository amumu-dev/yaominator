"
" Filetype detection
"
augroup filetypedetect

	" Detect .txt as 'text'
    autocmd! BufNewFile,BufRead *.txt setfiletype text

	" Detect .phps as 'php'
	au BufRead,BufNewFile *.phps setfiletype php

    au BufNewFile,BufRead *.wiki        setf twiki
    "baf is perl  
    au BufNewFile,BufRead *.baf         setfiletype perl 
    "pig
    au BufNewFile,BufRead *.pig set filetype=pig syntax=pig 
augroup END

"
" Filetype detection
"
augroup filetypedetect

	" Detect .txt as 'text'
    autocmd! BufNewFile,BufRead *.txt setfiletype text

	" Detect .phps as 'php'
	au BufRead,BufNewFile *.phps setfiletype php

augroup END

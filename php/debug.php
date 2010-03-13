<?php
/*
 * version:$Id$ 
 * author: $Author$
 * source: $Source$
 * #!/home/y/bin/php -d memory_limit=750M -d open_basedir=
 */

function increment($a) {  
    return $a+1;  
}  
$a = 3;  
$b = increment($a);  
echo $b;  

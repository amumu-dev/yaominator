<?php
/*
 * version:$Id$ 
 * author: $Author$
 * source: $Source$
 * #!/home/y/bin/php -d memory_limit=750M -d open_basedir=
 */

$filename = 'child1.php';
$op_codes = parsekit_compile_file($filename , $errors, PARSEKIT_SIMPLE);
print_r($op_codes);


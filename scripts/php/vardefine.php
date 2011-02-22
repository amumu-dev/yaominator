<?php
/*
 * version:$Id$ 
 * author: $Author$
 * source: $Source$
 * #!/home/y/bin/php -d memory_limit=750M -d open_basedir=
 */
class Test {

protected 
    $test   = 1,
    $test2  = 2,
    $test3  = 3;

    function mytest()
    {
        echo $this->test . " , " . $this->test2 . "," . $this->test3 ."\n";
    }
}


$test = new Test();

$test->mytest();

<?php
/*
 * version:$Id$ 
 * author: $Author$
 * source: $Source$
 * #!/home/y/bin/php -d memory_limit=750M -d open_basedir=
 */

class ParentClass {
    public function __construct()
    {
        echo "I am parent class";
    }
}

class Child1 extends ParentClass {
    public function __construct()
    {
        echo "i am Child1\n";
    }

}

$child1 = new Child1();

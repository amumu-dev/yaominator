<?php

include_once './parent.php' ;

class Child1 extends ParentClass {
    public function __construct()
    {
        echo "i am Child1\n";
    }

}

$child1 = new Child1();

<?php
/*
 * version:$Id$ 
 * author: $Author$
 * source: $Source$
 */

class Test{
    public      $public ;
    protected   $protected ;
    private     $private ;

    public function public_func()
    {
    
    }
   
    protected function protected_func()
    {
    
    }
   
    private function private_func()
    {
    
    }
}

$testReflector = new ReflectionClass('Test');

echo "methods -- \n";
echo print_r($testReflector->getMethods());

echo "properties -- \n";
echo print_r($testReflector->getProperties());

?>


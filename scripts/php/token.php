<?php
/*
 * version:$Id$ 
 * author: $Author$
 * source: $Source$
 * #!/home/y/bin/php -d memory_limit=750M -d open_basedir=
 */

$filename = "./A.php";
$content = file_get_contents($filename);
$aTokens = token_get_all( $content );

$iNumtokens = count( $aTokens );
for( $i = 0; $i < $iNumtokens; $i++ )
{

    switch( $aTokens[ $i ][ 0 ]  )
    {
    case T_CLASS:
    case T_INTERFACE:
        $i += 2; //skip the whitespace token
        $aDeclarations[ $aTokens[ $i ][ 1 ] ] = $sName;
        break;
    }
}


print_r( $aDeclarations);

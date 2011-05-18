use strict;
use warnings;
use ExtUtils::MakeMaker;

WriteMakefile(
    NAME                => 'GlobalMedia::Tools',
    AUTHOR              => 'Jiqing Yao <jiqingyao@gmail.com>',
    VERSION_FROM        => 'lib/GlobalMedia/Tools.pm',
    ABSTRACT_FROM       => 'lib/GlobalMedia/Tools.pm',
    PL_FILES            => {},
    PREREQ_PM => {
        'Test::More' => 0,
        'version'    => 0,
    },
    dist                => { COMPRESS => 'gzip -9f', SUFFIX => 'gz', },
    clean               => { FILES => 'GlobalMedia-Tools-*' },
);

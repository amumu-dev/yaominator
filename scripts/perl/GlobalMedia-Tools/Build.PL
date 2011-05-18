use strict;
use warnings;
use Module::Build;

my $builder = Module::Build->new(
    module_name         => 'GlobalMedia::Tools',
    license             => 'perl',
    dist_author         => 'Jiqing Yao <jiqingyao@gmail.com>',
    dist_version_from   => 'lib/GlobalMedia/Tools.pm',
    requires => {
        'Test::More' => 0,
        'version'    => 0,
    },
    add_to_cleanup      => [ 'GlobalMedia-Tools-*' ],
);

$builder->create_build_script();

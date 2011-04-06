#
#===============================================================================
#
#         FILE:  Point.pm
#
#  DESCRIPTION:  Point pm
#
#        FILES:  ---
#         BUGS:  ---
#        NOTES:  ---
#       AUTHOR:  Jiqing Yao (), jqyao@yahoo-inc.com
#      COMPANY:  Yahoo! Inc
#      VERSION:  1.0
#      CREATED:  03/01/2011 11:58:33
#     REVISION:  ---
#===============================================================================
package Point ;

use strict;
use warnings;

sub new {
    my $invocant = shift ;
    my $class = ref($invocant) || $invocant ;
    my $self = {@_} ;

    bless( $self , $class );
    return $self;
}


sub _set_context {
    my	( $self ,  )	= @_;
    return ;
}	# ----------  end of subroutine _set_context  ----------

1;

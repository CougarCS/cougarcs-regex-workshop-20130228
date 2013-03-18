#!/usr/bin/env perl

use strict;
use warnings;

my @inputs = ('regular expression', 'regex', 'regexp', 'not matching string');
for my $input (@inputs) {
	print "\"$input\": ";
	if( $input =~ /reg(ular expression|exp?)/ ) {
		print "matched\n";
		print "\tcaptured: $1\n";
	} else {
		print "did not match\n";
	}
}

print "-=-=-=-\n";

my $array = [ split /\s+/, "my string\t\twith  spaces" ];

#use DDP; p $array; # This uses the Data::Printer module
for my $item (@$array) {
	print "\"$item\"\n";
}

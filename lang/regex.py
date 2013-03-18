#!/usr/bin/python
import re
import sys

inputs = [ 'regular expression', 'regex', 'regexp', 'not matching string' ];
for input in inputs:
	m = re.search('reg(ular expression|exp?)', input)
	sys.stdout.write('"' + input + '"' + ": ")
	if m:
		print "matched"
		print "\tcaptured: " +m.group(1)
	else:
		print "did not match"

print "-=-=-=-"

split_words = re.split("\\s+", "my string\t\twith  spaces")
#split_words = re.split("[,:]", "comma,colon:separated values")
print split_words


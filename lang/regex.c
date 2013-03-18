#include <stdlib.h>
#include <string.h>
#include <regex.h>
#include <stdio.h>

/*
 * man 3 regex
 * man 7 regex
 */

int main ()
{
	int rc, str_id;

	char* strings[] = { "regular expression", "regex", "regexp", "not matching string" };
	char* regex = "reg(ular expression|exp?)";

	regex_t * myregex = calloc(1, sizeof(regex_t));
	if (NULL == myregex) {
		return 1;
	}
	/* Compile the regular expression */
	rc = regcomp( myregex, regex, REG_EXTENDED );
	/* Should check the return code */
	if(rc) { /* exit if not 0 */
		exit(1);
	}

	for(str_id = 0 ; str_id < 4; str_id++) {
		printf("\"%s\": ", strings[str_id]);
		if (0 == regexec(myregex, strings[str_id], 0 , 0 , 0 ) ) {
			printf("matched\n") ;
			/*printf("\tcaptured: %s\n") ;*/
		} else {
			printf("did not match\n");
		}
	}

	free(myregex);
	return 0;
}

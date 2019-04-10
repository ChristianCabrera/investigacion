# include  <stdio.h>

main () {
int matriz [ 6 ] [ 6 ];
matriz [ 1 ] [ 1 ] = - 9 , matriz [ 1 ] [ 2 ] = - 9 , matriz [ 1 ] [ 3 ] = - 9 , matriz [ 1 ] [ 4 ] = 1 , matriz [ 1 ] [ 5 ] = 1 , matriz [ 1 ] [ 6 ] = 1 ;
matriz [ 2 ] [ 1 ] = 0 , matriz [ 2 ] [ 2 ] = - 9 , matriz [ 2 ] [ 3 ] = 0 , matriz [ 2 ] [ 4 ] = 4 , matriz [ 2 ] [ 5 ] = 3 , matriz [ 2 ] [ 6 ] = 2 ;
matriz [ 3 ] [ 1 ] = - 9 , matriz [ 3 ] [ 2 ] = - 9 , matriz [ 3 ] [ 3 ] = - 9 , matriz [ 3 ] [ 4 ] = 1 , matriz [ 3 ] [ 5 ] = 2 , matriz [ 3 ] [ 6 ] = 3 ;
matriz [ 4 ] [ 1 ] = 0 , matriz [ 4 ] [ 2 ] = 0 , matriz [ 4 ] [ 3 ] = 8 , matriz [ 4 ] [ 4 ] = 6 , matriz [ 4 ] [ 5 ] = 6 , matriz [ 4 ] [ 6 ] = 0 ;
matriz [ 5 ] [ 1 ] = 0 , matriz [ 5 ] [ 2 ] = 0 , matriz [ 5 ] [ 3 ] = 0 , matriz [ 5 ] [ 4 ] = - 2 , matriz [ 5 ] [ 5 ] = 0 , matriz [ 5 ] [ 6 ] = 0 ;
matriz [ 6 ] [ 1 ] = 0 , matriz [ 6 ] [ 2 ] = 0 , matriz [ 6 ] [ 3 ] = 1 , matriz [ 6 ] [ 4 ] = 2 , matriz [ 6 ] [ 5 ] = 4 , matriz [ 6 ] [ 6 ] = 0 ;
	printf ( " % d " , (matriz [ 1 ] [ 1 ]) + (matriz [ 1 ] [ 2 ]) + (matriz [ 1 ] [ 3 ]) + (matriz [ 2 ] [ 2 ]) + (matriz [ 3 ] [ 1 ]) + (matriz [ 3 ] [ 2 ]) + (matriz [ 3 ] [ 3 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 1 ] [ 2 ]) + (matriz [ 1 ] [ 3 ]) + (matriz [ 1 ] [ 4 ]) + (matriz [ 2 ] [ 3 ]) + (matriz [ 3 ] [ 2 ]) + (matriz [ 3 ] [ 3 ]) + (matriz [ 3 ] [ 4 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 1 ] [ 3 ]) + (matriz [ 1 ] [ 4 ]) + (matriz [ 1 ] [ 5 ]) + (matriz [ 2 ] [ 4 ]) + (matriz [ 3 ] [ 3 ]) + (matriz [ 3 ] [ 4 ]) + (matriz [ 3 ] [ 5 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 1 ] [ 4 ]) + (matriz [ 1 ] [ 5 ]) + (matriz [ 1 ] [ 6 ]) + (matriz [ 2 ] [ 5 ]) + (matriz [ 3 ] [ 4 ]) + (matriz [ 3 ] [ 5 ]) + (matriz [ 3 ] [ 6 ]));
		printf ( " \ n " );
	printf ( " % d " , (matriz [ 2 ] [ 1 ]) + (matriz [ 2 ] [ 2 ]) + (matriz [ 2 ] [ 3 ]) + (matriz [ 3 ] [ 2 ]) + (matriz [ 4 ] [ 1 ]) + (matriz [ 4 ] [ 2 ]) + (matriz [ 4 ] [ 3 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 2 ] [ 2 ]) + (matriz [ 2 ] [ 3 ]) + (matriz [ 2 ] [ 4 ]) + (matriz [ 3 ] [ 3 ]) + (matriz [ 4 ] [ 2 ]) + (matriz [ 4 ] [ 3 ]) + (matriz [ 4 ] [ 4 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 2 ] [ 3 ]) + (matriz [ 2 ] [ 4 ]) + (matriz [ 2 ] [ 5 ]) + (matriz [ 3 ] [ 4 ]) + (matriz [ 4 ] [ 3 ]) + (matriz [ 4 ] [ 4 ]) + (matriz [ 4 ] [ 5 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 2 ] [ 4 ]) + (matriz [ 2 ] [ 5 ]) + (matriz [ 2 ] [ 6 ]) + (matriz [ 3 ] [ 5 ]) + (matriz [ 4 ] [ 4 ]) + (matriz [ 4 ] [ 5 ]) + (matriz [ 4 ] [ 6 ]));
		printf ( " \ n " );
	printf ( " % d " , (matriz [ 3 ] [ 1 ]) + (matriz [ 3 ] [ 2 ]) + (matriz [ 3 ] [ 3 ]) + (matriz [ 4 ] [ 2 ]) + (matriz [ 5 ] [ 1 ]) + (matriz [ 5 ] [ 2 ]) + (matriz [ 5 ] [ 3 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 3 ] [ 2 ]) + (matriz [ 3 ] [ 3 ]) + (matriz [ 3 ] [ 4 ]) + (matriz [ 4 ] [ 3 ]) + (matriz [ 5 ] [ 2 ]) + (matriz [ 5 ] [ 3 ]) + (matriz [ 5 ] [ 4 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 3 ] [ 3 ]) + (matriz [ 3 ] [ 4 ]) + (matriz [ 3 ] [ 5 ]) + (matriz [ 4 ] [ 4 ]) + (matriz [ 5 ] [ 3 ]) + (matriz [ 5 ] [ 4 ]) + (matriz [ 5 ] [ 5 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 3 ] [ 4 ]) + (matriz [ 3 ] [ 5 ]) + (matriz [ 3 ] [ 6 ]) + (matriz [ 4 ] [ 5 ]) + (matriz [ 5 ] [ 4 ]) + (matriz [ 5 ] [ 5 ]) + (matriz [ 5 ] [ 6 ]));
		printf ( " \ n " );
	printf ( "   % d " , (matriz [ 4 ] [ 1 ]) + (matriz [ 4 ] [ 2 ]) + (matriz [ 4 ] [ 3 ]) + (matriz [ 5 ] [ 2 ]) + (matriz [ 6 ] [ 1 ]) + (matriz [ 6 ] [ 2 ]) + (matriz [ 6 ] [ 3 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 4 ] [ 2 ]) + (matriz [ 4 ] [ 3 ]) + (matriz [ 4 ] [ 4 ]) + (matriz [ 5 ] [ 3 ]) + (matriz [ 6 ] [ 2 ]) + (matriz [ 6 ] [ 3 ]) + (matriz [ 6 ] [ 4 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 4 ] [ 3 ]) + (matriz [ 4 ] [ 4 ]) + (matriz [ 4 ] [ 5 ]) + (matriz [ 5 ] [ 4 ]) + (matriz [ 6 ] [ 3 ]) + (matriz [ 6 ] [ 4 ]) + (matriz [ 6 ] [ 5 ]));
		printf ( " , " );
	printf ( " % d " , (matriz [ 4 ] [ 4 ]) + (matriz [ 4 ] [ 5 ]) + (matriz [ 4 ] [ 6 ]) + (matriz [ 5 ] [ 5 ]) + (matriz [ 6 ] [ 4 ]) + (matriz [ 6 ] [ 5 ]) + (matriz [ 6 ] [ 6 ]));
		printf ( " \ n \ n \ t " );
}

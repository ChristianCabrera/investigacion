conexion(d,h,4).
conexion(h,f,9).
conexion(i,f,11).
conexion(f,a,8).
conexion(a,b,4).
conexion(f,g,10).
arista(X):-conexion(X,_,_).
costo(X,Z,Y,Costo):-
    conexion(X,Y,Costo1),
    conexion(Y,Z,Costo2),
    Costo is Costo1+Costo2.


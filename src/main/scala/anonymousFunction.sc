/**
  * FUNCIONES ANONIMAS
  * estas funciones no llevan nombre pero a partir de sus
  * parametros de entrada genera una salida, por lo general
  * se usa dentro de maps y filter para realizarle alguna
  * opercaion o filtro a una coleccion
  * */
(a:Int, b:Int)=>a+b

/***
  * Esto pense que invocaba la funcion por defecto al pasar
  * dos parámetos pero no estas funciones anonimas se realizan al interior de
  * otra funcion
  */
println(s"el resultado de la suma es ${(3,5)}")
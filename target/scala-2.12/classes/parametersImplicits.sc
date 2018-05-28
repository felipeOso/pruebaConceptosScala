

/***
  * PARAMETROS IMPLICITOS
  *  cuando en una funcion se llaman valores implicitos
  *  estos deben ser declarados implicitamente es decir
  *  se debe tener su valor implicito ya indicado
  */

implicit  val b= 3

/**
  * aqui se tiene un valor implicito que se va utilizar
  * en la funcion sumar y como se observa ya se tiene
  * especificado el valor implicito de b que es 3; por lo tanto
  * cuando se llama la funcion sumar solo se le pasa un parametro
  * */
def sumar(a:Int)(implicit b:Int):Int =a+b

val x =sumar(2)
println("la suma es "+ x)
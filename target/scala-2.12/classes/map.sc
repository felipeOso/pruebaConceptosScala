

val numList = List(1,2,3,5)

/**
  * Esto me genera  un nuevo map es decir una nueva lista
  * con cada una de los parametros al cuadrado a partir
  * de lla utilizacion de map, que lo que es mapearme
  * una lista generando otra lista con la funcion
  * que se  le pase al map
  */

val nuevoMap:List[Int] =numList.map( x => x*x)

//lo mismo sin indicar el tipo de retorno tambien funciona
val nuevoMap1 =numList.map( x => x*x)


case class Persona(name:String, age:Int, role: Option[String])






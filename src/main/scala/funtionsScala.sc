/**
  * FUNCIONES EN SCALA
  * en esta parte se muestra las doferentes formas de
  * declarar funciones en scala junto con sus valores
  * de retorno
  * */

def sumar (a:Int, b:Int):Int= {
  a+b
}
sumar(3,4)

/**
  * En esta funcion no se señala el tipod e retorno
  * ya que el sistema es capaz de inferir el tipo
  * de retorno*/
def sumar1 (a:Int, b:Int)= a+b
sumar1(3,4)

/**
  * Cuando se utiliza la palabra return es necesario
  * indicar el tipo de variable que se  retorna al momento
  * de definir la funcion o metodo, si no
  * se señala este, dara error*/

def sumar2 (a:Int, b:Int):Int= {return a+b}
sumar2(3,6)

/**
  * Cuando no se tiene return en el metodo o funcion
  * este retornara el valor que encuentre antes de cerrar
  * las llaves, por ejemplo se llama la funcion sumar con 3 y 4
  * que daria la suma 7 pero como la linea antes de cerrar las
  * llaves se le esta sumando 1 al resultado de la suma
  * la salida de la funcion sumar3 sera el resultado de la suma +1
  * en este caso seria 8
  * */
def sumar3 (a:Int, b:Int) = {
  var resultado = a+b
  val y: Unit =resultado +=1
  //  resultado
}
val z =sumar3(3,4)
println(s"la summa es ${z}")
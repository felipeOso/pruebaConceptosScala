/**
  *CONVERSIONES IMPLICITAS
  * las conversiones implicityas se usan para convertir
  * un elemento de un tipo a otro
  * */

val num = 10
//esta variable num2 ezs un String
val num2= "20"

implicit def str2Int(str:String)= str.toInt

val multiplicacion = num*num2
println("la multiplicacion es"+multiplicacion)
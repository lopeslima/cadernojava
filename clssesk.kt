fun main(args: Array<String>) {
  class Carro {
  var marca = ""
  var modelo = ""
  var ano = 0
} 
  // Criar um objeto(instanciar)
  val fuca = Carro()

// Access the properties and add some values to it
  fuca.marca = "Wolks"
  fuca.modelo = "Fusca"
  fuca.ano = 1975
  

  println(fuca.marca)   // Mostra Wolks
  println(fuca.modelo)   // Mostra Fusca
  println(fuca.ano)    // Mostra 1975

  //instanciar outro carro e imprimir os atributos

  val car = Carro()

  car.marca = "BMW"
  car.modelo = "X5"
  car.ano = 1999
  

  println(car.marca)   // Mostra BMW
  println(car.modelo)   // Mostra X5
  println(car.ano)    // Mostra 1999
}
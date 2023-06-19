//inportar a biblioteca matematica para fazer raiz
import kotlin.math.*
//criar a função principal main
fun main(){
  //pedir para usuaria digitar os numeros
  println("Calculo das raizes de uma equação do segundo grau")
  println("ax²+bx+c=0")
  println("Digite o coficiente de a: ")
  var num1=readLine()!!
  println("Digite o coficiente de b: ")
  var num2=readLine()!!
  println("Digite o coficiente de c: ")
  var num3=readLine()!!
  //exebir numeros digitados
  println("Você digitou a: "+num1+",b"+num2+",c:"+num3)
  //os numeros digitados são do tipo String, transformar em Double
  var a=num1.toDouble()
  var b=num2.toDouble()
  var c=num3.toDouble()

  println("numeros do tipo Double-> a:"+a+ ",b:"+b+" ,c:" +c)
  //calculo de delta
  var delta=b*b-(4*a*c)
  println("O delta é:"+delta)
  var raizdelta=sqrt(delta)
  println("A raiz de delta é:"+raizdelta)
  //calculo x1


  //calculo x2





  
}
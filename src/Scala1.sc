import scala.concurrent.Future.never.value

// Values are immutable
// immutable are never change the values
// you  need you can create on more  collection
val hello= "hai"

//values are mutable
//mutable collection are can be update and extended in place
//this means you can change add or remove elements of a collection

var helloThere = hello
helloThere = hello + "There!"
println(helloThere)

//Data types
val numberOne =1
val truth = true
val letterA = 'a'
val pi = 3.151032
val piSinglePrecisionn = 3.151032f
val bigNumber = 123456789
val  smallNumber = 127
println("Here is a mess: "+ numberOne + truth + letterA + pi + bigNumber)
// Display the value of after . 3numbers
println(f"pi  is about  $piSinglePrecisionn%.3f")
//Display the value of defore the number 4 Zeros
println(f"Zero padding on the left :$numberOne%05d")
//print the addition value
println(s"${1+2}")
//Print the sentence
val theUltimateAnswer = "to life , the universe , and everything is 33."
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)


//Booleans
val isGreater = 1>2
val isLessser = 1<2

val picard = "Picard"
val bestCaptain = "Picard"
val isBest = picard == bestCaptain

//EXESICES
//Write some code that takes the value of pi, doubles it, and then prints it within a string with
//three decimal places of precision to the right.
val pi = 33333
println(s"double of the value: ${pi+pi}")
println(f"padding left 3dec: $pi%03d")
println(f"Zero padding on the left :$pi%09d")

var pa = 33
pa = 33 + 55
  println(pa)
val oldadd = "123 main"
val regex = "[1]".r
val add = regex.replaceAllIn("[123 main]", "333main")
println(add)









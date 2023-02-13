//flow control

//if /else
if(1>3) println("praveen") else println("kumar")
if(1>3){
  println("praveen")
  println("anu")
}
else println("kumar")

//matching
val number = 3
number match{
  case 1 => println("one")
  case 2 => println("two")
  case 3 => println("three")
  case _ => println("Something else")


}
val number = 5
number match{
  case 1 => println("one")
  case 2 => println("two")
  case 3 => println("three")
  case _ => println("Something else")


}
//for loops
for(x<- 1 to 4){
  val squared = x * x
  println(squared)

}
var x=10
while (x>=0){

  println(x)
  x -=1
}

//Do-while
x=0
do{
  println(x)
  x+=1
}while (x<=10)

//Expressions

val x=10; x+20
println({val x=10; x+30})

//exersice
//write some code that prints out the first 10 values of the fibonacci sequence
// This is sequence where every number is the sum of the two numbers before it.
//So the result should be 0,1,1,2,3,5,8,13,21,34

def fib(n:Long):Long =if(n<2) 1 else fib(n-1)+fib(n-2)
println(fib(1))
println(fib(1))
println(fib(2))
println(fib(3))
println(fib(4))
println(fib(5))
println(fib(6))
println(fib(7))
println(fib(8))

def fibLoop(n:Int):Int ={
  if(n<2) 1
  else {
  var (a,b) =(1,1)
var c =a+b
    for(i<-2 to n) {
      a=b
      b=c
      c=c+b
    }
  }
  }
println(fib(1))
println(fib(1))
println(fib(2))
println(fib(3))
println(fib(4))
println(fib(5))
println(fib(6))
println(fib(7))
println(fib(8))

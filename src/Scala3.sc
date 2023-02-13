// Functions

// format def <function name>(parameters name : type...) : return type = {}
// Tredetional functions
def squareIt(x:Int) : Int = {

  x*x
}
def cubeIt(x:Int) : Int = {x*x*x}
println(squareIt(2))
println(cubeIt(3))



def tt(x:Int, f: Int => Int): Int = {

  f(x)
}
val result = tt(2, cubeIt)
println(result)

tt(3,  x => x*x*x)

tt(10, x=> x/2)
tt (2, x=> {val y = x *2 ; y*y })

// exerice
// Strings have a built in .ToUpperCase Method for: example "foo".Uppercase gives you bak FOO.
//Write a function that converts a string to upper case , and use that function of a few test string.
//then do the same thing using a function literal instead of a separate, named function

//def change(s:String): String ={
//
//
//}
val tt= "hello"
tt.toUpperCase
def mk = "foo"
mk.toUpperCase()


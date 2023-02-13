//Data Structures

//Tuples
//Immutable lists
val captianStuff =("Picard","Enterpride-D","NCC-1701-D")
println(captianStuff)
// Refer to the individual fields with a ONE-BASED index
println(captianStuff._1)
println(captianStuff._2)
println(captianStuff._3)

val picardsShip =  "Picard" -> "Enterprise-D"
println(picardsShip._2)

//lists
// like a tuple but more functionality
//Must be of dame type
val shipList=List("kumar","una","kumuna")
println(shipList)
println(shipList(1))
println(shipList(2))
// zero based
println(shipList.head)
println(shipList.tail)
//sublist
for (ship<- shipList){println(ship)}
// reverse the ship names
val backwordShip = shipList.map((ship:String)=>{ship.reverse})
for (ship <- backwordShip){println(ship)}
// reduce()  to combine together all the items in a collection using some function
val numberList = List(1,2,3,4,5)
val sum = numberList.reduce((x:Int,y:Int)=> x*y)
println(sum)

//filter() remove stuff
val ih = numberList.filter((x:Int) => x !=5)
// Eassy way to filter
val ih = numberList.filter((_ !=3))

//concatenate lists

val moreNumbers = List(6,7,8)
val lotsofnumbers = numberList ++ moreNumbers
val reversed = numberList.reverse
val sorted = reversed.sorted
val reversed = lotsofnumbers.reverse
val sorted = reversed.sorted
val lostofduplicate = numberList ++ numberList
val sis = lostofduplicate.distinct
val maxValue = numberList.max
val total = numberList.sum
val total = numberList.min
val has = ih.contains(1)

//MAPS
val shipMap = Map("kirk"->"enterprise", "picard"-> "enterprise-D","sisko"->"deep space nine" ,"janeway"->"voyager")
println(shipMap("janeway"))
println(shipMap.contains("archer"))
val archersShip = util.Try(shipMap("archer")) getOrElse "unknown"
println(archersShip)
//EXERCISE
//create a list(1-20); youur job is print out numbers that are evenly divisible by 3.(scala's
//modula operator, like other languages, is % , which gives you the remainder after division. For Example, 9%3=0
//because 9 is evenly divisible by 3) Do this first by iterating through all the items in the list and testing each
//one as you go. then, do it again by using a filter function on the list instead.
//val numbers= List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
//if(numbers %3 ==0)
//println (numbers + " ")
//def getListofElements(): List[] ={
//  val list =List()
//  for ( i <- 1 to 20 if i%3 ==0 )yield i
//
//}
def getListofElements(): IndexedSeq[Int] ={
  val list =List()
  for ( i <- 1 to 20 if i%3 ==0 )yield i
}








import java.lang.Exception

fun main(){
//    var mehdi:Int=10
//    var test1:Char ='m'
//    var a=3
//    var b= 3L // means the long number
//    var c=1.1 // double
//    var d = 1.11f // float
//    var e = true // boolean
//    var a = "heloow "   ==> have the upercase , lower case

    // ----

    //val a = 10 * 10 // + , - , * , / , %
    //val a = 3F / 4F  // show the float
//    println("the num is $a")

    //------

//    var imMehdi = true
//    var test = true
//    var all = test && imMehdi //  && , || , == , != , ! -> not
//    println(all)

    // -----

//    if (true){
//
//    }else if (true){
//
//    }else{
//
//    }
//
//    val test = if (1 == 2 )2 else 3 //  its kind of the if condition

    // ----------

    /*
    the important point is =>   '?' is null-abel
                                '!' is im sure its not null
    example:
        val test:Int? = null ==> means -> the test can be null
     */

//            //  set the defalt value => in this way we avoiding to set the null
//    val num1 = readLine() ?:"0"
//    val num2 = readLine() ?:"0"
//    val  result = num1.toInt() + num2.toInt() //  we can use !! to say = im sure is not null  but better to set the defualt value
//    print(result)


    // ----------
//    var test = List<String>(2 , {"awd"})  // ==> its the array=> not usefull
//    val test = mutableListOf("a" , "b")
//    test.add("awd")
//    test[1]

                // --- loop num 1 ---

//    var counter = 0
//    while (counter<test.size){
//        println(test[counter])
//        counter++
//    }

                // ---- loop num 2-1 ----

//    for (item in test)
//        println(item)

    // ---- loop num 2-2 ----

//    for (i in 1..100)//  this means => 1 to 100
//        println(i)

//    for( i in 1 until 100){ //  this means => 1 to 99
//        print(i)
//    }
//
//    for (i in 0..100 step 2) // this means 0 , 2, 4, 6,....

    // ---------  something like the switch case

//    val test = 3
//    when(test){
//        //-> {} availeable for all
//        in 1..10 -> println("in reange 1 up to 10") //  thie means -> if test in reange the 1 to 10  do this line
//        in 10..12 -> println("in reange 11 up to 12") //  thie means -> if test in reange the 11 to 12  do this line
//        in 13..15->{
//            println("qqq")
//        }
//        else -> print("nnon") // its the else
//
//    }

    // ------ fun
//    var  test = test1() // ==> test1(number = 10)  == test1(10)
//
//    val a = 3
//    var odd =a.isOdd()


    //      ---------------- oop and classes

//    val abood = Dog("abood")
//    abood.brank()
//
//    val cat = Cat("test")
//    cat.sound()

    // ----------- anonymous class

//    val  cat = object : animal("cat"){
//        override fun sound() {
//            println("meow!!!!!")
//        }
//    }


    // --- --- exeption
//
//    var number = readLine() ?: "0"
//    val parseNumber = try {
//        number.toInt()
//    }catch (e:Exception){
//        0
//    }
//    println(parseNumber)
//
//    try {
//        println(number.toInt())
//    }catch (e:Exception){
//        println(0 )
//    }

    // static class
    Static.name //  this is the static
    Static.test()


}

// ----- lamda fun

//fun List<String>.counter(function:(String) -> Boolean):Int{
//   var counter =0
//    for (item in this)
//        if (function(item))
//            counter++
//    return counter;
//
//}
//
//fun <T>List<T>.counterGeneric(function:(T) -> Boolean):Int{
//    var counter =0
//    for (item in this)
//        if (function(item))
//            counter++
//    return counter;
//
//}

        // --------  fun
//fun heloo(){
//
//}
//
//fun test1(number:Int = 10):Boolean{  // test is the int and if i dont set it => defalt value in 10   /// Priority is with no defalt value
//    return false
//}
//fun Int.isOdd():Boolean{
//    return false;
//}

//fun add(num1:Int , num2:Int) = num1 + num2  // this will return the num1 + num2
open class Animal(val name:String , val Legs:Int = 4) { // legs is set as defalt   // if use var||val before the name this convert to property means => can use them in your class

    init {
        println("hellow im $name")
    }

}
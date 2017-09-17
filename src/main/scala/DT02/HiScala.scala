package DT02

/**
  * @author 姚啸威 2017-09-17 12:19
  *
  */
class HiScala1 {
    private var name ="Spark"
    def sayName(){println(name)}
    def getName = name
}
class HiScala2 {
    var name ="Spark"
    def sayName(){println(name)}
    def getName = name
}
class Person1 {
    private var myName ="Flink"
    def name = this.myName
    /**"name_=(" 必须连接 否则报错*/
    def name_=(newName : String): Unit ={
        myName = newName
        println("Hi:"+myName)
    }
}
class Person2 {
    private var myName ="Flink"
    def name = this.myName
    /**"name_=(" 必须连接 否则报错*/
    def update(newName : String): Unit ={
        myName = newName
        println("Hi:"+myName)
    }
}

class Person3 {
    private var myName = "Flink"
    def name = this.myName
    /** "name_=(" 必须连接 否则报错 */
    def update(newName: String): Unit = {
        myName = newName
        println("Hi:" + myName)
    }
    def talk(p:Person3): Unit ={
        println("Hello!!!"+p.name)
    }
}
class Person4{
    private[this] var name = "Flink"
    /** "name_=(" 必须连接 否则报错 */
    def update(newName: String): Unit = {
        println("Hi:"+name)
    }
    def talk(p:Person4): Unit ={
//        println("Hello!!!"+p.name)//Error:(55, 30) value name is not a member of DT02.Person4
    }
}
class Person5{
    var name = "Flink"
    var age = 0
    def this(name:String){
        this()
        this.name = name
    }
    def this(name:String,age:Int){
        this(name)
        this.age = age
    }
}


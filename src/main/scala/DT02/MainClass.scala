package DT02

/**
  * @author 姚啸威 2017-09-17 12:13
  *
  */
object MainClass {

    def main(args: Array[String]): Unit = {
        test8
    }
    /**1.private 属性调用*/
    def test1(): Unit ={
        val scal1 = new HiScala1
        scal1.sayName()
        println(scal1.getName)
//        println(scal1.name)
        /**编译报错,private 标识属性不能直接调用*/
    }
    /**2.去掉 private 属性调用*/
    def test2(): Unit ={
        val scal2 = new HiScala2
        scal2.sayName()
        println(scal2.getName)
        println(scal2.name)
    }
    /**3.在有private的基础上 修改重写 set 方法*/
    def test3(): Unit ={
        val scal3 = new Person1
        println(scal3.name)
        scal3.name = "spark"
        println(scal3.name)
    }
    /**4.只暴露 get方法 set 只能自己内部使用*/
    def test4(): Unit ={
        val scal4 = new Person2
        println(scal4.name)
        scal4.update("spark")
        println(scal4.name)
    }
    /**5-6.说明了使用了 private[this] 只能当前对象使用属性，其他对象使用报错*/
    def test5(): Unit ={
        val scal1 = new Person3
        val scal2 = new Person3
        scal1.talk(scal2)
    }
    def test6(): Unit ={
        val scal1 = new Person4
        val scal2 = new Person4
        scal1.talk(scal2)
    }
    def test7(): Unit ={
        val scal1 = new Person4
        val scal2 = new Person4
        scal1.update("scal2")
    }

    def test8(): Unit ={
        val scal1 = new Person5("yao",12)
        println(scal1.name)
        println(scal1.age)
    }
}

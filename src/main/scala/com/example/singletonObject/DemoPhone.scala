package com.example.singletonObject

class DemoPhone (
  val user: String,
  val num: Int){
  println("traditional:"+user+"'s number is "+num)
  println(s"new way:$user's number is $num")
}

object DemoPhone extends App {
  var phone1: DemoPhone=new DemoPhone ("Jim",12345)

  object CellPhone extends DemoPhone("Tom",1234)

}

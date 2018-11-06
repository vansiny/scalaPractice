package com.example.singletonObject

class DemoPhone (
  private val user: String,
  private val num: Int){
  println("traditional:"+user+"'s number is "+num)
  println(s"new way:$user's number is $num")

  //companion class can visit private member of companion object
  def getName = DemoPhone.user
}

object DemoPhone extends App {
  private val user:String = "Mike"
  var phone1: DemoPhone=new DemoPhone ("Jim",12345)
  //companion object can access private member of companion class
  println(phone1.num)
  println(phone1.getName)

  object CellPhone extends DemoPhone("Tom",1234)

}

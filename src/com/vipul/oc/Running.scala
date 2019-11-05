package com.vipul.oc

import java.util.Arrays
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.collection.convert.DecorateAsScala
import java.util.Dictionary
import scala.collection.mutable.HashTable
import scala.collection.JavaConversions._

object Running  {
  def main(args: Array[String]): Unit = {
    var list: List[String] = List()
    
  val v = donutStock("Vanila")("Vipul")
  .map { someQuantity => {
    buyDonut(6)
    }
  }
    
  v.map(vv => println(vv))
  Thread.sleep(1000)
  }
 val v: Abc = new Abc()
  
  
  def donutStock(donut: String)(v: String) : Future[Option[Int]] = Future  { 
  if(donut == "Vanila") Some(10) else None
  } 
  def buyDonut(qunatity: Int) : Boolean =  (if(qunatity > 0 ) true else false)
}


class Abc extends DecorateAsScala {
  val myMap = Map(1->"Hi",2->"Bye", 3 -> "Hahaha")
  Thread.sleep(1000)
  val v  = myMap.map ( f=> f._1) map { m => m match {
    case 1 => println(myMap.get(m).get)
    case 2 => println(myMap.get(m).get)
    case default  => println(myMap.get(m).get)
  }
  }
  
}
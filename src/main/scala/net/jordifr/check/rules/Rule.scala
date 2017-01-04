package net.jordifr.check.rules


/**
  * Created by Jordi Farré on 03/01/2017.
  */
trait Rule {

  def matches(pan: String): Boolean = false

}

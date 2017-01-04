package net.jordifr.check.rules


/**
  * Created by Jordi Farré on 03/01/2017.
  */
class PrefixRule(prefix: String, minSize: Integer, maxSize: Integer) extends Rule {

  override def matches(pan: String) = {
    pan.startsWith(this.prefix) && pan.length >= this.minSize && pan.length <= this.maxSize
  }
}

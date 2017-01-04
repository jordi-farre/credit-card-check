package net.jordifr.check.rules

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class PrefixRangeRule(prefixInit: String, prefixEnd: String, minSize: Integer, maxSize: Integer) extends Rule {

  override def matches(pan: String) = {
    val initRange: Int = prefixInit.toInt
    val endRange: Int = prefixEnd.toInt
    val panInitRange: Int = pan.substring(0, prefixInit.size).toInt
    val panEndRange: Int = pan.substring(0, prefixEnd.size).toInt
    panInitRange >= initRange && panEndRange <= endRange && pan.length >= this.minSize && pan.length <= this.maxSize
  }
}

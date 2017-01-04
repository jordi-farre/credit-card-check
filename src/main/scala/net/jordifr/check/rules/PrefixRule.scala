package net.jordifr.check.rules

import net.jordifr.check.types.CardType.Card


/**
  * Created by Jordi Farré on 03/01/2017.
  */
class PrefixRule(val cardType: Card, val prefix: String, val minSize: Integer, val maxSize: Integer) extends Rule {

  override def matches(pan: String) = {
    pan.startsWith(this.prefix) && pan.length >= this.minSize && pan.length <= this.maxSize
  }
}

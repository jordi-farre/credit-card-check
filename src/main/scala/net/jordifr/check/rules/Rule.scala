package net.jordifr.check.rules

import net.jordifr.check.types.Card

/**
  * Created by 0a555836 on 03/01/2017.
  */
trait Rule {

  def cardType: Card

  def matches(pan: String): Boolean

}

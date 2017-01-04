package net.jordifr.check.rules

import net.jordifr.check.types.CardType.Card


/**
  * Created by Jordi Farré on 03/01/2017.
  */
trait Rule {

  def cardType: Card

  def matches(pan: String): Boolean

}

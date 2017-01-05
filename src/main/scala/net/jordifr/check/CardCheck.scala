package net.jordifr.check

import net.jordifr.check.types.CardType._

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class CardCheck {

  def getCardType(pan: String): Card = {
    cards.find(_.matches(pan)).getOrElse(UnknownCard)
  }

}

package net.jordifr.check

import net.jordifr.check.rules.{PrefixRangeRule, PrefixRule, Rule}
import net.jordifr.check.types.CardType.{AmericanExpress, Card, ChinaUnionPay, DinersClubCarteBlanche}

/**
  * Created by 0a555836 on 03/01/2017.
  */
class CardCheck {

  val rules = List[Rule](
    new PrefixRule(cardType = AmericanExpress, prefix = "34", minSize = 15, maxSize = 15),
    new PrefixRule(cardType = AmericanExpress, prefix = "37", minSize = 15, maxSize = 15),
    new PrefixRule(cardType = ChinaUnionPay, prefix = "62", minSize = 16, maxSize = 19),
    new PrefixRangeRule(cardType = DinersClubCarteBlanche, prefixInit = "300", prefixEnd = "305", minSize = 14, maxSize = 14)
  )

  def getCardType(pan: String): Card = {
    this.rules.find(_.matches(pan)).get.cardType
  }

}

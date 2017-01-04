package net.jordifr.check

import net.jordifr.check.rules.{PrefixRangeRule, PrefixRule, Rule}
import net.jordifr.check.types.CardType._

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class CardCheck {

  val rules = List[Rule](
    new PrefixRule(cardType = AmericanExpress, prefix = "34", minSize = 15, maxSize = 15),
    new PrefixRule(cardType = AmericanExpress, prefix = "37", minSize = 15, maxSize = 15),
    new PrefixRangeRule(cardType = DiscoverCard, prefixInit = "622126", prefixEnd = "622925", minSize = 16, maxSize = 19),
    new PrefixRule(cardType = ChinaUnionPay, prefix = "62", minSize = 16, maxSize = 19),
    new PrefixRangeRule(cardType = DinersClubCarteBlanche, prefixInit = "300", prefixEnd = "305", minSize = 14, maxSize = 14),
    new PrefixRule(cardType = DinersClubInternational, prefix = "309", minSize = 14, maxSize = 14),
    new PrefixRule(cardType = DinersClubInternational, prefix = "36", minSize = 14, maxSize = 14),
    new PrefixRangeRule(cardType = DinersClubInternational, prefixInit = "38", prefixEnd = "39", minSize = 14, maxSize = 14),
    new PrefixRangeRule(cardType = DinersClubUnitedStatesAndCanada, prefixInit = "54", prefixEnd = "55", minSize = 16, maxSize = 16),
    new PrefixRule(cardType = DiscoverCard, prefix = "6011", minSize = 16, maxSize = 19),
    new PrefixRangeRule(cardType = DiscoverCard, prefixInit = "644", prefixEnd = "649", minSize = 16, maxSize = 19),
    new PrefixRule(cardType = DiscoverCard, prefix = "65", minSize = 16, maxSize = 19)
  )

  def getCardType(pan: String): Card = {
    this.rules.find(_.matches(pan)).get.cardType
  }

}

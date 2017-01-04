package net.jordifr.check.types

import net.jordifr.check.rules.{PrefixRangeRule, PrefixRule, Rule}

/**
  * Created by Jordi Farré on 04/01/2017.
  */
object CardType {

  sealed trait Card {

    val rules: List[Rule]

    def matches(pan: String): Boolean = rules.exists(_.matches(pan))

  }

  case object AmericanExpress extends Card {

    val rules = List(new PrefixRule(prefix = "34", minSize = 15, maxSize = 15), new PrefixRule(prefix = "37", minSize = 15, maxSize = 15))

  }

  case object ChinaUnionPay extends Card {

    val rules = List(new PrefixRule(prefix = "62", minSize = 16, maxSize = 19))

  }

  case object DinersClubCarteBlanche extends Card {

    val rules = List(new PrefixRangeRule(prefixInit = "300", prefixEnd = "305", minSize = 14, maxSize = 14))

  }

  case object DinersClubInternational extends Card {

    val rules = List(new PrefixRule(prefix = "309", minSize = 14, maxSize = 14),
      new PrefixRule(prefix = "36", minSize = 14, maxSize = 14),
      new PrefixRangeRule(prefixInit = "38", prefixEnd = "39", minSize = 14, maxSize = 14))

  }

  case object DinersClubUnitedStatesAndCanada extends Card {

    val rules = List(new PrefixRangeRule(prefixInit = "54", prefixEnd = "55", minSize = 16, maxSize = 16))

  }

  case object DiscoverCard extends Card {

    val rules = List(new PrefixRangeRule(prefixInit = "622126", prefixEnd = "622925", minSize = 16, maxSize = 16),
      new PrefixRangeRule(prefixInit = "622126", prefixEnd = "622925", minSize = 19, maxSize = 19),
      new PrefixRule(prefix = "6011", minSize = 16, maxSize = 16),
      new PrefixRule(prefix = "6011", minSize = 19, maxSize = 19),
      new PrefixRangeRule(prefixInit = "644", prefixEnd = "649", minSize = 16, maxSize = 16),
      new PrefixRangeRule(prefixInit = "644", prefixEnd = "649", minSize = 19, maxSize = 19),
      new PrefixRule(prefix = "65", minSize = 16, maxSize = 16),
      new PrefixRule(prefix = "65", minSize = 19, maxSize = 19))

  }

  case object InterPayment extends Card {

    val rules = List(new PrefixRule(prefix = "636", minSize = 16, maxSize = 19))

  }

  case object InstaPayment extends Card {

    val rules = List(new PrefixRangeRule(prefixInit = "637", prefixEnd = "639", minSize = 16, maxSize = 16))

  }

  val cards = List(AmericanExpress, DiscoverCard, ChinaUnionPay, DinersClubCarteBlanche, DinersClubInternational, DinersClubUnitedStatesAndCanada, InterPayment, InstaPayment)

}

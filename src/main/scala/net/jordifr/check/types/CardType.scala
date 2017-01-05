package net.jordifr.check.types

import net.jordifr.check.rules.{PatternRule, PrefixRangeRule, PrefixRule, Rule}

/**
  * Created by Jordi Farré on 04/01/2017.
  */
object CardType {

  sealed trait Card {

    val rules: List[Rule]

    def matches(pan: String): Boolean = rules.exists(_.matches(pan))

  }

  case object UnknownCard extends Card {

    val rules = List()

  }

  case object AmericanExpress extends Card {

    val rules = List(new PatternRule("^34\\d{13}$|^37\\d{13}$"))

  }

  case object ChinaUnionPay extends Card {

    val rules = List(new PatternRule("^62\\d{14,17}$"))

  }

  case object DinersClubCarteBlanche extends Card {

    val rules = List(new PatternRule("^30[0-5]\\d{11}$"))

  }

  case object DinersClubInternational extends Card {

    val rules = List(new PatternRule("^30[0-5]\\d{11}$|^309\\d{11}$|^36\\d{12}$|^3[8-9]\\d{12}$"))

  }

  case object DinersClubUnitedStatesAndCanada extends Card {

    val rules = List(new PatternRule("^54\\d{14}$|^55\\d{14}$"))

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

    val rules = List(new PatternRule("^636\\d{13,16}$"))

  }

  case object InstaPayment extends Card {

    val rules = List(new PatternRule("^63[7-9]\\d{13}$"))

  }

  case object JCB extends Card {

    val rules = List(new PatternRule("^352[8-9]\\d{12}$|^35[3-8]\\d{13}$"))

  }

  case object Maestro extends Card {

    val rules = List(new PatternRule("^50\\d{10,17}$|^5[6-8]\\d{10,17}$|^6\\d{11,18}$"))

  }

  case object Dankort extends Card {

    val rules = List(new PatternRule("^5019\\d{12}$|^4175\\d{12}$|^4571\\d{12}$"))

  }

  case object MIR extends Card {

    val rules = List(new PatternRule("^220[0-4]\\d{12}$"))

  }

  val cards = List(AmericanExpress, DiscoverCard, ChinaUnionPay, DinersClubCarteBlanche, DinersClubInternational, DinersClubUnitedStatesAndCanada, InterPayment, InstaPayment, JCB, Dankort, Maestro, MIR)

}

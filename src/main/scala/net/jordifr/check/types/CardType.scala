package net.jordifr.check.types

/**
  * Created by Jordi Farré on 04/01/2017.
  */
object CardType {

  sealed trait Card {

    val pattern: String

    def matches(pan: String): Boolean = this.pattern.r.findFirstIn(pan).isDefined

  }

  case object UnknownCard extends Card {

    val pattern = null

  }

  case object AmericanExpress extends Card {

    val pattern = "^34\\d{13}$|^37\\d{13}$"

  }

  case object ChinaUnionPay extends Card {

    val pattern = "^62\\d{14,17}$"

  }

  case object DinersClubCarteBlanche extends Card {

    val pattern = "^30[0-5]\\d{11}$"

  }

  case object DinersClubInternational extends Card {

    val pattern = "^30[0-5]\\d{11}$|^309\\d{11}$|^36\\d{12}$|^3[8-9]\\d{12}$"

  }

  case object DinersClubUnitedStatesAndCanada extends Card {

    val pattern = "^54\\d{14}$|^55\\d{14}$"

  }

  case object DiscoverCard extends Card {

    val pattern = "^6011\\d{12}(\\d{3})?$|^62212[6-9]\\d{10}(\\d{3})?$|^622[1-8]\\d{12}(\\d{3})?$|^6229[0-2][0-5]\\d{10}(\\d{3})?$|^6011\\d{12}(\\d{3})?$|^64[4-9]\\d{13}(\\d{3})?$|^65\\d{14}(\\d{3})?$"

  }

  case object InterPayment extends Card {

    val pattern = "^636\\d{13,16}$"

  }

  case object InstaPayment extends Card {

    val pattern = "^63[7-9]\\d{13}$"

  }

  case object JCB extends Card {

    val pattern = "^352[8-9]\\d{12}$|^35[3-8]\\d{13}$"

  }

  case object Maestro extends Card {

    val pattern = "^50\\d{10,17}$|^5[6-8]\\d{10,17}$|^6\\d{11,18}$"

  }

  case object Dankort extends Card {

    val pattern = "^5019\\d{12}$|^4175\\d{12}$|^4571\\d{12}$"

  }

  case object MIR extends Card {

    val pattern = "^220[0-4]\\d{12}$"

  }

  val cards = List(AmericanExpress, DiscoverCard, ChinaUnionPay, DinersClubCarteBlanche, DinersClubInternational, DinersClubUnitedStatesAndCanada, InterPayment, InstaPayment, JCB, Dankort, Maestro, MIR)

}

package net.jordifr.check.types

/**
  * Created by 0a555836 on 04/01/2017.
  */
object CardType {

  sealed trait Card

  case object AmericanExpress extends Card

  case object ChinaUnionPay extends Card

  case object DinersClubCarteBlanche extends Card

  case object DinersClubInternational extends Card

}

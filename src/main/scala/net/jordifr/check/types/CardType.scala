package net.jordifr.check.types

/**
  * Created by Jordi Farré on 04/01/2017.
  */
object CardType {

  sealed trait Card

  case object UnknownCard extends Card

  case object AmericanExpress extends Card

  case object ChinaUnionPay extends Card

  case object DinersClubCarteBlanche extends Card

  case object DinersClubInternational extends Card

  case object DinersClubUnitedStatesAndCanada extends Card

  case object DiscoverCard extends Card

}

import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.DinersClubUnitedStatesAndCanada
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class DinersClubUnitedStatesAndCanadaSpec extends FeatureSpec with GivenWhenThen {

  feature("Diners Club United States And Canada card") {
    scenario("Starts by 54 and has a fixed length of 16 digits") {
      Given("a credit card with number 5412345678911236")
      val cardCheck = new CardCheck();
      val number = "5412345678911236";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Diners Club United States and Canada card")
      assert(DinersClubUnitedStatesAndCanada == cardType)
    }
    scenario("Starts by 55 and has a fixed length of 16 digits") {
      Given("a credit card with number 5512345678911236")
      val cardCheck = new CardCheck();
      val number = "5512345678911236";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Diners Club United States and Canada card")
      assert(DinersClubUnitedStatesAndCanada == cardType)
    }
  }

}

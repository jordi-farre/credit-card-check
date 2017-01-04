import net.jordifr.check.CardCheck
import net.jordifr.check.types.DinersClubCarteBlanche
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by 0a555836 on 03/01/2017.
  */
class DinersClubCarteBlancheSpec extends FeatureSpec with GivenWhenThen {

  feature("Diners Club Carte Blanche card") {
    scenario("Starts by 300 and has a fixed length of 14 digits") {
      Given("a credit card with number 30012345678915")
      val cardCheck = new CardCheck();
      val number = "30012345678915";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(new DinersClubCarteBlanche().name == cardType.name)
    }
    scenario("Starts by 303 and has a fixed length of 14 digits") {
      Given("a credit card with number 30312345678915")
      val cardCheck = new CardCheck();
      val number = "30312345678915";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(new DinersClubCarteBlanche().name == cardType.name)
    }
    scenario("Starts by 305 and has a fixed length of 14 digits") {
      Given("a credit card with number 30512345678915")
      val cardCheck = new CardCheck();
      val number = "30512345678915";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(new DinersClubCarteBlanche().name == cardType.name)
    }
  }

}

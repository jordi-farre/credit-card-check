import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.DinersClubInternational
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by 0a555836 on 03/01/2017.
  */
class DinersClubInternationalSpec extends FeatureSpec with GivenWhenThen {

  feature("Diners Club International card") {
    scenario("Starts by 309 and has a fixed length of 14 digits") {
      Given("a credit card with number 30945678914234")
      val cardCheck = new CardCheck();
      val number = "30945678914234";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Diners Club International card")
      assert(DinersClubInternational == cardType)
    }
    scenario("Starts by 36 and has a fixed length of 14 digits") {
      Given("a credit card with number 36123456782535")
      val cardCheck = new CardCheck();
      val number = "36123456782535";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Diners Club International card")
      assert(DinersClubInternational == cardType)
    }
    scenario("Starts by 38 and has a fixed length of 14 digits") {
      Given("a credit card with number 38123456782535")
      val cardCheck = new CardCheck();
      val number = "38123456782535";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Diners Club International card")
      assert(DinersClubInternational == cardType)
    }
    scenario("Starts by 39 and has a fixed length of 14 digits") {
      Given("a credit card with number 39123456782535")
      val cardCheck = new CardCheck();
      val number = "39123456782535";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Diners Club International card")
      assert(DinersClubInternational == cardType)
    }
  }

}

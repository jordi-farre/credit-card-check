import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.AmericanExpress
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by 0a555836 on 03/01/2017.
  */
class AmericanExpressSpec extends FeatureSpec with GivenWhenThen {

  feature("American Express card") {
    scenario("Starts by 34 and has a fixed length of 15 digits") {
      Given("a credit card with number 341772590904704")
      val cardCheck = new CardCheck();
      val number = "341772590904704";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(AmericanExpress == cardType)
    }
    scenario("Starts by 37 and has a fixed length of 15 digits") {
      Given("a credit card with number 374945727217220")
      val cardCheck = new CardCheck();
      val number = "374945727217220";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an American Express card")
      assert(AmericanExpress == cardType)
    }
  }

}

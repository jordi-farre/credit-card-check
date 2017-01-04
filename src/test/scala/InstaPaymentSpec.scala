import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.InstaPayment
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class InstaPaymentSpec extends FeatureSpec with GivenWhenThen {

  feature("InstaPayment card") {
    scenario("Starts by 637 and has a fixed length of 16 digits") {
      Given("a credit card with number 6371234567890123")
      val cardCheck = new CardCheck();
      val number = "6371234567890123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an InstaPayment card")
      assert(InstaPayment == cardType)
    }
    scenario("Starts by 638 and has a fixed length of 16 digits") {
      Given("a credit card with number 6381234567890123")
      val cardCheck = new CardCheck();
      val number = "6381234567890123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an InstaPayment card")
      assert(InstaPayment == cardType)
    }
    scenario("Starts by 639 and has a fixed length of 16 digits") {
      Given("a credit card with number 6391234567890123")
      val cardCheck = new CardCheck();
      val number = "6391234567890123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is an InstaPayment card")
      assert(InstaPayment == cardType)
    }
  }

}

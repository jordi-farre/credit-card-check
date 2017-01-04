import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.InterPayment
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class InterPaymentSpec extends FeatureSpec with GivenWhenThen {

  feature("InterPayment card") {
    scenario("Starts by 636 and has a fixed length of 16 digits") {
      Given("a credit card with number 6361123456789123")
      val cardCheck = new CardCheck();
      val number = "6361123456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a InterPayment card")
      assert(InterPayment == cardType)
    }
    scenario("Starts by 636 and has a fixed length of 17 digits") {
      Given("a credit card with number 63611234567891234")
      val cardCheck = new CardCheck();
      val number = "63611234567891234";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a InterPayment card")
      assert(InterPayment == cardType)
    }
    scenario("Starts by 636 and has a fixed length of 18 digits") {
      Given("a credit card with number 636112345678912345")
      val cardCheck = new CardCheck();
      val number = "636112345678912345";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a InterPayment card")
      assert(InterPayment == cardType)
    }
    scenario("Starts by 636 and has a fixed length of 19 digits") {
      Given("a credit card with number 6361123456789123456")
      val cardCheck = new CardCheck();
      val number = "6361123456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a InterPayment card")
      assert(InterPayment == cardType)
    }
  }

}

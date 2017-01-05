import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.JCB
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class JCBSpec extends FeatureSpec with GivenWhenThen {

  feature("JCB card") {
    scenario("Starts by 3528 and has a fixed length of 16 digits") {
      Given("a credit card with number 3528123456789158")
      val cardCheck = new CardCheck();
      val number = "3528123456789158";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a JCB card")
      assert(JCB == cardType)
    }
    scenario("Starts by 3551 and has a fixed length of 16 digits") {
      Given("a credit card with number 3551123456789158")
      val cardCheck = new CardCheck();
      val number = "3551123456789158";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a JCB card")
      assert(JCB == cardType)
    }
    scenario("Starts by 3589 and has a fixed length of 16 digits") {
      Given("a credit card with number 3589123456789158")
      val cardCheck = new CardCheck();
      val number = "3528123456789158";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a JCB card")
      assert(JCB == cardType)
    }
  }

}

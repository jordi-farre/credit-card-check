import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.MIR
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class MIRSpec extends FeatureSpec with GivenWhenThen {

  feature("MIR card") {
    scenario("Starts by 2200 and has a fixed length of 16 digits") {
      Given("a credit card with number 2200123586897841")
      val cardCheck = new CardCheck();
      val number = "2200123586897841";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a MIR card")
      assert(MIR == cardType)
    }
    scenario("Starts by 2202 and has a fixed length of 16 digits") {
      Given("a credit card with number 2202123586897841")
      val cardCheck = new CardCheck();
      val number = "2202123586897841";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a MIR card")
      assert(MIR == cardType)
    }
    scenario("Starts by 2204 and has a fixed length of 16 digits") {
      Given("a credit card with number 2204123586897841")
      val cardCheck = new CardCheck();
      val number = "2204123586897841";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a MIR card")
      assert(MIR == cardType)
    }
  }

}

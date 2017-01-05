import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.Dankort
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class DankortSpec extends FeatureSpec with GivenWhenThen {

  feature("Dankort card") {
    scenario("Starts by 5019 and has a fixed length of 16 digits") {
      Given("a credit card with number 5019123456789451")
      val cardCheck = new CardCheck();
      val number = "5019123456789451";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Dankort card")
      assert(Dankort == cardType)
    }
    scenario("Starts by 4175 and has a fixed length of 16 digits") {
      Given("a credit card with number 4175123456789451")
      val cardCheck = new CardCheck();
      val number = "4175123456789451";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Dankort card")
      assert(Dankort == cardType)
    }
    scenario("Starts by 4571 and has a fixed length of 16 digits") {
      Given("a credit card with number 4571123456789451")
      val cardCheck = new CardCheck();
      val number = "4571123456789451";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Dankort card")
      assert(Dankort == cardType)
    }
  }

}

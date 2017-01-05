import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.Maestro
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class MaestroSpec extends FeatureSpec with GivenWhenThen {

  feature("Maestro card") {
    scenario("Starts by 50 and has a fixed length of 12 digits") {
      Given("a credit card with number 501234567894")
      val cardCheck = new CardCheck();
      val number = "501234567894";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
    scenario("Starts by 50 and has a fixed length of 15 digits") {
      Given("a credit card with number 501234567894345")
      val cardCheck = new CardCheck();
      val number = "501234567894345";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
    scenario("Starts by 50 and has a fixed length of 19 digits") {
      Given("a credit card with number 5012345678941345679")
      val cardCheck = new CardCheck();
      val number = "5012345678941345679";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
    scenario("Starts by 56 and has a fixed length of 12 digits") {
      Given("a credit card with number 561234567894")
      val cardCheck = new CardCheck();
      val number = "561234567894";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
    scenario("Starts by 57 and has a fixed length of 15 digits") {
      Given("a credit card with number 571234567894345")
      val cardCheck = new CardCheck();
      val number = "571234567894345";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
    scenario("Starts by 58 and has a fixed length of 19 digits") {
      Given("a credit card with number 5812345678941345679")
      val cardCheck = new CardCheck();
      val number = "5812345678941345679";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
    scenario("Starts by 6 and has a fixed length of 12 digits") {
      Given("a credit card with number 601234567894")
      val cardCheck = new CardCheck();
      val number = "601234567894";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
    scenario("Starts by 6 and has a fixed length of 15 digits") {
      Given("a credit card with number 601234567894345")
      val cardCheck = new CardCheck();
      val number = "601234567894345";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
    scenario("Starts by 6 and has a fixed length of 19 digits") {
      Given("a credit card with number 6012345678941345679")
      val cardCheck = new CardCheck();
      val number = "6012345678941345679";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Maestro card")
      assert(Maestro == cardType)
    }
  }

}

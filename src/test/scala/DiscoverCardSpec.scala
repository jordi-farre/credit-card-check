import net.jordifr.check.CardCheck
import net.jordifr.check.types.CardType.DiscoverCard
import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by Jordi Farré on 03/01/2017.
  */
class DiscoverCardSpec extends FeatureSpec with GivenWhenThen {

  feature("Discover card") {
    scenario("Starts by 6011 and has a fixed length of 16 digits") {
      Given("a credit card with number 6011123456789123")
      val cardCheck = new CardCheck();
      val number = "6011123456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 6011 and has a fixed length of 19 digits") {
      Given("a credit card with number 6011123456789123456")
      val cardCheck = new CardCheck();
      val number = "6011123456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 622126 and has a fixed length of 16 digits") {
      Given("a credit card with number 6221263456789123")
      val cardCheck = new CardCheck();
      val number = "6221263456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 622126 and has a fixed length of 19 digits") {
      Given("a credit card with number 6221263456789123456")
      val cardCheck = new CardCheck();
      val number = "6221263456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 622710 and has a fixed length of 16 digits") {
      Given("a credit card with number 6227103456789123")
      val cardCheck = new CardCheck();
      val number = "6227103456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 622710 and has a fixed length of 19 digits") {
      Given("a credit card with number 6227103456789123456")
      val cardCheck = new CardCheck();
      val number = "6227103456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 622925 and has a fixed length of 16 digits") {
      Given("a credit card with number 6229253456789123")
      val cardCheck = new CardCheck();
      val number = "6229253456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 622925 and has a fixed length of 19 digits") {
      Given("a credit card with number 6229253456789123456")
      val cardCheck = new CardCheck();
      val number = "6229253456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 644 and has a fixed length of 16 digits") {
      Given("a credit card with number 6449253456789123")
      val cardCheck = new CardCheck();
      val number = "6449253456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 644 and has a fixed length of 19 digits") {
      Given("a credit card with number 6449253456789123456")
      val cardCheck = new CardCheck();
      val number = "6449253456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 646 and has a fixed length of 16 digits") {
      Given("a credit card with number 6469253456789123")
      val cardCheck = new CardCheck();
      val number = "6469253456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 646 and has a fixed length of 19 digits") {
      Given("a credit card with number 6469253456789123456")
      val cardCheck = new CardCheck();
      val number = "6469253456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 649 and has a fixed length of 16 digits") {
      Given("a credit card with number 6499253456789123")
      val cardCheck = new CardCheck();
      val number = "6499253456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 649 and has a fixed length of 19 digits") {
      Given("a credit card with number 6499253456789123456")
      val cardCheck = new CardCheck();
      val number = "6499253456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 65 and has a fixed length of 16 digits") {
      Given("a credit card with number 6549253456789123")
      val cardCheck = new CardCheck();
      val number = "6549253456789123";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
    scenario("Starts by 65 and has a fixed length of 19 digits") {
      Given("a credit card with number 6549253456789123456")
      val cardCheck = new CardCheck();
      val number = "6549253456789123456";
      When("we get the credit card type")
      val cardType = cardCheck.getCardType(number)
      Then("is a Discover card")
      assert(DiscoverCard == cardType)
    }
  }

}

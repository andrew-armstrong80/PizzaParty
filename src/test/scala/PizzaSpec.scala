import org.scalatest._

class PizzaSpec extends WordSpec with MustMatchers{

  "Counter" must {

    "return a String when given an Int, List(String)" in {
      Pizza.Counter(3, List("1/2", "3/4", "1/2")) mustEqual
        "To feed 3 hungry apprentices, I need 2 pizzas. I have 2 leftover slices!"
    }

    "return a String when given an Int, List[String]" in {
      Pizza.Counter(7, List("1/2", "3/4", "1/2", "1/4", "1/4", "1/2", "3/4")) mustEqual {
        "To feed 7 hungry apprentices, I need 4 pizzas. I have 4 leftover slices!"
      }
    }
  }

  "fractionChanger" must {

    "return 1 when given '1/8'" in {
      Pizza.fractionChanger("1/8") mustEqual (1)
    }

    "return 2 when given '2/8'" in {
      Pizza.fractionChanger("2/8") mustEqual (2)
    }

    "return 3 when given '3/8'" in {
      Pizza.fractionChanger("3/8") mustEqual (3)
    }

    "return 4 when given '1/2'" in {
      Pizza.fractionChanger("4/8") mustEqual (4)
    }

    "return 4 when given '4/8'" in {
      Pizza.fractionChanger("1/2") mustEqual (4)
    }

    "return 5 when given '5/8'" in {
      Pizza.fractionChanger("5/8") mustEqual (5)
    }

    "return 6 when given '3/4'" in {
      Pizza.fractionChanger("3/4") mustEqual (6)
    }

    "return 7 when given '7/8'" in {
      Pizza.fractionChanger("7/8") mustEqual (7)
    }


  }



}

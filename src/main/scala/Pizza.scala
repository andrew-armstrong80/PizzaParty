object Pizza {

  def Counter (input: Int, people: List[String]) : String = {
    if (input != people.length) {
      "You have not selected the correct portions"
    } else {
      val decimalList = people.map(fractionChanger).sum
      val sliceCounter = (decimalList / 8).ceil.toInt
      val leftover = 8 - (decimalList % 8).toInt
      s"To feed $input hungry apprentices, I need $sliceCounter pizzas. I have $leftover leftover slices!"
    }
  }

  def fractionChanger (slices: String) : Double = {
    slices match {

      case "1/8" => 1
      case "1/4" | "2/8" => 2
      case "3/8" => 3
      case "1/2" | "2/4" | "4/8" => 4
      case "5/8" => 5
      case "3/4" | "6/8" => 6
      case "7/8" => 7
    }
  }


}

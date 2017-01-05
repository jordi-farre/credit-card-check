package net.jordifr.check.rules

/**
  * Created by Jordi Farré on 05/01/2017.
  */
class PatternRule(pattern: String) extends Rule {

  override def matches(pan: String): Boolean = this.pattern.r.findFirstIn(pan).isDefined

}

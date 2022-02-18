package com.kata.wellform

object WellFormed {
  //define a function which checks the well-formedness of an input String containing only brackets
  //'Well-formed' means properly nested pairs of brackets such  as: "{}", "[]", "()", "{(){}}", "{{[()]}}" or "([{}])"
  //Not well-formed examples would be: "{", "{]", or "({[)"
  //So every opening bracket should have a correctly nested corresponding closing bracket of the same type
  //Input values are assumed not to contain any other characters than  {}[]()
  //An empty String is not well-formed

  def isWellFormed(s: String): Boolean = ???

}

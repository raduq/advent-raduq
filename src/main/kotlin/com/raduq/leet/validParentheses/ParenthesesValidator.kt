package com.raduq.leet.validParentheses

class ParenthesesValidator {

  fun isValid(s: String): Boolean {
    if (s.isEmpty()) return true
    val simplified = s.replace("()", "")
      .replace("{}", "")
      .replace("[]", "")
    if (simplified == s) return false
    return isValid(simplified)
  }

  private fun isClosing(current: Char, prev: Char?): Boolean {
    if (current == ')' && prev == '(') return true
    if (current == '}' && prev == '{') return true
    if (current == ']' && prev == '[') return true
    return false
  }

  fun isValidWithDeque(s: String): Boolean {
    var stack = ArrayDeque<Char>()
    for (char in s.toCharArray()) {
      if (char == '(' || char == '{' || char == '[') {
        stack.add(char)
        continue
      }
      if (stack.isNotEmpty() && isClosing(char, stack.last())) {
        stack.removeLast()
        continue
      }
      return false
    }
    return stack.isEmpty()
  }

}

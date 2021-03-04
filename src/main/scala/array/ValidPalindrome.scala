/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
package array

object ValidPalindrome {
  def isPalindrome(s: String): Boolean = {
    var last = s.length-1
    var first = 0
    var isPalindrome = true
    while (first < last & isPalindrome) {
      if (!s.charAt(first).isLetterOrDigit){
        first = first + 1
      } else if (!s.charAt(last).isLetterOrDigit){
        last = last - 1
      } else if (s.charAt(first).toLower == s.charAt(last).toLower){
        first = first + 1
        last = last - 1
      } else {
        isPalindrome = false
      }
    }
    isPalindrome
  }
}

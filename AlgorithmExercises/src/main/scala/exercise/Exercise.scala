package exercise

/**
 * Created by kazuki on 2014/02/08.
 */
object Exercise {

    def isSubstring (s1: String, s2: String) = {

      def inner(str: String, strPart: String, s2Part: String): Boolean = {
        if (s2Part.isEmpty) return true
        else if (str.isEmpty) return false

        if (strPart.head == s2Part.head)
          inner(str, strPart.tail, s2Part.tail)
        else
          inner(str.tail, str.tail, s2)
      }
      inner(s1, s1, s2)
    }

}

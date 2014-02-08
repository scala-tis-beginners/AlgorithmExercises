package exercise

/**
 * Created by kazuki on 2014/02/08.
 */
object Exercise {

    def isSubstring(s1: String, s2: String) = {

      def inner(str: String, contain: String): Boolean = {
        if (contain.isEmpty) return true
        else if (str.isEmpty) return false

        if (str.head == contain.head)
          inner(str.tail, contain.tail)
        else
          inner(str.tail, s2)
      }
      inner(s1, s2)
    }

}

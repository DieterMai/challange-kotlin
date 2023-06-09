// https://www.codewars.com/kata/51c8991dee245d7ddf00000e
// Reversed Words

package k15.cw.kata8.reversewords

object Reverse{
    fun reverseWords(str:String):String{
        return str.split(" ").reversed().joinToString(" ")
    }
}

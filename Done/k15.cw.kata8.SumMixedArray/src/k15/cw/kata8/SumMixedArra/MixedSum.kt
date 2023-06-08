// https://www.codewars.com/kata/
//

package k15.cw.kata8.SumMixedArra

public class MixedSum {

    public fun sum(mixed: List<Any>): Int {
        var sum = 0
        for(element in mixed){
            if(element is Int){
                sum += element
            }else if(element is String){
                sum += element.toInt()
            }
        }
        return sum
    }
}

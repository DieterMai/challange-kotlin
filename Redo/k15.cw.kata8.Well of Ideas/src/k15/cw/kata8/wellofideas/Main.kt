// https://www.codewars.com/kata/57f222ce69e09c3630000212
// Well of Ideas - Easy Version


package k15.cw.kata8.wellofideas

fun well(x: Array<String>): String {
    var good = 0
    for (idea in x){
        if(idea == "good"){
            good++
        }
    }

    return when(good){
        0 -> "Fail!"
        1,2 -> "Publish!"
        else -> "I smell a series!"
    }
}

import java.lang.Math

// https://www.codewars.com/kata/5c374b346a5d0f77af500a5a
// Closest elevator

fun elevator(left: Int, right: Int, call: Int): String {
    val distanceToLeft = Math.abs(left - call)
    val distanceToRight = Math.abs(right - call)
    return if(distanceToRight <= distanceToLeft){
        "right"
    }else{
        "left"
    }
}


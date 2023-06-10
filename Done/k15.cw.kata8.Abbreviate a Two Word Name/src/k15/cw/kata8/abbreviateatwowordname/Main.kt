// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
// Abbreviate a Two Word Name

package k15.cw.kata8.abbreviateatwowordname

fun abbrevName(name:String) : String{
    return name.split(" ").map { it[0] }.joinToString(".").uppercase()
}
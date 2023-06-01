// https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed/train/kotlin
// Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence

fun replace(s: String): String {
    val vowelsRegex = "[aeiouAEIOU]".toRegex();
    return s.replace(vowelsRegex, "!")
}

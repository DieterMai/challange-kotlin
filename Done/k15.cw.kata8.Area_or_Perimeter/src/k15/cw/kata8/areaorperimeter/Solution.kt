// https://www.codewars.com/kata/5ab6538b379d20ad880000ab
// Area or Perimeter

package k15.cw.kata8.areaorperimeter

object Solution {
    fun areaOrPerimeter(l:Int, w:Int):Int {
        return if( l == w){
            l*w;
        }else{
            l*2+w*2
        }
    }
}

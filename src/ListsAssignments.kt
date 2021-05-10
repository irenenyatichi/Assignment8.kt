fun main() {
    println(isEven(5))
    println(isEven(6))
    println( characters("banana"))
    println(characters("AkiraChix"))
    println(names("Mary"))
    println(names("James"))
    println(names("Ann"))
}
fun isEven(number:Int):Boolean {
    return if (number%2==0) {
        (true)
    } else
        (false)
}
data class Product(var name:String,var weight:Int,var price:Int,var category:String)
fun shopping(product: Product) {
    var grocerieslist = mutableListOf<Product>()
    var hygeinelist = mutableListOf<Product>()
    var otherlist = mutableListOf<Product>()
    when (product.category) {
        "groceries" -> grocerieslist.add(product)
        "hygeine" -> hygeinelist.add(product)
    }
    else(otherlist.add(product))
        println(grocerieslist)
        println(hygeinelist)
        println(otherlist)
}
fun characters(word:String):String {
    var wordS= ""
    for (x in word) {
        if (word.indexOf(x) % 2 == 0) {
            wordS +=x
        }
        }
    return wordS }
fun names(name: String): ArrayList<String> {
    val name: ArrayList<String> = arrayListOf<String>("Mary","James","Ann")
    var required = name.filter { name-> name.length %2==0}
    return name
}
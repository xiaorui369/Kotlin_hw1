fun calculateFee(total: Int, amount: Int, exclusive: Boolean = false ): Int{
    amount.toDouble()
    var tax:Double = 0.0
    when {
        total in 1..1000 -> {
            tax = 0.3
        }
        total in 1001..10_000 -> {
            tax = 0.25
        }
        total in 10_001..50_000 -> {
            tax = 0.2
        }
        total > 50_001 -> {
            tax = 0.1
        }
    }
    if (exclusive){
        tax -= 0.05
    }
    return (amount.toDouble() * tax).toInt()
}


fun main() {
    println("Fee when exclusive : ${calculateFee(11_000, 200, true)} ")
    println("Fee when not exclusive : ${calculateFee(11_000, 200)} ")
}

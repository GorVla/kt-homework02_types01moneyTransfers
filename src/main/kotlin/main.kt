fun main() {

    val amount = 2000
    val minAmount = 35
    val commissionPercentage = 0.75

    if (amount < minAmount) {
        println("Сумма перевода не может быть меньше $minAmount рублей")
    } else {
        var commission = ((amount.toDouble() / 100) * commissionPercentage).toInt()
        println("Комиссия от $amount ровна $commission")
    }

}
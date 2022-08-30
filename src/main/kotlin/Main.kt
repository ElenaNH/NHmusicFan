fun main(args: Array<String>) {
    val musicFan: Boolean = true
    val moneyCents: ULong = 2000000uL    // Пусть это будет в копейках
    val fanDiscountPersent: Byte = if (musicFan) 1 else 0

    val currentDiscountCents: ULong = if (moneyCents >= 1000100uL) {
        moneyCents * 5uL / 100uL
    } else if (moneyCents >= 100100uL) {
        100uL * 100uL // Это чтобы не забыть, что все в копейках
    } else {
        0uL
    }
    // Решаем в пользу покупателя - отбрасываем любые доли копеек
    // Если захотим решить в пользу продавца, то moneyCents - currentDiscountCents * (100uL - fanDiscountPersent.toULong()) / 100uL
    val total: ULong = (moneyCents - currentDiscountCents) * (100uL - fanDiscountPersent.toULong()) / 100uL

    println("Покупка: ${moneyCents / 100uL} руб. ${moneyCents % 100uL} коп.")
    println("Скидка на покупку: ${currentDiscountCents / 100uL} руб. ${currentDiscountCents % 100uL} коп.")
    if (musicFan) {
        println("Скидка постоянного покупателя: $fanDiscountPersent %")
    }
    println("Итого к оплате: ${total / 100uL} руб. ${total % 100uL} коп.")

}
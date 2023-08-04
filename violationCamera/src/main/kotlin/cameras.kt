import java.util.*
import java.util.concurrent.TimeUnit

fun Camera1(cameraData: MutableMap<String, Date>) {
    try {
        println("دوربین 1")
        val pelak1 = readLine()!!
        val dataPelac1 = Date()
        cameraData[pelak1] = dataPelac1
        println("پلاک خودرو ثبت شد")
    }catch (e:NumberFormatException){
        println("مقدار را درست وارد نمایید")
    }catch (e:Exception){
        println("خطا")
        println(e.message)
    }

}

fun Camera2(

    cameraData: MutableMap<String, Date>,
    maxTimeInSec: Int,
    maxPenaltyTimeInSec: Int
) {
    try {
        println("دوربین 2")
        val pelac2 = readLine()!!
        cameraData.filter { it.key.lowercase() == pelac2.lowercase() }
        if (cameraData.isNotEmpty()) {
            val dataPelack2 = Date()
            val mohasebe = dataPelack2.time - cameraData[pelac2]!!.time
            val zaman = TimeUnit.MILLISECONDS.toSeconds(mohasebe)
            if (zaman < maxTimeInSec) {
                if (zaman < maxPenaltyTimeInSec) {
                    println("200 هزار تومان جریمه برای عبور از سرعت مجاز بالای 150 کیلومتر")

                } else {
                    println("60 هزار تومان جریمه برای سرعت بالای 120 کیلومتر ")
                }


            }
        } else {
            println("پلاک وارد شده در سیستم ثبت نشده است !")
        }

    }catch (e:NumberFormatException){
        println("مقدار را درست وارد نمایید")
    }catch (e:Exception){
        println("خطا")
        println(e.message)
    }

}
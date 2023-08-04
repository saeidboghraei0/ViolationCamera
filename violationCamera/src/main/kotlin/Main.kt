
import java.lang.NumberFormatException
import java.util.Date
import java.util.concurrent.TimeUnit

// پروژه ای که نوشته شده بر اساس 2 دوربین کنترل سرعت میباشد که یک مسیر 10 کیلومتری اگر بالای 120 کیلومتر رو در کمتر از 300 ثانیه طی کرد 60 تومان جریمه
// و اگر کمتر از 240 ثانیه طی کرد 200 هزار تومان جریمه میشوند
fun main(args: Array<String>) {


        val cameraData = mutableMapOf<String,Date>()
        val maxTimeInSec = 300
        val maxPenaltyTimeInSec = 240

        while (true){

            try {
                println("[1] ثبت دوربین اول")
                println("[2] ثبت دوربین دوم")
                println("[0] خروج از برنامه")
                println("درخواست خود را وارد نمایید")
                val menu = readLine()?.toInt()!!
                when(menu){
                    1-> Camera1(cameraData)
                    2->  Camera2(cameraData, maxTimeInSec, maxPenaltyTimeInSec)
                    0->{
                        println("برنامه بسته شد !!")
                        return
                    }
                    else->{
                        println("مقدار وارد شده نامعتبر میباشد ")
                    }
                }
            }catch (e:NumberFormatException){
                println("مقدار را درست وارد نمایید")
                println(e.message)
            }catch (e:Exception){
                println("خطا")
                println(e.message)
            }

        }
}

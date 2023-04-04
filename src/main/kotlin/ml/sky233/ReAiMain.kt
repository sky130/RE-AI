package ml.sky233

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)//获取用户输入的字符串
    while (true) {
        print("你:")
        val str = getReplyText(sc.next())
        println("ReAi:$str")
    }
}

fun getReplyText(msg: String): String {
    val mMsg: String = msg
        .replace("吗", "")
        .replace("?", "")
        .replace("？", "")
        .replace("你", "我")
    return mMsg
}

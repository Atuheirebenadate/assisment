fun main(){
var w=CurrentAccount(1234,"MK",5000)
    deposit(4.8)
    withdraw(2.7)
    w.accountNumber
    w.balance
    var them=SavingAccount(456,"AK47",700,34.2)
    var p=product("mango juice",34.8,3000,"fresh")
}
 open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Int)
fun deposit(amount:Double){
}
fun withdraw(amount: Double){
    var x=0
}
fun details(){
}
class SavingAccount( accountNumber: Int,  accountName: String, balance:Int, withdraw:Double)

data class product  ( var name: String,var weight:Double,var price:Int,var category:String)




object q1 {
    def main(args:Array[String]) = {

        var names:Array[String] =  Array("Toothpaste","Shampoo","Detergent","Rice","Oil","Beans","Noodles","Soda","Bread","Milk")
        var itemQuantities:Array[Int] = Array(50,30,40,20,25,60,100,80,50,40)
        var inventory = (names,itemQuantities)

        def displayInventory(t:(Array[String],Array[Int])):Unit = {

            for(i <- t._1.indices) {
                println(t._1(i) + " : " + t._2(i))
            }
        }

        def restockItem(name:String,quantity:Int):Unit = {
                
            if(inventory._1.contains(name)) {
                for(i <- inventory._1.indices) {
                    if(inventory._1(i) == name) {
                        inventory._2(i) += quantity
                    }
                } 
            }
            else {
                println("The given item does not exist")
            }
            
        }

        def sellItem(name:String,quantity:Int):Unit = {
            if(inventory._1.contains(name)) {
                for(i <- inventory._1.indices) {
                    if(inventory._1(i) == name) {
                        if(inventory._2(i) >= quantity) {
                            inventory._2(i) -= quantity
                        }
                        else {
                            println("No enough quantity to sell")
                        }
                    } 
                }
            }
            else {
                println("The given item does not exist")
            }
        }

        println("Inventory of the retails store:")
        displayInventory(inventory)

        restockItem("Rice",10)
        println("\nInventory after restocking:")
        displayInventory(inventory)

        sellItem("Bread",40)
        println("\nInventory after selling:")
        displayInventory(inventory)
    }
}
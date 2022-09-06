object Question1 {
    def main (args: Array[String]):Unit = {

        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

        def encrypt(word:String,shift:Int = 1) = word.map(c => {

            val x = alphabet.indexOf(c.toUpper)

            if(x == -1){
                c
            }else{
                alphabet((x + shift) % 26)                
            }
        })

        def decrypt(word:String,shift:Int = 1) = word.map(c => {

            val x = alphabet.indexOf(c.toUpper)

            if(x == -1){
                c
            }else{
                alphabet((x - shift) % 26)                
            }
        })

        def caeserCipher(f:(String,Int)=>String,word:String,n:Int) = f(word,n)        
        
    }
}
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

        def caeserCipher(word:String,method:Int = 1,shift:Int = 1) = method match{
            case 0 => decrypt(word,shift)
            case 1 => encrypt(word,shift)
        }
        
    }
}
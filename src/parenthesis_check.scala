object Solution {
    def isValid(s: String): Boolean = {
        var str = ""
        for(inp <- s){
            if(inp.toString() == "[" || inp.toString() == "(" || inp.toString() == "{"){
                str = str ++ inp.toString()
            }
            else if(!(str.isEmpty) && ((str.last == '(' && inp == ')') || (str.last == '[' && inp == ']') || (str.last == '{' && inp == '}'))){
                str = str.init
            }
            else {
            str = str ++ inp.toString()
        }
        }
        
        print(str)
        str.isEmpty
    }
}

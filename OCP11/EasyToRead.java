public class EasyToRead{
    public static void main(String[] args){
        Bob f = new Bob("GoBobGo",19);
        System.out.println(f);
    }
}

class Bob{
    int shoeSize;
    String nickName;
    Bob(String nickName, int shoeSize){
        this.shoeSize = shoeSize;
        this.nickName = nickName;
    }

    public String toString(){
        return ("Hi im "+nickName+". My shoe size is "+shoeSize);
    }
}

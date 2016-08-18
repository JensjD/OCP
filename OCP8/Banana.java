public class Banana{
    public static void main(String[] args){
        String in = "1 a2 b 3 c4d 5e";
        String[] chunks = in.split(args[0]);

        System.out.println("count: "+chunks.length);
        for(String s : chunks)
            System.out.println(">"+s+"<");
    }
}

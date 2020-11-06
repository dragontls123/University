
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class server {
   public static String calc(String exp) {
      StringTokenizer st = new StringTokenizer(exp, " ");
      if (st.countTokens() != 3)
         return "error";
      String res = "";
      int op1 = Integer.parseInt(st.nextToken());
      String opcode = st.nextToken();
      int op2 = Integer.parseInt(st.nextToken());
      switch (opcode) {
      case "+":
         res = Integer.toString(op1 + op2);
         break;
      case "-":
         res = Integer.toString(op1 - op2);
         break;
      case "*":
         res = Integer.toString(op1 * op2);
         break;
      default:
         res = "error";
      }
      return res;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new FileReader("out.txt"));
      int op1 = (Integer) null;
      while (true) {
         String line = br.readLine();
         if (line == null)
            break;
         op1 = Integer.parseInt(line);
      }
      if (op1 == (Integer) null||br==null)
         op1 = 7777;
      
      BufferedReader in = null;
      BufferedWriter out = null;
      Socket socket = null;
      ServerSocket listener = null;
      try {
         listener = new ServerSocket(op1);// ���� ���� ����
         System.out.println("The capitalization server is running...");
         ExecutorService pool = Executors.newFixedThreadPool(20);
         while (true) {
            Socket sock = listener.accept();
            pool.execute(new Capitalizer(sock));

            System.out.println("������ ��ٸ��� �ֽ��ϴ�.....");
            socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
            System.out.println("����Ǿ����ϴ�.");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
               String inputMessage = in.readLine();
               if (inputMessage.equalsIgnoreCase("bye")) {
                  System.out.println("Ŭ���̾�Ʈ���� ������ �����Ͽ���");
                  break; // "bye"�� ������ ���� ����
               }
               System.out.println(inputMessage); // ���� �޽����� ȭ�鿡 ���
               String res = calc(inputMessage); // ���. ��� ����� res
               out.write(res + "\n"); // ��� ��� ���ڿ� ����
               out.flush();
            }
         }
      } catch (IOException e) {
         System.out.println(e.getMessage());
      } finally {
         try {
            if (socket != null)
               socket.close(); // ��ſ� ���� �ݱ�
            if (listener != null)
               listener.close(); // ���� ���� �ݱ�
         } catch (IOException e) {
            System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
         }
      }

      br.close();
   }

   private static class Capitalizer implements Runnable {
      private Socket socket;

      Capitalizer(Socket socket) {
         this.socket = socket;
      }

      @Override
      public void run() {
         System.out.println("Connected: " + socket);
         try {
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
            while (in.hasNextLine()) {
               out.println(in.nextLine().toUpperCase());
            }
         } catch (Exception e) {
            System.out.println("Error:" + socket);
         } finally {
            try {
               socket.close();
            } catch (IOException e) {
            }
            System.out.println("Closed: " + socket);
         }
      }
   }
}
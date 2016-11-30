public class Calculate {
        
        public static void main(String[] arg) {
                System.out.println("Calculate...");
                int first = int.valueOf(arg[0]);  
                int second = int.valueOf(arg[1]);  
                int third = int.valueOf(arg[2]);  
                int div = first + second + third;
                System.out.println("Sum " + div);
       }
}

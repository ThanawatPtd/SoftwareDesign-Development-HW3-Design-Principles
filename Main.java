public class Main {
    public static void main(String[] args) {
        Registration reg = new Registration();
        User thanawat = new User("ThanawatPtd", "1", "Thanawat.p@example.com", 21);

        if(reg.register(thanawat)){
            System.out.println("Registration Successful");
        }
    }
}

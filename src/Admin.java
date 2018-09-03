import java.util.*;

public class Admin extends User{
    private boolean verified = false;

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Admin(String name, String email, String password, Profile profile) {
        super(name, email, password, profile);
    }

    public static void acceptAdmin(ArrayList<User> users){
        Scanner input = new Scanner(System.in);

        for(User current :  users){
            if(current instanceof Admin){
                if(!((Admin)current).isVerified()){
                    User.showUser(current);
                    System.out.println("Deseja add esse usuario como admin? Sim ou nao");
                    if(input.nextLine().toLowerCase().equals("sim")){
                        ((Admin)current).setVerified(true);
                    }
                }
            }
        }
    }

    public static void checkContent(ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);

        for(Content current : contents){
            if(!current.isAccepted()){
                View.showContent(current);
                System.out.println("Aceitar o pedido? S ou N");
                String choice = input.nextLine().toLowerCase();

                if(choice.equals("s")){
                    current.setAccepted(true);
                    if(current.getSender() instanceof RealUser){
                        ((RealUser)current.getSender()).setPoints(calcularPontos(current));
                    }
                    current.getSender().getProfile().getSentContents().add(current);
                } else contents.remove(current);
            }
        }
    }

    public static int calcularPontos(Content content){
        //dar um jeito de calcular pontos com base no conteudo postado
        return 0;
    }
}
import java.util.*;

public class Admin extends User{
    ArrayList<Message> requests = new ArrayList<>(); // ainda ver se necessario

    public Admin(String name, String email, String password, Profile profile) {
        super(name, email, password, profile);
    }

    public static void acceptAdmin(){
        //add algo para difenrenciar
    }

    public static void checkContent(ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);

        for(Content current : contents){
            if(!current.isAccepted()){
                View.showContent(current);
                System.out.println("Aceitar o pedido? S ou N");
                String choice = input.nextLine();
                choice = choice.toLowerCase();

                if(choice.equals("s")){
                    current.setAccepted(true);
                    current.getSender().setPoints(calcularPontos(current));
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

import java.util.ArrayList;

public class View {
    public static void showHomeScreen(){
        System.out.println("1. Visualizar\n2. Cadastrar\n3. Login\n0. Fechar");
    }

    public static void showMainScreen(){
        System.out.println("1. Ver todos\n2. Pesquisar\n3. Cadastrar conteudo\n4. Criar parceira" +
                "\n5. Troca/Loja\n6. Editar perfil\n7. Recomendaçoes\n0. Sair");
    }

    public static void showAllContent(ArrayList<Content> contents){
        for(Content current : contents){
            if(current.isAccepted())
                showContent(current);
        }
    }

    public static void showContent(Content content){
            System.out.println("Name: " + content.getName() + "\nAuthor" +content.getAuthor()
                    + "\nSender: " + content.getSender() + "\nType: " +content.getType());

    }
}

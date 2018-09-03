import java.util.ArrayList;

public class View {
    public static void showHomeScreen(){
        System.out.println("1. Visualizar\n2. Cadastrar\n3. Login\n0. Fechar");
    }

    public static void showMainScreen(){
        System.out.println("1. Ver todos\n2. Pesquisar\n3. Cadastrar conteudo\n4. Troca/Loja" +
                "\n5. Editar perfil\n6. Recomendaçoes\n0. Sair");
    }

    public static void showAllContent(ArrayList<Content> contents){
        for(Content current : contents){
            if(current.isAccepted())
                showContent(current);
        }
    }

    public static void showContent(Content content){
        if(content.isExclusive()){
            System.out.println("Name: " + content.getName() + "\nAuthor: " + content.getAuthor()
                    + "\nSender: " + content.getSender().getName() + "\nType: " + content.getType()
                    + "\nCost: " + content.getCost());
        } else{
            System.out.println("Name: " + content.getName() + "\nAuthor: " + content.getAuthor()
                    + "\nSender: " + content.getSender().getName() + "\nType: " + content.getType());
        }

    }

    public static void showEdit(){
        System.out.println("1. Edit name\n2. Edit email\n3. Edit password\n4. Edit address\n" +
                "5. Edit Country\n6. Edit birthday\n7. Edit phone\n0. Back");
    }

    public static void showMainScreenAdmin(){
        System.out.println("1. Ver todos\n2. Pesquisar\n3. Cadastrar conteudo\n" +
                "4. Checar pedidos de cadastro de conteudo" +
                "\n5. Checar pedidos para ser admin\n6. Editar perfil\n0. Sair");
    }
}
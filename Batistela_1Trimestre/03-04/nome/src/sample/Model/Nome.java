package sample.Model;

public class Nome {

    //atributos
    private static String Nome;
    private static String dataNascimento;

    //getter e setters

    public String getNome() {
        return Nome;
    }

    public static void setNome(String nome) {
        Nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public static void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    //toString
    @Override
    public String toString() {
        return "Nome{" +
                "Nome='" + Nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}

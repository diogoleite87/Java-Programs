import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        Funcionario a = new Funcionario("a1234", "Steve Jobs");
        Funcionario b = new Funcionario("a1235", "Scott McNealy");
        Funcionario c = new Funcionario("a1236", "Jeff Bezos");
        Funcionario d = new Funcionario("a1237", "Larry Ellison");
        Funcionario e = new Funcionario("a1238", "Bill Gates");

        map.put(a.getId(), a.getNome());
        map.put(b.getId(), b.getNome());
        map.put(c.getId(), c.getNome());
        map.put(d.getId(), d.getNome());
        map.put(e.getId(), e.getNome());

        Set<String> chaves = map.keySet();

        // teste para recuperar funcionarios pelo seus respectivos IDs

        System.out.println("Contem a ID a1234: " + map.containsKey("a1234"));
        System.out.println("Contem a ID a1235: " + map.containsKey("a1235"));
        System.out.println("Contem a ID a1236: " + map.containsKey("a1236"));
        System.out.println("Contem a ID a1237: " + map.containsKey("a1237"));
        System.out.println("Contem a ID a1238: " + map.containsKey("a1238"));
        System.out.println("Contem a ID inexistente a9999: " + map.containsKey("a9999"));

        System.out.println("\n" + map.get("a1234"));
        System.out.println("\n" + map.get("a1235"));
        System.out.println("\n" + map.get("a1236"));
        System.out.println("\n" + map.get("a1237"));
        System.out.println("\n" + map.get("a1238"));
        System.out.println("\n" + map.get("a9999"));

        // impressao de todos os funcionarios
        for (String id : chaves) {
            System.out.println("ID: " + id + "\nNome: " + map.get(id) + "\n");
        }


        FuncionarioV2 a2 = new FuncionarioV2("Steve Jobs", "Padeiro", 1100.00);
        FuncionarioV2 b2 = new FuncionarioV2("Scott McNealy", "Vendedor Varejista", 1100);
        FuncionarioV2 c2 = new FuncionarioV2("Jeff Bezos", "Jogador de Ping-Pong", 149.90);
        FuncionarioV2 d2 = new FuncionarioV2("Larry Ellison", "Frentista", 1100);
        FuncionarioV2 e2 = new FuncionarioV2("Bill Gates", "Flanelinha", 700);

        Map<String, FuncionarioV2> mapV2 = new HashMap<>();

        mapV2.put("a1234", a2);
        mapV2.put("a1235", b2);
        mapV2.put("a1236", c2);
        mapV2.put("a1237", d2);
        mapV2.put("a1238", e2);

        Set<String> chavesV2 = map.keySet();

        // impressao de todos os funcionariosV2
        for (String id : chavesV2) {
            System.out.println("ID: " + id + mapV2.get(id) + "\n");
        }

        // usando a id corretamente
        pesquisaFuncionarioV2("a1234", mapV2);
        // usando a id em caixa alta
        pesquisaFuncionarioV2("A1234", mapV2);

    }

    public static void pesquisaFuncionarioV2 (String id, Map<String, FuncionarioV2> mapV2) {

        id = id.toLowerCase();
        System.out.println(mapV2.get(id));
    }


}

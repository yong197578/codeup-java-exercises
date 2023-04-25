public class ServerNameGenerator {
    private static String[] adj = {
            "clear", "clever",
            "cloudy", "clumsy", "colorful",
            "combative", "comfortable",
            "concerned", "condemned", "confused" };
    private static String[] noun = {
            "dog", "cat", "bird", "trash", "codeup", "method",
            "list", "movie", "photo", "person"
    };
    private static String getRandom(String[] adj, String[] noun){
        int adjIndex = (int) (Math.random() * adj.length);
        int nounIndex = (int) (Math.random() * noun.length);
        return adj[adjIndex] + "-" + noun[nounIndex];
    }
    private static String randomElement(String[] strings){
        int randomNumber = (int) (Math.random() * strings.length);
        return strings[randomNumber];
    }
    public static void main(String[] args) {
        ServerNameGenerator random = new ServerNameGenerator();
        String name = getRandom(random.adj, random.noun);
        String adjective = randomElement(adj);
        String nounRandom = randomElement(noun);

        System.out.println("Here is your server name: ");
        System.out.println(name);

        System.out.println("Server Name:");
        System.out.println(adjective + "-" + nounRandom);

    }
}

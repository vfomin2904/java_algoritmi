public class Application {

    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 6);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 9);
        graph.addEdge(9, 1);

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);

        System.out.println(bfp.hasPathTo(6));
        System.out.println(bfp.pathTo(6));
    }
}

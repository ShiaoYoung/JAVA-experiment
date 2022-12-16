public class Movies {
    public static void main(String[] args) {
        DVDCollection movies = new DVDCollection();

        movies.addDVD("电影1","导演1",2022,10,true);
        movies.addDVD("电影2","导演1",2022,10,true);
        movies.addDVD("电影3","导演1",2022,10,true);
        movies.addDVD("电影4","导演1",2022,10,true);
        movies.addDVD("电影5","导演1",2022,10,false);

        System.out.println(movies);
    }
}


    class Movie {
        private String name;

        public Movie(String name) {
            this.name = name;
        }

        public String plot() {
            return "No plot here";
        }
        public String getName() {
            return name;
        }
    }class  StarWars extends Movie {
        public StarWars() {
            super("StarWars");
        }

        @Override
        public String plot() {
            return "Starwar Story";
        }
    }


        class MazeRunner extends Movie {
            @Override
            public String plot() {
                return "Kids try and escape a maze";
            }

            public MazeRunner() {
                super("mazeRunner");

            }
        }
        class IndependenceDay extends Movie {

            public IndependenceDay() {
                super("independenceDay");
            }
            @Override
            public String plot() {
                return "Aliens attempt to take over planet earth";
            }
        }



    class Forgetable extends Movie{
        public Forgetable() {
            super("Forgetable");
        }
    }
    class Jaws extends Movie{
        public Jaws() {
            super("Jaws");
        }
        public String plot() {
            return "A shark eats a lot of people";
        }
    }




    public class Main {
        public static void main(String[] args) {
for (int i = 1; i<11; i++) {
    Movie movie = radnomMoive();
    System.out.println("Movie #" + i +":" + movie.getName() + "\n" +
            "Plot: " +movie.plot() +"\n");}
        }
        public static Movie radnomMoive(){
            int randomNumber = (int)(Math.random()*5) +1;
            System.out.println("Randome number generated was:" + randomNumber);
            switch (randomNumber){
                case 1:
                    return new Jaws();
                case 2:
                    return new IndependenceDay();
                case 3:
                    return new MazeRunner();
                case 4:
                    return new StarWars();
                case 5:
                    return new Forgetable();

            } return null;
        }
    }


